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
	}

	public SpielerPunkteStand getPunkteStandFuer(Spieler spieler) {
		return punkteStandProSpieler.get(spieler);
	}

	public void spielerHatGeworfen(Spieler spieler, Wurf wurf) {
		if (punkteStandProSpieler.containsKey(spieler)) {
			spielerPunkteStand.spielerHatGeworfen(wurf);
		} else {
			punkteStandProSpieler.put(spieler, spielerPunkteStand);
			spielerPunkteStand.spielerHatGeworfen(wurf);
		}
	}

	// Ist bereits in SpielerTest vorhanden!!!
	public void alleSpielerAusgeben(Map<Spieler, Spielstand> supervisor) {
		for (Spieler name : supervisor.keySet()) {
			System.out.println(name.getName());
		}
	}
}
