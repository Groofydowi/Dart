package de.aaron.dart;

import java.util.ArrayList;
import java.util.List;

public class SpielerPunkteStand {

	private List<Wurf> wuerfe = new ArrayList<>();

	public SpielerPunkteStand() {
	}

	/*
	 * Average
	 */
	public float ermittleAverage() {
		if (wuerfe.isEmpty())
			return 0.0f;

		int gesamtPunktZahl = ermittleGesamtPunktZahl();
		return gesamtPunktZahl / (float) getAnzahlWuerfe();
	}

	public void spielerHatGeworfen(Wurf wurf) {
		this.wuerfe.add(wurf);
	}

	public int getAnzahlWuerfe() {
		return wuerfe.size();
	}

	/*
	 * Gesamt Punktzahl
	 */
	public int ermittleGesamtPunktZahl() {

		int punktZahl = 0;

		for (Wurf wurf : wuerfe)
			punktZahl += wurf.getPunktZahl();

		return punktZahl;
	}

	/*
	 * Verbleibende Punkte
	 */


	public static SpielerPunkteStand create(Leg leg) {
		return new SpielerPunkteStand();
	}
}
