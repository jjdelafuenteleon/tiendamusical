/**
 * 
 */
package com.juanjo.tiendamusicalweb.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.juanjo.tiendamusicalentities.dto.ArtistaAlbumDTO;
import com.juanjo.tiendamusicalservices.service.HomeServices;

/**
 * @author Juanjo
 *
 */
@ManagedBean
@ViewScoped
public class HomeController {

	private String filtro;
	
	public List<ArtistaAlbumDTO> artistasAlbumDTO;
	
	/**
	 * Se inyecta el objeto de spring con jsf para obtener los metodos de logica de negocio del home.
	 */
	@ManagedProperty("#{homeServicesImpl}")
	private HomeServices homeServicesImpl;
	
	@PostConstruct
	public void init() {
		System.out.println("HomeController.init(Inicializando Home)");
	}
	
	public void consultarAlbunsArtistasPorFiltro() {//consultarAlbunsArtistaPorFiltro
		this.artistasAlbumDTO = this.homeServicesImpl.consultarAlbunsFiltro(this.filtro);
		if (this.artistasAlbumDTO != null) {
			this.artistasAlbumDTO.forEach(artistaAlbunDTO -> {
				System.out.println("Artista: " + artistaAlbunDTO.getArtista().getNombre());
			});
		}
	}

	/**
	 * @return the filtro
	 */
	public String getFiltro() {
		return filtro;
	}

	/**
	 * @param filtro the filtro to set
	 */
	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}

	
	
	/**
	 * @return the artistasAlbumDTO
	 */
	public List<ArtistaAlbumDTO> getArtistasAlbumDTO() {
		return artistasAlbumDTO;
	}

	/**
	 * @param artistasAlbumDTO the artistasAlbumDTO to set
	 */
	public void setArtistasAlbumDTO(List<ArtistaAlbumDTO> artistasAlbumDTO) {
		this.artistasAlbumDTO = artistasAlbumDTO;
	}

	/**
	 * @return the homeServicesImpl
	 */
	public HomeServices getHomeServicesImpl() {
		return homeServicesImpl;
	}

	/**
	 * @param homeServicesImpl the homeServicesImpl to set
	 */
	public void setHomeServicesImpl(HomeServices homeServicesImpl) {
		this.homeServicesImpl = homeServicesImpl;
	}

	
}
