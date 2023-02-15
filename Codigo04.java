package com.generation;

import java.util.Scanner;

public class Codigo04 {

	// se agrego main
	public static void main(String[] args) {
		// se importo scanner
		// se ingreso system.in en la instancia de scanner para leer la consola
		Scanner s = new Scanner(System.in);

		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = s.nextLine();

		// se cambio jugardor 1 por el 2
		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		// se ingreso system.in en la instancia de scanner para leer la consola
		// Scanner s2 = new Scanner(System.in);
		String j2 = s.nextLine();

		// se elimino ( de mas en condicion if
		// se cambio el operador == por .equals para comparar
		if (j1.equals(j2)) {
			System.out.println("Empate");
		} else {
			int g = 2;
			switch (j1) {
			case "piedra":
				//se agrego otro switch para j2 papel 
				//ya que si ponias j1 piedra y j2 papel ganaba j1
				switch (j2) {
				case "tijeras":
					g = 1;
					break;
				case "papel":
					g = 2;
					break;
				}

				// se agrego el break para terminar el switch
				break;

			case "papel":
				// se cambio el operador == por .equals para comparar
				if (j2.equals("piedra")) {
					g = 1;

					// se agrego llave faltante en if
					break;
				}
				// se agrego la s a tijeras
			case "tijeras":
				// se cambio el operador == por .equals para comparar
				if (j2.equals("papel")) {
					g = 1;

					// se agrego llave faltante en if
					break;
				}
				break;
			default:
			}
			System.out.println("Gana el jugador " + g);
		}
	}

}

//este codigo realiza una comparacion para jugar piedra,papel o tijera
