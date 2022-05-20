/**
 * 
 */
package com.juanjo.tiendamusicalservices.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juanjo.tiendamusicaldata.dao.ArtistaDAO;
import com.juanjo.tiendamusicalentities.dto.ArtistaAlbumDTO;
import com.juanjo.tiendamusicalentities.entities.Persona;
import com.juanjo.tiendamusicalservices.service.HomeServices;

/**
 * @author Juanjo
 *
 */
@Service
public class HomeServicesImpl implements HomeServices {

	@Autowired
	private ArtistaDAO artistaDAOImpl;

	@Override
	public List<ArtistaAlbumDTO> consultarAlbunsFiltro(String filtro) {
		return this.artistaDAOImpl.consultarArtistaAlbunPorFiltro(filtro);
	}
	
	
}
