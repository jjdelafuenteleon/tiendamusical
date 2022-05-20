/**
 * 
 */
package com.juanjo.tiendamusicalweb.session;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.juanjo.tiendamusicalweb.utils.CommonUtils;

/**
 * @author Juanjo
 * cerrar la sesion de usuario
 */
@ManagedBean
@ViewScoped
public class SessionClosed {

	public void cerrarSesion() {
		// TODO Auto-generated method stub
		try {
			FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
			CommonUtils.redireccionar("/login.xhtml");
		} catch (Exception e) {
			CommonUtils.mostrarMensaje(FacesMessage.SEVERITY_ERROR, "!Ups¡", "Error al redireccionar al login!!");
			e.printStackTrace();
		}
	}
}
