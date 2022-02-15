package org.iesalandalus.programacion.reservasaulas;

import org.iesalandalus.programacion.reservasaulas.MVC.controlador.Controlador;
import org.iesalandalus.programacion.reservasaulas.MVC.modelo.Modelo;
import org.iesalandalus.programacion.reservasaulas.MVC.vista.Vista;

//@author: Pedro Patricio Cárdenas Figueroa
// I.E.S Al-Andalús, Almería
// Tarea Online 5
// Programación DAM 21-22

public class MainApp {

	public static void main(String[] args) {
		System.out.println("Programa para la gestión de reservas de espacios del IES Al-Ándalus");
		Modelo modelo= new Modelo();
		Vista vista= new Vista();
		Controlador controlador= new Controlador(modelo, vista);
		controlador.comenzar();
	
	
	}

}
