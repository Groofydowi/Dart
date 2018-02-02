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

	public void spielstandAnlegen(Spieler spieler) {

		SpielerPunkteStand spielerPunkteStand = SpielerPunkteStand.create(leg);

		this.punkteStandProSpieler.put(spieler, spielerPunkteStand);
	}

	public void spielerHatGeworfen(Spieler spieler, Wurf wurf) {

		SpielerPunkteStand spielerPunkteStand = getPunkteStandFuerNotNull(spieler);

		spielerPunkteStand.spielerHatGeworfen(wurf);
	}

	// Ist bereits in SpielerTest vorhanden!!!
	public void alleSpielerAusgeben(Map<Spieler, Spielstand> supervisor) {
		for (Spieler name : supervisor.keySet()) {
			System.out.println(name.getName());
		}
	}

	public float getAverageFuerSpieler(Spieler spieler) {

		SpielerPunkteStand spielerPunkteStand = getPunkteStandFuerNotNull(spieler);

		return spielerPunkteStand.ermittleAverage();
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
