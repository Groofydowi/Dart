package de.aaron.dart;

public class Spieler {

	private String name;

	public Spieler(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {

		/* Viele viele Prüfung */

		this.name = name;
	}

	public void spielerNamenAendern(String name) {
		String vorher = this.name;
		setName(name);
		System.out.println("Der Spielername wurde von " + vorher + " zu " + this.name + " geändert!");
	}
}
