/**
 * 
 */
package com.juanjo.tiendamusicalweb.session;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.juanjo.tiendamusicalentities.entities.Persona;

/**
 * @author Juanjo
 * MAntiene en sesion la informamcion en session
 */
@ManagedBean
@SessionScoped
public class SessionBean {
	
	/**
	 * objeto persona que se mantiene en la sesion
	 */
	private Persona persona;
	
	@PostConstruct
	private void init() {
		System.out.println("SessionBean.init(Creando sesion)");

	}
	
	/**
	 * @return the persona
	 */
	public Persona getPersona() {
		return persona;
	}

	/**
	 * @param persona the persona to set
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}



}
