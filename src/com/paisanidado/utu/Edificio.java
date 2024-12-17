package com.paisanidado.utu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Clase Edificio
class Edificio {
	private String direccion;
	private List<Piso> pisos;

	public Edificio(String direccion, int cantidadPisos) {
		this.direccion = direccion;
		pisos = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < cantidadPisos; i++) {
			int apartamentos = random.nextInt(11) + 1; // Entre 1 y 10 apartamentos
			pisos.add(new Piso(apartamentos));
		}
	}

	public String getDireccion() {
		return direccion;
	}

	public List<Piso> getPisos() {
		return pisos;
	}
}