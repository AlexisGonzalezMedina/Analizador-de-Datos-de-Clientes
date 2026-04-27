package com.analizador.datos;

import java.util.ArrayList;
import java.util.List;

public class Contenedor<T extends Entidad> {
	
	private List<T> elementos = new ArrayList<>();
	
	public void agregar(T elemento) {
		elementos.add(elemento);
	}
	
	public List<T> getElementos(){
		return elementos;
	}

}
