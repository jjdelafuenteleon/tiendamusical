/**
 * 
 */
package com.juanjo.tiendamusicalweb.controller;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.juanjo.tiendamusicalentities.entities.Persona;
import com.juanjo.tiendamusicalservices.service.LoginService;
import com.juanjo.tiendamusicalweb.utils.CommonUtils;



/**
 * @author Juanjo
 *
 */
@ManagedBean
@ViewScoped
public class LoginController {
	
	private String usuario;
	
	private String password;
	
	/**
	 * Propiedad de la logica de negocio inyectada con JSF y Spring.
	 */
	@ManagedProperty("#{loginServiceImpl}")
	private LoginService loginServiceImpl;
	
	@PostConstruct
	public void init() {
		System.out.println("LoginController.init(Inicializando Login)");
	}
	
	/**
	 * metodo par aingrezar a la pantalla de home
	 */
	public void entrar() {
		Persona personaConsultada = this.loginServiceImpl.consultarUsuarioLogin(this.usuario, this.password);
		
		if (personaConsultada != null) {
			CommonUtils.mostrarMensaje(FacesMessage.SEVERITY_INFO, "Exitoso!", "Bienvenido al Home.");
		}else {
			CommonUtils.mostrarMensaje(FacesMessage.SEVERITY_ERROR, "Error!", "Usuario o contraseña incorrectas.");
		}
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the loginServiceImpl
	 */
	public LoginService getLoginServiceImpl() {
		return loginServiceImpl;
	}

	/**
	 * @param loginServiceImpl the loginServiceImpl to set
	 */
	public void setLoginServiceImpl(LoginService loginServiceImpl) {
		this.loginServiceImpl = loginServiceImpl;
	}

	
}
