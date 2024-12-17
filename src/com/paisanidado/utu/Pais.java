package com.paisanidado.utu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Clase País
class Pais {
	private static final String[] NOMBRES_CIUDADES = { "Villa Anidada", "Pueblo Poo", "Bitburgo", "Buclópolis",
			"Recursiva Oeste", "Paraje Excepción", "Balneario Overflow", "Database Sur", "Rio Compileton",
			"General Hashington" };
	private String nombre;
	private List<Ciudad> ciudades;

	public Pais(String nombre, int cantidadCiudades) {
		this.nombre = nombre;
		ciudades = new ArrayList<>();
		Random random = new Random();
		List<String> nombresDisponibles = new ArrayList<>(List.of(NOMBRES_CIUDADES));
		for (int i = 0; i < cantidadCiudades; i++) {
			String nombreCiudad = nombresDisponibles.remove(random.nextInt(nombresDisponibles.size()));

			int edificios = random.nextInt(6) + 2; // Entre 2 y 6 edificios
			ciudades.add(new Ciudad(nombreCiudad, edificios));
		}
	}

	public List<Ciudad> getCiudades() {
		return ciudades;
	}

	public String getNombre() {
		return nombre;
	}
}