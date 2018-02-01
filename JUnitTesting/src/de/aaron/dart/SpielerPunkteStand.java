package de.aaron.dart;

import java.util.ArrayList;
import java.util.List;

public class SpielerPunkteStand {

	private List<Wurf> wuerfe = new ArrayList<>();
	private Leg leg;
	private int gewonneneLegs;

	public SpielerPunkteStand(Leg leg) {
		this.leg = leg;
	}

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

	public int ermittleGesamtPunktZahl() { // oder hier die Abfrage ob null Punkte übrig

		int punktZahl = 0;

		for (Wurf wurf : wuerfe)
			punktZahl += wurf.getPunktZahl();

		return punktZahl;
	}

	public int ermittleVerbleibendePunkte() { // Abfrage ob gewonnen, überworfen oder weiter
		return leg.getAnfangspunkte() - ermittleGesamtPunktZahl();
	}
}
