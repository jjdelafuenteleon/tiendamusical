/**
 * 
 */
package com.juanjo.tiendamusicalweb.utils;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author Juanjo
 * clase generada para generar funciones generales del proyecto
 */
public class CommonUtils {

	/**
	 * Metodo ue permite nostrar un mensaje al usuario
	 * @param severity {@link Severity} objeto que indica el tipo de mensaje a mostrar
	 * @param summary {@link String} título del mensaje
	 * @param detail {@link String} detalle del mensaje
	 */
	public static void mostrarMensaje(Severity severity, String summary, String detail) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, summary, detail));		
	}
	
	/***
	 * metodo para redireccionar en pantallas del sistema
	 * @param url
	 * @throws IOException
	 */
	public static void redireccionar(String url) throws IOException {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		String contextPath = externalContext.getRequestContextPath();
		externalContext.redirect(contextPath + url);
	}
	
}
