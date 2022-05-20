/**
 * 
 */
package com.juanjo.tiendamusicalservices.service;

import java.util.List;

import com.juanjo.tiendamusicalentities.dto.ArtistaAlbumDTO;

/**
 * @author Juanjo
 *
 */
public interface HomeServices {
	
	List<ArtistaAlbumDTO> consultarAlbunsFiltro(String filtro);

}
