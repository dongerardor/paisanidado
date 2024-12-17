package com.paisanidado.utu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Clase Ciudad
class Ciudad {
	private String nombre;
	private List<Edificio> edificios;

	public Ciudad(String nombre, int cantidadEdificios) {
		this.nombre = nombre;
		edificios = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < cantidadEdificios; i++) {
			int pisos = random.nextInt(10) + 1; // Entre 1 y 10 pisos
			edificios.add(new Edificio("Edificio " + (i + 1), pisos));
		}
	}

	public List<Edificio> getEdificios() {
		return edificios;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return this.nombre;
	}
}