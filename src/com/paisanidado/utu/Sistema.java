package com.paisanidado.utu;

import java.util.List;
import java.util.Random;

// Clase Sistema --> Aquí comienza todo!
public class Sistema {
	public static void main(String[] args) {
		// Crear un país con ciudades
		Pais pais = new Pais("República Occidental de Debuguistán", new Random().nextInt(5) + 2); // Entre 2 y 6
																									// ciudades
		System.out.println("Bienvenidos a la " + pais.getNombre());
		// Mostrar la estructura

		System.out.println("Estructura del país: " + pais.getNombre());
		for (Ciudad ciudad : pais.getCiudades()) {
			System.out.println("  Ciudad: " + ciudad.getNombre());
			for (Edificio edificio : ciudad.getEdificios()) {
				System.out.println("    Edificio: " + edificio.getDireccion());
				for (Piso piso : edificio.getPisos()) {
					System.out.println("      Piso con " + piso.getApartamentos().size() + " apartamentos:");
					for (Apartamento apartamento : piso.getApartamentos()) {
						System.out.println(
								"        Apartamento con " + apartamento.getCantidadHabitantes() + " habitantes");
					}
				}
			}
		}

		List<Ciudad> ciudades = pais.getCiudades();

		for (int i = 0; i < ciudades.size(); i++) {
			Ciudad ciudad = ciudades.get(i);
			String nombreCiudad = ciudad.getNombre();
			List<Edificio> edificios = ciudad.getEdificios();

			int sumaEdificios = ciudad.getEdificios().size();
			int sumaPisosCiudad = 0;

			for (int j = 0; j < sumaEdificios; j++) {
				Edificio edificio = edificios.get(j);
				int cantidadPisosEdificio = edificio.getPisos().size();
				sumaPisosCiudad += cantidadPisosEdificio;
			}

			System.out.println(nombreCiudad + " tiene " + sumaEdificios + " edificios, totalizando " + sumaPisosCiudad
					+ " pisos.");

		}
	}
}