/**
 * 
 */
package com.juanjo.tiendamusicaldata.dao.impl;

import com.juanjo.tiendamusicaldata.common.CommonDAO;
import com.juanjo.tiendamusicaldata.dao.PersonaDAO;
import com.juanjo.tiendamusicalentities.entities.Persona;

/**
 * @author Juanjo
 * Clase que implementa el CRUD Generico y las funciones de la interface PErsonaDAO
 */
public class PersonaDAOImpl extends CommonDAO<Persona, PersonaDAO>{
	/**
	 * Metodo que permite consultar un persona por su usurio y contraseña
	 * @param usuario {@link String} 
	 * @param password {@link String}
	 * @return {@link Persona}
	 */
	private Persona	findUsuarioAndPasword(String usuario, String password) {
		return this.repository.findByUsuarioAndPassword(usuario, password);
	}

}
