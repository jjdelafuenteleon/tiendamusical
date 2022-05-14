/**
 * 
 */
package com.juanjo.tiendamusicalweb.utils;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
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
	
}
