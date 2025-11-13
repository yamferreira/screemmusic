package com.yam.screemmusic.repository;

import com.yam.screemmusic.entity.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepository extends JpaRepository<Music, Long> {
}
