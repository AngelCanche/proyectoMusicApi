package net.itinajero.musicapi.service;

import java.util.List;

import net.itinajero.musicapi.entity.Album;

public interface IAlbumsService {

	List<Album> buscarTodos();
	void guardar(Album album);
	void eliminar(int idAlbum);
}
