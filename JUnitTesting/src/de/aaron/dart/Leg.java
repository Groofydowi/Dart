package de.aaron.dart;

public class Leg {

	private int anfangspunkte;

	public Leg(int anfangspunkte) {

		if (anfangspunkte <= 0)
			throw new IllegalStateException("Die Anfangspunktzahl muss > 0 sein");

		this.anfangspunkte = anfangspunkte;
	}

	public int getAnfangspunkte() {
		return anfangspunkte;
	}

}
