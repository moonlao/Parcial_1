package controller;

import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Collections;
import java.util.LinkedList;

import model.Datos;
import model.Modelo;
import processing.core.PApplet;
import view.Interfaz;

public class Control extends PApplet {

	private Modelo modelo;
	private Interfaz interfaz;
	private PrintWriter p;
	private String[] txt1;
	private String[] txt2;

	public Control() {
		super();

		// p = new PrintWriter(null);
	}

	public void keyPressed() {
		switch (key) {

		case 'n':

			imprimir(modelo.ordenarPorNombre(),'n');

			break;
		case 'r':

			imprimir(modelo.ordenarPorRaza(), 'r');

			break;
		case 'f':

			imprimir(modelo.ordenarPorFecha(), 'f');

			break;
		case 'i':

			imprimir(modelo.ordenarPorID(), 'i');

			break;

		}
	}

	public void imprimir(String[] b, char a) {

		if (a == 'n') {

			saveStrings("nombre.txt", b);
		}
		if (a == 'r') {

			saveStrings("raza.txt", b);
		}
		if (a == 'f') {

			saveStrings("fecha.txt", b);
		}
		if (a == 'i') {

			saveStrings("id.txt", b);
		}
	}

	public static void main(String[] args) {
		PApplet.main(Control.class.getName());
	}

	public void settings() {
		size(1000, 1000);

	}

	public void setup() {
		txt1 = loadStrings("./data/imports/TXT1");
		txt2 = loadStrings("./data/imports/TXT2");
		
		interfaz = new Interfaz(this);
		modelo = new Modelo(txt1, txt2);
		try {
			modelo.readTXT();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void draw() {

		interfaz.pintar(modelo);

		fill(255);
		textSize(15);
		text("Presiona la tecla N para ordenar por Nombre", 50, 600);
		text("Presiona la tecla R para ordenar por Raza", 50, 620);
		text("Presiona la tecla F para ordenar por Fecha de nacimiento", 50, 640);
		text("Presiona la tecla I para ordenar por ID", 50, 660);
	}

}
