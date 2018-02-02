package de.aaron.dart;

import java.util.HashMap;
import java.util.Map;

public class Spielstand {

	private Leg leg;
	private Map<Spieler, SpielerPunkteStand> punkteStandProSpieler;

	public Spielstand(Leg leg) {
		this.leg = leg;
		punkteStandProSpieler = new HashMap<Spieler, SpielerPunkteStand>();
	}

	public void spielstandAnlegen(Spieler spieler, SpielerPunkteStand spielerPunkteStand) {
		this.punkteStandProSpieler.put(spieler, spielerPunkteStand);
	}

	public void spielerHatGeworfen(Spieler spieler, Wurf wurf) {

		SpielerPunkteStand spielerPunkteStand = getPunkteStandFuerNotNull(spieler);

		spielerPunkteStand.spielerHatGeworfen(wurf);
	}

	// Ist bereits in SpielerTest vorhanden!!!
	public String alleSpielerAusgeben() {

		// List<Spieler> list = new ArrayList<Spieler>(punkteStandProSpieler.keySet());
		//
		// list.sort(Spieler::compareToIgnoreCase);

		// Collections.sort(list, new Comparator<Spieler>() {
		// public int compare(Spieler s1, Spieler s2) {
		// return s1.
		// }
		// });

		String names = "";

		for (Spieler name : punkteStandProSpieler.keySet()) {
			names = names + name.getName() + "\n";
		}

		return names;
	}

	/*
	 * Verbleibende Punkte
	 */
	// public int ermittleVerbleibendePunkte() { // Abfrage ob gewonnen, überworfen
	// oder weiter
	// return leg.getAnfangspunkte() - ermittleGesamtPunktZahl();
	// }

	public int getRestPunktZahlFuer(Spieler spieler) {

		int legPunktZahl = leg.getAnfangspunkte();

		SpielerPunkteStand spielerPunkteStand = getPunkteStandFuerNotNull(spieler);

		return legPunktZahl - spielerPunkteStand.ermittleGesamtPunktZahl();
	}

	public float getAverageFuerSpieler(Spieler spieler) {

		SpielerPunkteStand spielerPunkteStand = getPunkteStandFuerNotNull(spieler);

		return spielerPunkteStand.ermittleAverage();
	}

	public int getGesamtPunktZahl(Spieler spieler) {

		SpielerPunkteStand spielerPunkteStand = getPunkteStandFuerNotNull(spieler);

		return spielerPunkteStand.ermittleGesamtPunktZahl();
	}

	private SpielerPunkteStand getPunkteStandFuerNotNull(Spieler spieler) {

		SpielerPunkteStand spielerPunkteStand = punkteStandProSpieler.get(spieler);

		if (spielerPunkteStand == null)
			throw new IllegalStateException(String.format(
					"Es wurde noch kein Spielstand für Spieler 's' angelegt. spielstandAnlegen(spieler) kann helfen",
					spieler));

		return spielerPunkteStand;
	}
}
