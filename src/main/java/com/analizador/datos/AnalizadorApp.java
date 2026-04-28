package com.analizador.datos;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnalizadorApp {
	
	public static void main(String[] args) {
		
		Contenedor<Cliente> almacen = new Contenedor<>();
		
		almacen.agregar(new Cliente("1", "Andrea Jimenez", Arrays.asList("Desarrolladora Movil"), LocalDate.now()));
		almacen.agregar(new Cliente("2", "Ruben Martinez", Arrays.asList("Desarrolladora Movil"), LocalDate.now()));
		almacen.agregar(new Cliente("1", "Andrea Jimenez", Arrays.asList("Desarrolladora Movil"), LocalDate.now()));
		almacen.agregar(new Cliente("3", "Juan Arenas", Arrays.asList("Desarrollador Software"), LocalDate.now()));
		almacen.agregar(new Cliente("4", "Jessica Flores", Arrays.asList("Desarrolladora web"), LocalDate.now()));
		almacen.agregar(new Cliente("3", "Juan Arenas", Arrays.asList("Desarrollador Software"), LocalDate.now()));
		almacen.agregar(new Cliente("5", "Mari Zamora", Arrays.asList("Desarrolladora web"), LocalDate.now()));
		
		List<Cliente> resultado = almacen.getElementos().stream()
				.flatMap(c -> Stream.of(c))
				.distinct()
				.sorted((c1, c2) -> c1.getFechaRegistro().compareTo(c2.getFechaRegistro()))
				.collect(Collectors.toList());
		
		
		
		Consumer<Cliente> miReporte = c -> {
			String nombreFinal = c.getNombre().orElse("Sin Registro");
			String etiquetaFinal = String.join(" ", c.getEtiquetas());
			System.out.println("ID: " + c.getId() + " | " + nombreFinal + " - " + etiquetaFinal);
		};
		
		System.out.println("Analisis Completado");
		resultado.forEach(miReporte);
	}

}
