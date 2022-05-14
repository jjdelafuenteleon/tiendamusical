/**
 * 
 */
package com.juanjo.tiendamusicaldata.common;


import java.util.List;

import org.hibernate.tool.schema.spi.ScriptTargetOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Juanjo
 * E - Entidad a utilizar en el CRUD
 * R - Repositorio a utilizar de JPA para ejecutar el CRUD
 */
public class CommonDAO<E, R extends PagingAndSortingRepository<E, Long>> {
	@Autowired
	protected R repository;
	
	/**
	 * Consulta una lista de datos paginable de una entidad
	 * @param desde {@link Integer} inicio del paginado
	 * @param hasta {@link Integer} limite del paginado
	 * @param orderBy {@link String} indica el campo para ordenar los registros
	 * @return {@link List} lista con los datos paginados
	 */
	private List<E> consultaListaPaginable(int desde, int hasta, String orderBy) {
		Pageable pageable = PageRequest.of(desde, hasta, Sort.by(orderBy));
		Page<E> page = this.repository.findAll(pageable);
		return page.getContent();
	}
	
	/**
	 * Metodo que permite persistir la informacion de cualquier entidad
	 * @param e {@link Object} objeto o entidad a persistir
	 * @return {@link Object} objeto recuperado despues de persistir el registro
	 */
	public E guardar(E e) {
		return this.repository.save(e);
	}
	/**
	 * Metodo que permite actualizar la informacion de cualquier entidad
	 * @param e {@link Object} objeto o entidad a actualizar
	 * @return {@link Object} objeto recuperado despues de actualizar el registro
	 */
	public E actualizar(E e) {
		return this.repository.save(e);
	}
	/**
	 * Metodo que permite eliminar la informacion de cualquier entidad
	 * @param e {@link Object} objeto o entidad a persistir
	 */
	public void eliminar(E e) {
		this.repository.delete(e);
	}

}
