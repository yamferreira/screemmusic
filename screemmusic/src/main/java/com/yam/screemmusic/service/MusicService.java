package com.yam.screemmusic.service;

import com.yam.screemmusic.entity.Music;
import com.yam.screemmusic.repository.MusicRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MusicService {

    private final MusicRepository repository;

    public MusicService(MusicRepository repository) {
        this.repository = repository;
    }

    public void registerMusic(Music music) {
        if (music.getNameMusic().isBlank()) {
            System.out.println("O nome não pode ser vazio");
            return;
        }

        if (music.getCategory().isBlank()) {
            System.out.println("Digite o genero da musica");
            return;
        }
        repository.save(music);

        System.out.println("Musica " + music.getNameMusic() + " cadastrada com sucesso");
    }

    public List<Music> getAllMusic() {

        return repository.findAll().stream()
                .sorted(Comparator.comparing(Music::getNameMusic))
                .collect(Collectors.toList());

    }
}
