package de.aaron.dart;

import java.util.HashMap;
import java.util.Map;

public class Spielstand {

	private Map<Spieler, SpielerPunkteStand> punkteStandProSpieler;
	private Leg leg;
	SpielerPunkteStand spielerPunkteStand;

	public Spielstand(Leg leg, Spieler spieler) {
		punkteStandProSpieler = new HashMap<Spieler, SpielerPunkteStand>();
		this.leg = leg;
		spielerPunkteStand = new SpielerPunkteStand(leg);
		punkteStandProSpieler.put(spieler, spielerPunkteStand);
	}

	public SpielerPunkteStand getPunkteStandFuer(Spieler spieler) {

		return punkteStandProSpieler.get(spieler);

	}

	public void spielerHatGeworfen(Spieler spieler, Wurf wurf) {
		spielerPunkteStand.spielerHatGeworfen(wurf);
		/*
		 * Es gibt keine Punkte Stand für diesen Spieler.
		 * 
		 * 1. Warum nicht?
		 * 
		 * 2. Was passiert, wenn das wirklich so ist
		 */
	}

	public void alleSpielerAusgeben() {
		for (Spieler name : punkteStandProSpieler.keySet()) {
			System.out.println(name.getName());
		}
	}
}
