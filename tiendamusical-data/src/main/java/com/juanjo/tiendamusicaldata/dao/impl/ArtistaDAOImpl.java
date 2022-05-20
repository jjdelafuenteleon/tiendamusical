/**
 * 
 */
package com.juanjo.tiendamusicaldata.dao.impl;

import java.util.List;

import com.juanjo.tiendamusicaldata.common.CommonDAO;
import com.juanjo.tiendamusicaldata.dao.ArtistaDAO;
import com.juanjo.tiendamusicalentities.dto.ArtistaAlbumDTO;
import com.juanjo.tiendamusicalentities.entities.Artista;

/**
 * @author Juanjo
 *
 */
public class ArtistaDAOImpl extends CommonDAO<Artista, ArtistaDAO> {

	public List<ArtistaAlbumDTO> consultarArtistaAlbunPorFiltro(String filtro){
		return this.repository.consultarArtistaAlbunPorFiltro(filtro);
	}
}
