package net.itinajero.musicapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.itinajero.musicapi.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}
