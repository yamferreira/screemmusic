package com.yam.screemmusic.service;

import com.yam.screemmusic.entity.Artist;
import com.yam.screemmusic.repository.ArtistRepository;


public class ArtistService {

    private final ArtistRepository repository;


    public ArtistService(ArtistRepository repository) {
        this.repository = repository;
    }

    public void registerArtist(Artist artist) {
        if (artist.getName().isBlank()) {
            System.out.println("O nome não pode estar vazio");
            return;
        }

        if (artist.getType().isBlank()) {
            System.out.println("O tipo não pode estar vazio");
            return;
        }
        String type = artist.getType().toLowerCase();
        if (!type.equals("solo") && !type.equals("dupla") && !type.equals("banda")) {
            System.out.println("Tipo Invalido! Digite solo, dupla ou banda");
            return;
        }

        repository.save(artist);

        System.out.println("Artista " + artist.getName() +" cadastrado com sucesso!");
    }
}
