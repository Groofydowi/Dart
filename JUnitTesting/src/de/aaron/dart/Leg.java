package de.aaron.dart;

public class Leg {

	private int anfangspunkte;
	// Spieler1 wirft
	// Würfe eingeben
	// Ausgabe
	//
	// Spieler2
	// wirft Würfe
	// eingeben
	// Ausgabe
	//
	// Spieler1 gewinnt
	// Ausgabe
	// zurück
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
