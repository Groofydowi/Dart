package de.aaron.dart;

import javax.swing.JOptionPane;

import junit.framework.TestCase;

public class SpielstandTest extends TestCase {

	// public void testGetPunktestandFuer() throws Exception {
	// Spieler spieler1 = new Spieler("Max");
	// Spielstand stand = new Spielstand();
	//
	// System.out.println(stand.getPunkteStandFuer(spieler1));
	// }

	public void testPunkteStandEinSpieler() throws Exception {
		Leg leg1 = new Leg(501);

		Spieler spieler1 = new Spieler("Max");

		Spielstand standSpieler1 = new Spielstand(leg1, spieler1);

		Wurf wurf1 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.ZWANZIG);
		standSpieler1.spielerHatGeworfen(spieler1, wurf1);

		Wurf wurf2 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.FÜNFZEHN);
		standSpieler1.spielerHatGeworfen(spieler1, wurf2);

		Wurf wurf3 = new Wurf(PunkteModifier.SINGLE, PunkteFeld.ZWANZIG);
		standSpieler1.spielerHatGeworfen(spieler1, wurf3);

		System.out.println(standSpieler1.getPunkteStandFuer(spieler1).ermittleGesamtPunktZahl());
		System.out.println(standSpieler1.getPunkteStandFuer(spieler1).ermittleAverage());
		System.out.println(standSpieler1.getPunkteStandFuer(spieler1).ermittleVerbleibendePunkte());
	}

	public void testPunkteStandZweiSpieler() throws Exception {
		Leg leg1 = new Leg(501);

		Spieler spieler1 = new Spieler("Max");
		Spieler spieler2 = new Spieler("Bobbi");

		Spielstand standSpieler1 = new Spielstand(leg1, spieler1);
		Spielstand standSpieler2 = new Spielstand(leg1, spieler2);

		Wurf wurf11 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.ZWANZIG);
		standSpieler1.spielerHatGeworfen(spieler1, wurf11);

		Wurf wurf12 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.FÜNFZEHN);
		standSpieler1.spielerHatGeworfen(spieler1, wurf12);

		Wurf wurf13 = new Wurf(PunkteModifier.SINGLE, PunkteFeld.ZWANZIG);
		standSpieler1.spielerHatGeworfen(spieler1, wurf13);

		System.out.println(standSpieler1.getPunkteStandFuer(spieler1).ermittleGesamtPunktZahl());
		System.out.println(standSpieler1.getPunkteStandFuer(spieler1).ermittleAverage());
		System.out.println(standSpieler1.getPunkteStandFuer(spieler1).ermittleVerbleibendePunkte());

		Wurf wurf21 = new Wurf(PunkteModifier.SINGLE, PunkteFeld.ZWANZIG);
		standSpieler2.spielerHatGeworfen(spieler2, wurf21);

		Wurf wurf22 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.ZWANZIG);
		standSpieler2.spielerHatGeworfen(spieler2, wurf22);

		Wurf wurf23 = new Wurf(PunkteModifier.SINGLE, PunkteFeld.FÜNF);
		standSpieler2.spielerHatGeworfen(spieler2, wurf23);

		System.out.println(standSpieler2.getPunkteStandFuer(spieler2).ermittleGesamtPunktZahl());
		System.out.println(standSpieler2.getPunkteStandFuer(spieler2).ermittleAverage());
		System.out.println(standSpieler2.getPunkteStandFuer(spieler2).ermittleVerbleibendePunkte());
	}

	public void testAlleSpielerAusgeben() throws Exception {
		Leg leg1 = new Leg(501);

		Spieler spieler0 = new Spieler("Supervisor");
		Spieler spieler1 = new Spieler("Max");
		Spieler spieler2 = new Spieler("Bobbi");
		Spieler spieler3 = new Spieler("Alex");
		Spieler spieler4 = new Spieler("Carmen");
		Spieler spieler5 = new Spieler("Maja");

		Spielstand standSpieler0 = new Spielstand(leg1, spieler0);
		Spielstand standSpieler1 = new Spielstand(leg1, spieler1);
		Spielstand standSpieler2 = new Spielstand(leg1, spieler2);
		Spielstand standSpieler3 = new Spielstand(leg1, spieler3);
		Spielstand standSpieler4 = new Spielstand(leg1, spieler4);
		Spielstand standSpieler5 = new Spielstand(leg1, spieler5);

		Spielstand stand;
		// stand.alleSpielerAusgeben();
	}

	public void testForLoop() throws Exception {
		Leg leg1 = new Leg(501);

		Spieler spieler1 = new Spieler("Max");

		Spielstand standSpieler1 = new Spielstand(leg1, spieler1);

		for (int i = 0; i < 3; i++) {
			Wurf wurf1 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.ZWANZIG); // funktioniert besser wenn es echte
																				// Eingaben gibt.
			standSpieler1.spielerHatGeworfen(spieler1, wurf1);
		}
		System.out.println(standSpieler1.getPunkteStandFuer(spieler1).ermittleGesamtPunktZahl());
		System.out.println(standSpieler1.getPunkteStandFuer(spieler1).ermittleAverage());
		System.out.println(standSpieler1.getPunkteStandFuer(spieler1).ermittleVerbleibendePunkte());
	}

	public void testWhileLoop() throws Exception {
		Leg leg1 = new Leg(501);

		Spieler spieler1 = new Spieler("Max");
		Spieler spieler2 = new Spieler("Bobbi");

		Spielstand standSpieler1 = new Spielstand(leg1, spieler1);
		Spielstand standSpieler2 = new Spielstand(leg1, spieler2);

		while (standSpieler1.getPunkteStandFuer(spieler1).getAnzahlWuerfe() <= 3) { //
			Wurf wurf1 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.ZWANZIG);
			standSpieler1.spielerHatGeworfen(spieler1, wurf1);

			// Wurf wurf2 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.FÜNFZEHN);
			// standSpieler1.spielerHatGeworfen(spieler1, wurf2);
			//
			// Wurf wurf3 = new Wurf(PunkteModifier.SINGLE, PunkteFeld.ZWANZIG);
			// standSpieler1.spielerHatGeworfen(spieler1, wurf3);

			System.out.println(standSpieler1.getPunkteStandFuer(spieler1).ermittleGesamtPunktZahl());
			System.out.println(standSpieler1.getPunkteStandFuer(spieler1).ermittleAverage());
			System.out.println(standSpieler1.getPunkteStandFuer(spieler1).ermittleVerbleibendePunkte());
		}

		while (standSpieler2.getPunkteStandFuer(spieler2).getAnzahlWuerfe() <= 3) { //
			Wurf wurf1 = new Wurf(PunkteModifier.SINGLE, PunkteFeld.ZWANZIG);
			standSpieler2.spielerHatGeworfen(spieler2, wurf1);

			// Wurf wurf2 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.ZWANZIG);
			// standSpieler2.spielerHatGeworfen(spieler2, wurf2);
			//
			// Wurf wurf3 = new Wurf(PunkteModifier.SINGLE, PunkteFeld.EINS);
			// standSpieler2.spielerHatGeworfen(spieler2, wurf3);

			System.out.println(standSpieler2.getPunkteStandFuer(spieler2).ermittleGesamtPunktZahl());
			System.out.println(standSpieler2.getPunkteStandFuer(spieler2).ermittleAverage());
			System.out.println(standSpieler2.getPunkteStandFuer(spieler2).ermittleVerbleibendePunkte());
		}

		// while () {
		// Wurf wurf = new Wurf(btnMod.getText(), btnFeld.getText());
		// }
	}

	public void testWhileJOptionPane() throws Exception {
		String eingabe;
		Leg leg1 = new Leg(501);

		Spieler spieler1 = new Spieler("Max");
		Spieler spieler2 = new Spieler("Bobbi");

		Spielstand standSpieler1 = new Spielstand(leg1, spieler1);
		Spielstand standSpieler2 = new Spielstand(leg1, spieler2);

		while (standSpieler1.getPunkteStandFuer(spieler1).getAnzahlWuerfe() < 3) {
			eingabe = JOptionPane.showInputDialog("Geben Sie den Mod an:");
			Wurf wurf1 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.ZWANZIG);
			standSpieler1.spielerHatGeworfen(spieler1, wurf1);

			System.out.println(standSpieler1.getPunkteStandFuer(spieler1).ermittleGesamtPunktZahl());
			System.out.println(standSpieler1.getPunkteStandFuer(spieler1).ermittleAverage());
			System.out.println(standSpieler1.getPunkteStandFuer(spieler1).ermittleVerbleibendePunkte());
		}

	}

	public void testEingabeFeld() throws Exception {

	}
}
