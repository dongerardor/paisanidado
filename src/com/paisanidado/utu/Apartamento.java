package com.paisanidado.utu;

import java.util.ArrayList;
import java.util.List;

// Clase Apartamento
class Apartamento {
	private List<Habitante> habitantes;

	public Apartamento(int cantidadHabitantes) {
		habitantes = new ArrayList<>();
		for (int i = 0; i < cantidadHabitantes; i++) {
			habitantes.add(new Habitante("Habitante " + (i + 1)));
		}
	}

	public int getCantidadHabitantes() {
		return habitantes.size();
	}
}