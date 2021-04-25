package model;

import processing.core.PApplet;
import processing.core.PImage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;

public class Modelo {

	private String[] txt1;
	private String[] txt2;
	private String[] datos;
	private String[] datos2;
	String[] guardarID;
	String[] guardarNombre;
	String[] guardarRaza;
	String[] guardarFecha;

	private LinkedList<Datos> list;

	private SortNombre sNombre;
	private SortFecha sFecha;
	private SortRaza sRaza;

	public Modelo(String[] txt1, String[] txt2) {
		super();
		this.txt1 = txt1;
		this.txt2 = txt2;
		this.list = new LinkedList<Datos>();
		guardarID = new String[5];
		guardarNombre = new String[5];
		guardarFecha = new String[5];
		guardarRaza = new String[5];
		sNombre = new SortNombre();
		sFecha = new SortFecha();
		sRaza = new SortRaza();
	}

	public String[] getTxt1() {
		return txt1;
	}

	public void setTxt1(String[] txt1) {
		this.txt1 = txt1;
	}

	public String[] getTxt2() {
		return txt2;
	}

	public void setTxt2(String[] txt2) {
		this.txt2 = txt2;
	}

	public String[] getDatos() {
		return datos;
	}

	public void setDatos(String[] datos) {
		this.datos = datos;
	}

	public String[] getDatos2() {
		return datos2;
	}

	public void setDatos2(String[] datos2) {
		this.datos2 = datos2;
	}

	public String[] getGuardarID() {
		return guardarID;
	}

	public void setGuardarID(String[] guardarID) {
		this.guardarID = guardarID;
	}

	public String[] getGuardarNombre() {
		return guardarNombre;
	}

	public void setGuardarNombre(String[] guardarNombre) {
		this.guardarNombre = guardarNombre;
	}

	public String[] getGuardarRaza() {
		return guardarRaza;
	}

	public void setGuardarRaza(String[] guardarRaza) {
		this.guardarRaza = guardarRaza;
	}

	public String[] getGuardarFecha() {
		return guardarFecha;
	}

	public void setGuardarFecha(String[] guardarFecha) {
		this.guardarFecha = guardarFecha;
	}

	public LinkedList<Datos> getList() {
		return list;
	}

	public void setList(LinkedList<Datos> list) {
		this.list = list;
	}

	public SortNombre getsNombre() {
		return sNombre;
	}

	public void setsNombre(SortNombre sNombre) {
		this.sNombre = sNombre;
	}

	public SortFecha getsFecha() {
		return sFecha;
	}

	public void setsFecha(SortFecha sFecha) {
		this.sFecha = sFecha;
	}

	public SortRaza getsRaza() {
		return sRaza;
	}

	public void setsRaza(SortRaza sRaza) {
		this.sRaza = sRaza;
	}

	public void readTXT() throws ParseException {
		for (int i = 0; i < txt1.length; i++) {
			datos = txt1[i].split(" ");
			//System.out.println("i" + i + " txt2 " + txt2[i]);
			for (int j = 0; j < txt2.length; j++) {
				datos2 = txt2[j].split(" ");
			//	System.out.println("j" + j + " txt2 " + txt2[j]);
				if (Integer.parseInt(datos[0]) == Integer.parseInt(datos2[0])) {
					Datos a = new Datos(Integer.parseInt(datos[0]), datos[1], datos2[1], datos2[2]);
					list.add(a);
					//System.out.println(a.getNombre());
				}
			}
		}

	}

	public String[] ordenarPorID() {
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {

			String name = list.get(i).getNombre().toLowerCase();
			String date = list.get(i).getFecha().toString();
			String id = Integer.toString(list.get(i).getId());
			String raza = list.get(i).getRaza().toLowerCase();

			String element = id + "," + name + "," + raza + "," + date;

			guardarID[i] = element;

		}
		return guardarID;
	}

	public String[] ordenarPorNombre() {
		Collections.sort(list, sNombre);
		for (int i = 0; i < list.size(); i++) {

			String name = list.get(i).getNombre().toLowerCase();
			String date = list.get(i).getFecha().toString();
			String id = Integer.toString(list.get(i).getId());
			String raza = list.get(i).getRaza().toLowerCase();

			String element = id + "," + name + "," + raza + "," + date;

			guardarNombre[i] = element;

		}
		return guardarNombre;
	}

	public String[] ordenarPorRaza() {
		Collections.sort(list, sRaza);
		for (int i = 0; i < list.size(); i++) {

			String name = list.get(i).getNombre().toLowerCase();
			String date = list.get(i).getFecha().toString();
			String id = Integer.toString(list.get(i).getId());
			String raza = list.get(i).getRaza().toLowerCase();

			String element = id + "," + name + "," + raza + "," + date;

			guardarRaza[i] = element;

		}
		return guardarRaza;
	}

	public String[] ordenarPorFecha() {
		Collections.sort(list, sFecha);
		for (int i = 0; i < list.size(); i++) {

			String name = list.get(i).getNombre().toLowerCase();
			String date = list.get(i).getFecha().toString();
			String id = Integer.toString(list.get(i).getId());
			String raza = list.get(i).getRaza().toLowerCase();

			String element = id + "," + name + "," + raza + "," + date;

			guardarFecha[i] = element;

		}
		return guardarFecha;
	}

}
