package de.aaron.dart;

public class Leg {

	private int anfangspunkte;
	// Spieler1 wirft
	// W�rfe eingeben
	// Ausgabe
	//
	// Spieler2
	// wirft W�rfe
	// eingeben
	// Ausgabe
	//
	// Spieler1 gewinnt
	// Ausgabe
	// zur�ck
	// zu Break

	/*
	 * Constructor
	 */
	public Leg(int anfangspunkte) {

		if (anfangspunkte <= 0)
			throw new IllegalStateException("Die Anfangspunktzahl muss > 0 sein");

		this.anfangspunkte = anfangspunkte;
	}

	public int getAnfangspunkte() {
		return anfangspunkte;
	}

}
