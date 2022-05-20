/**
 * 
 */
package com.juanjo.tiendamusicalentities.dto;

import com.juanjo.tiendamusicalentities.entities.Album;
import com.juanjo.tiendamusicalentities.entities.Artista;

/**
 * @author Juanjo
 *
 */
public class ArtistaAlbumDTO {
	
	private Artista artista;
	
	private Album album;
	
	public ArtistaAlbumDTO() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public ArtistaAlbumDTO(Album album, Artista artista) {
		this.album = album;
		this.artista = artista;
	}

	/**
	 * @return the artista
	 */
	public Artista getArtista() {
		return artista;
	}

	/**
	 * @param artista the artista to set
	 */
	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	/**
	 * @return the albun
	 */
	public Album getAlbum() {
		return album;
	}

	/**
	 * @param albun the albun to set
	 */
	public void setAlbun(Album album) {
		this.album = album;
	}
}
