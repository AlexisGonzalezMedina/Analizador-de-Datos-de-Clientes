package com.analizador.datos;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Cliente implements Entidad {
	
	private String id;
	private String nombre;
	private List<String> etiquetas;
	private LocalDate fechaRegistro;
	
	public Cliente(String id, String nombre, List<String> etiquetas, LocalDate fechaRegistro) {
		this.id = id;
		this.nombre = nombre;
		this.etiquetas = etiquetas;
		this.fechaRegistro = fechaRegistro;
	}
	
	@Override
	public String getId() {
		return id;
	}

	
	public Optional<String> getNombre() {
		return Optional.ofNullable(nombre);
	}

	public List<String> getEtiquetas() {
		return etiquetas;
	}

	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Cliente cliente = (Cliente) o;
		return Objects.equals(id, cliente.id);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	
	

}
