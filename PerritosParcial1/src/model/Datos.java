package model;

import java.util.Comparator;
import java.util.Date;

import processing.core.PApplet;
import processing.core.PImage;

public class Datos implements Comparable<Datos> {



	private String fecha;
	private String raza;
	private String nombre;
	private int id;

	public Datos(int id, String nombre, String raza, String fecha) {

		this.nombre = nombre;
		this.raza = raza;
		this.fecha = fecha;
		
		this.id = id;

	}


	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public int compareTo(Datos o) {
		return this.id - o.getId();
	}

	public int compareToFecha(Datos o) {
		return this.fecha.compareTo(o.getFecha());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
