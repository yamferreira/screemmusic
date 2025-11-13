package com.yam.screemmusic.repository;

import com.yam.screemmusic.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {

}
