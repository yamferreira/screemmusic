package com.yam.screemmusic.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameMusic;
    private String category;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;

    public Music() {
    }

    public Music(Long id, String nameMusic, String category, Artist artist) {
        this.id = id;
        this.nameMusic = nameMusic;
        this.category = category;
        this.artist = artist;
    }

    public Long getId() {
        return id;
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public void setNameMusic(String nameMusic) {
        this.nameMusic = nameMusic;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String type) {
        this.category = type;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
