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
			app.text(a.get(0).getNombre(), 30, 220);
			app.text(a.get(0).getRaza(), 30, 240);
			app.text(a.get(0).getFecha(), 30, 280);
			app.text(a.get(0).getId(), 30, 300);
		}
		if (a.get(1).getNombre().equals("Kaiser")) {
			PImage perfiles = app.loadImage("./data/imports/" + a.get(1).getNombre() + ".jpeg");
			app.image(perfiles, 120, 20, 100, 100);
			app.text(a.get(1).getNombre(), 120, 220);
			app.text(a.get(1).getRaza(), 120, 240);
			app.text(a.get(1).getFecha(), 120, 280);
			app.text(a.get(1).getId(), 120, 300);
		}
		if (a.get(2).getNombre().equals("Heisenberg")) {
			PImage perfiles = app.loadImage("./data/imports/" + a.get(2).getNombre() + ".jpeg");
			app.image(perfiles, 220, 20, 100, 100);
			app.text(a.get(2).getNombre(), 220, 220);
			app.text(a.get(2).getRaza(), 220, 240);
			app.text(a.get(2).getFecha(), 220, 280);
			app.text(a.get(2).getId(), 220, 300);
		}
		if (a.get(3).getNombre().equals("Lola")) {
			PImage perfiles = app.loadImage("./data/imports/" + a.get(3).getNombre() + ".jpeg");
			app.image(perfiles, 320, 20, 100, 100);
			app.text(a.get(3).getNombre(), 320, 220);
			app.text(a.get(3).getRaza(), 320, 240);
			app.text(a.get(3).getFecha(), 320, 280);
			app.text(a.get(3).getId(), 320, 300);
		}
		if (a.get(4).getNombre().equals("Nymeria")) {
			PImage perfiles = app.loadImage("./data/imports/" + a.get(4).getNombre() + ".jpeg");
			app.image(perfiles, 420, 20, 100, 100);
			app.text(a.get(4).getNombre(), 420, 220);
			app.text(a.get(4).getRaza(), 420, 240);
			app.text(a.get(4).getFecha(), 420, 280);
			app.text(a.get(4).getId(), 420, 300);

		}
	}
}
