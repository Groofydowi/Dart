package de.aaron.dart;

public class SpielstandTestMain {

	public static void main(String[] args) {
		Leg leg1 = new Leg(501);
		Spieler spieler1 = new Spieler("Max");
		Spielstand stand = new Spielstand(leg1, spieler1);

		Wurf wurf1 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.ZWANZIG);
		stand.spielerHatGeworfen(spieler1, wurf1);

		Wurf wurf2 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.FÜNFZEHN);
		stand.spielerHatGeworfen(spieler1, wurf2);
		System.out.println(stand.getPunkteStandFuer(spieler1).ermittleGesamtPunktZahl());
	}

}
