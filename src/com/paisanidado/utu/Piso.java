package com.paisanidado.utu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Clase Piso
class Piso {
	private List<Apartamento> apartamentos;

	public Piso(int cantidadApartamentos) {
		apartamentos = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < cantidadApartamentos; i++) {
			int habitantes = random.nextInt(7); // Entre 0 y 6 habitantes
			apartamentos.add(new Apartamento(habitantes));
		}
	}

	public List<Apartamento> getApartamentos() {
		return apartamentos;
	}
}