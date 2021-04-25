package view;

import java.util.LinkedList;

import controller.Control;
import model.Datos;
import model.Modelo;
import processing.core.PApplet;
import processing.core.PImage;

public class Interfaz {

	private PApplet app;

	public Interfaz(PApplet app) {
		super();
		this.app = app;
	}

	public void pintar(Modelo b) {
		LinkedList<Datos> a = b.getList();

		if (a.get(0).getNombre().equals("Martina")) {
			PImage perfiles = app.loadImage("./data/imports/" + a.get(0).getNombre() + ".jpeg");
			app.image(perfiles, 20, 20, 100, 100);
			app.textSize(15);
			app.text(a.get(0).getNombre(), 20, 220);
			app.text(a.get(0).getRaza(), 20, 240);
			app.text(a.get(0).getFecha(), 20, 280);
			app.text(a.get(0).getId(), 20, 300);
		}
		if (a.get(1).getNombre().equals("Kaiser")) {
			PImage perfiles = app.loadImage("./data/imports/" + a.get(1).getNombre() + ".jpeg");
			app.image(perfiles, 150, 20, 100, 100);
			app.textSize(15);
			app.text(a.get(1).getNombre(), 160, 220);
			app.text(a.get(1).getRaza(), 160, 240);
			app.text(a.get(1).getFecha(), 160, 280);
			app.text(a.get(1).getId(), 160, 300);
		}
		if (a.get(2).getNombre().equals("Heisenberg")) {
			PImage perfiles = app.loadImage("./data/imports/" + a.get(2).getNombre() + ".jpeg");
			app.image(perfiles, 280, 20, 100, 100);
			app.textSize(15);
			app.text(a.get(2).getNombre(), 300, 220);
			app.text(a.get(2).getRaza(), 300, 240);
			app.text(a.get(2).getFecha(), 300, 280);
			app.text(a.get(2).getId(), 300, 300);
		}
		if (a.get(3).getNombre().equals("Lola")) {
			PImage perfiles = app.loadImage("./data/imports/" + a.get(3).getNombre() + ".jpeg");
			app.image(perfiles, 410, 20, 100, 100);
			app.textSize(15);
			app.text(a.get(3).getNombre(), 440, 220);
			app.text(a.get(3).getRaza(), 440, 240);
			app.text(a.get(3).getFecha(), 440, 280);
			app.text(a.get(3).getId(), 440, 300);
		}
		if (a.get(4).getNombre().equals("Nymeria")) {
			PImage perfiles = app.loadImage("./data/imports/" + a.get(4).getNombre() + ".jpeg");
			app.image(perfiles, 540, 20, 100, 100);
			app.textSize(15);
			app.text(a.get(4).getNombre(), 580, 220);
			app.text(a.get(4).getRaza(), 580, 240);
			app.text(a.get(4).getFecha(), 580, 280);
			app.text(a.get(4).getId(), 580, 300);

		}
	}
}
