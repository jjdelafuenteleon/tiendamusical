/**
 * 
 */
package com.juanjo.tiendamusicalservices.service;

import com.juanjo.tiendamusicalentities.entities.Persona;

/**
 * @author Juanjo
 * Logica de negocio para el inicio de sesion
 */
public interface LoginService {
	
	/**
	 * Consulta usuario	que inicia session
	 * @param usuario
	 * @param password
	 * @return
	 */
	Persona consultarUsuarioLogin(String usuario, String password);

}
