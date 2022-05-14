/**
 * 
 */
package com.juanjo.tiendamusicaldata.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.juanjo.tiendamusicalentities.entities.Persona;

/**
 * @author Juanjo
 * DAO Persona
 */
public interface PersonaDAO extends PagingAndSortingRepository<Persona, Long>{
	
	/**
	 * Metodo que consulta al usuario que inicia sesion
	 * @param usuario {@link String} Usuario que inicia session
	 * @param password {@link String} Contraseña del usuario que inicia session
	 * @return {@link} objeto de la persona que inicia session
	 */
	@Query("SELECT p FROM Persona p WHERE p.usuario = ?1 AND p.password = ?2")
	Persona findByUsuarioAndPassword(String usuario, String password);

}
