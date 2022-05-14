/**
 * 
 */
package com.juanjo.tiendamusicalservices.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juanjo.tiendamusicaldata.dao.PersonaDAO;
import com.juanjo.tiendamusicalentities.entities.Persona;
import com.juanjo.tiendamusicalservices.service.LoginService;

/**
 * @author Juanjo
 *
 */
@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private PersonaDAO personaDAOImpl;

	@Override
	public Persona consultarUsuarioLogin(String usuario, String password) {
		return this.personaDAOImpl.findByUsuarioAndPassword(usuario, password);
	}

}
