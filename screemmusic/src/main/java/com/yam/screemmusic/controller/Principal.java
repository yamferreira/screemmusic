package com.yam.screemmusic.controller;

import com.yam.screemmusic.entity.Artist;
import com.yam.screemmusic.repository.ArtistRepository;
import com.yam.screemmusic.service.ArtistService;

import java.util.Scanner;

public class Principal {
    Scanner scanner = new Scanner(System.in);

    private ArtistRepository repository;

    ArtistService artistService = new ArtistService(repository);

    public void showMenu() {
        var option = -1;
        while(option != 0) {
            var menu = """
                    1 - Cadastrar artista
                    2 - Cadastrar musica
                    3 - Listar musica
                    4 - Buscar musica por artista
                    5 - Pesquisar dados sobre um artista
                    
                    0 - Sair
                    """;
            System.out.println(menu);
            option = scanner.nextInt();
            scanner.nextLine();
        }

        switch (option){
            case 1 :
                registerArtist();
                break;
            case 2 :
                registerMusic();
                break;
            case 3 :
                listMusic();
                break;
            case 4 :
                searchMusicByArtist();
                break;
            case 5 :
                searchDataAboutArtist();
                break;
            case 0 :
                System.out.println("Saindo");
                break;
            default:
                System.out.println("Opção invalida");
        }


    }

    private void registerArtist() {
        System.out.println("Informe o nome do artista");
        var nameArtist = scanner.nextLine();
        System.out.println("Informe o tipo do artista(solo, duola, banda)");
        var typeArtist = scanner.nextLine();
        Artist artist = new Artist();
        artist.setName(nameArtist);
        artist.setType(typeArtist);
        artistService.registerArtist(artist);
        System.out.println();
    }

    private void registerMusic() {
        System.out.println("Digite o nome da musica que quer cadastrar");
    }
}
