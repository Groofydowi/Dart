package de.aaron.dart;

import junit.framework.TestCase;

public class SpielstandTest extends TestCase {

	public void testPunkteStandAverage() throws Exception {

		Leg leg1 = new Leg(501);

		Spielstand spielstand = new Spielstand(leg1);

		Spieler spieler1 = new Spieler("Max");

		spielstand.spielstandAnlegen(spieler1);

		Wurf wurf1 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.ZWANZIG);
		spielstand.spielerHatGeworfen(spieler1, wurf1);

		Wurf wurf2 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.EINS);
		spielstand.spielerHatGeworfen(spieler1, wurf2);

		Wurf wurf3 = new Wurf(PunkteModifier.SINGLE, PunkteFeld.ZWANZIG);
		spielstand.spielerHatGeworfen(spieler1, wurf3);

		assertEquals(27.6666660, spielstand.getAverageFuerSpieler(spieler1), 0.00001);
	}

	public void testGesamtPunktZahl() throws Exception {

		Leg leg1 = new Leg(501);

		Spielstand spielstand = new Spielstand(leg1);

		Spieler spieler1 = new Spieler("Max");

		spielstand.spielstandAnlegen(spieler1);

		Wurf wurf1 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.ZWANZIG);
		spielstand.spielerHatGeworfen(spieler1, wurf1);

		Wurf wurf2 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.EINS);
		spielstand.spielerHatGeworfen(spieler1, wurf2);

		Wurf wurf3 = new Wurf(PunkteModifier.SINGLE, PunkteFeld.ZWANZIG);
		spielstand.spielerHatGeworfen(spieler1, wurf3);

	}

	public void testNeuerSpielerPunkteStand() throws Exception {
		// Leg leg1 = new Leg(501);
		//
		// Spieler spieler1 = new Spieler("Max");
		//
		// Spielstand spielstand = new Spielstand(spieler1);
		// spielstand.neuerSpielerPunkteStand(leg1, spieler1);
		//
		// Wurf wurf1 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.ZWANZIG);
		// spielstand.spielerHatGeworfen(spieler1, wurf1);
		//
		// Wurf wurf2 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.EINS);
		// spielstand.spielerHatGeworfen(spieler1, wurf2);
		//
		// Wurf wurf3 = new Wurf(PunkteModifier.SINGLE, PunkteFeld.ZWANZIG);
		// spielstand.spielerHatGeworfen(spieler1, wurf3);
		//
		// System.out.println(spielstand.getAverageFuerSpieler(spieler1));
	}

	// public void testPunkteStandZweiSpieler() throws Exception {
	// Leg leg1 = new Leg(501);
	//
	// Spieler spieler1 = new Spieler("Max");
	// Spieler spieler2 = new Spieler("Bobbi");
	//
	// Spielstand standSpieler1 = new Spielstand(leg1, spieler1);
	// Spielstand standSpieler2 = new Spielstand(leg1, spieler2);
	//
	// Wurf wurf11 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.ZWANZIG);
	// standSpieler1.spielerHatGeworfen(spieler1, wurf11);
	//
	// Wurf wurf12 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.FÜNFZEHN);
	// standSpieler1.spielerHatGeworfen(spieler1, wurf12);
	//
	// Wurf wurf13 = new Wurf(PunkteModifier.SINGLE, PunkteFeld.ZWANZIG);
	// standSpieler1.spielerHatGeworfen(spieler1, wurf13);
	//
	// assertEquals(125,
	// standSpieler1.getPunkteStandFuer(spieler1).ermittleGesamtPunktZahl());
	// assertEquals(41.666668,
	// standSpieler1.getPunkteStandFuer(spieler1).ermittleAverage(), 0.00001);
	// assertEquals(376,
	// standSpieler1.getPunkteStandFuer(spieler1).ermittleVerbleibendePunkte());
	//
	// Wurf wurf21 = new Wurf(PunkteModifier.SINGLE, PunkteFeld.ZWANZIG);
	// standSpieler2.spielerHatGeworfen(spieler2, wurf21);
	//
	// Wurf wurf22 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.ZWANZIG);
	// standSpieler2.spielerHatGeworfen(spieler2, wurf22);
	//
	// Wurf wurf23 = new Wurf(PunkteModifier.SINGLE, PunkteFeld.FÜNF);
	// standSpieler2.spielerHatGeworfen(spieler2, wurf23);
	//
	// assertEquals(85,
	// standSpieler2.getPunkteStandFuer(spieler2).ermittleGesamtPunktZahl());
	// assertEquals(416,
	// standSpieler2.getPunkteStandFuer(spieler2).ermittleVerbleibendePunkte());
	// assertEquals(28.333334,
	// standSpieler2.getPunkteStandFuer(spieler2).ermittleAverage(), 0.000001);
	// }
	//
	// public void testAlleSpielerAusgeben() throws Exception {
	// Leg leg1 = new Leg(501);
	// Map<Spieler, Spielstand> supervisor = new HashMap<Spieler, Spielstand>();
	// List<String> values = new ArrayList<String>();
	//
	// Spieler spieler0 = new Spieler("Supervisor");
	// Spieler spieler1 = new Spieler("Max");
	// Spieler spieler2 = new Spieler("Bobbi");
	// Spieler spieler3 = new Spieler("Alex");
	// Spieler spieler4 = new Spieler("Carmen");
	// Spieler spieler5 = new Spieler("Maja");
	//
	// // for (int i = 0; i <= 5; i++) {
	// // values.add("spieler" + i);
	// // }
	// // for (int i = 0; i < values.size(); i++) {
	// // values.get(i);
	// // Spielstand standSpieler0 = new Spielstand(leg1, spieler0);
	// // }
	//
	// Spielstand standSpieler0 = new Spielstand(leg1, spieler0);
	// Spielstand standSpieler1 = new Spielstand(leg1, spieler1);
	// Spielstand standSpieler2 = new Spielstand(leg1, spieler2);
	// Spielstand standSpieler3 = new Spielstand(leg1, spieler3);
	// Spielstand standSpieler4 = new Spielstand(leg1, spieler4);
	// Spielstand standSpieler5 = new Spielstand(leg1, spieler5);
	//
	// supervisor.put(spieler1, standSpieler1);
	// supervisor.put(spieler2, standSpieler2);
	// supervisor.put(spieler3, standSpieler3);
	// supervisor.put(spieler4, standSpieler4);
	// supervisor.put(spieler5, standSpieler5);
	//
	// standSpieler0.alleSpielerAusgeben(supervisor);
	//
	// }
	//
	// public void testForLoop() throws Exception {
	// Leg leg1 = new Leg(501);
	//
	// Spieler spieler1 = new Spieler("Max");
	//
	// Spielstand standSpieler1 = new Spielstand(leg1, spieler1);
	//
	// for (int i = 0; i < 3; i++) {
	// Wurf wurf1 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.ZWANZIG); //
	// funktioniert besser wenn es echte
	// // Eingaben gibt.
	// standSpieler1.spielerHatGeworfen(spieler1, wurf1);
	// }
	//
	// assertEquals(180,
	// standSpieler1.getPunkteStandFuer(spieler1).ermittleGesamtPunktZahl());
	// assertEquals(60.0,
	// standSpieler1.getPunkteStandFuer(spieler1).ermittleAverage(), 0.0);
	// assertEquals(321,
	// standSpieler1.getPunkteStandFuer(spieler1).ermittleVerbleibendePunkte());
	// }
	//
	// public void testWhileLoop() throws Exception {
	// Leg leg1 = new Leg(501);
	//
	// Spieler spieler1 = new Spieler("Max");
	// Spieler spieler2 = new Spieler("Bobbi");
	//
	// Spielstand standSpieler1 = new Spielstand(leg1, spieler1);
	// Spielstand standSpieler2 = new Spielstand(leg1, spieler2);
	//
	// while (standSpieler1.getPunkteStandFuer(spieler1).getAnzahlWuerfe() < 3) { //
	// Wurf wurf1 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.ZWANZIG);
	// standSpieler1.spielerHatGeworfen(spieler1, wurf1);
	//
	// // Wurf wurf2 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.FÜNFZEHN);
	// // standSpieler1.spielerHatGeworfen(spieler1, wurf2);
	// //
	// // Wurf wurf3 = new Wurf(PunkteModifier.SINGLE, PunkteFeld.ZWANZIG);
	// // standSpieler1.spielerHatGeworfen(spieler1, wurf3);
	// }
	// assertEquals(180,
	// standSpieler1.getPunkteStandFuer(spieler1).ermittleGesamtPunktZahl());
	// assertEquals(60.0,
	// standSpieler1.getPunkteStandFuer(spieler1).ermittleAverage(), 0.0);
	// assertEquals(321,
	// standSpieler1.getPunkteStandFuer(spieler1).ermittleVerbleibendePunkte());
	//
	// while (standSpieler2.getPunkteStandFuer(spieler2).getAnzahlWuerfe() < 3) { //
	// Wurf wurf1 = new Wurf(PunkteModifier.SINGLE, PunkteFeld.ZWANZIG);
	// standSpieler2.spielerHatGeworfen(spieler2, wurf1);
	//
	// // Wurf wurf2 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.ZWANZIG);
	// // standSpieler2.spielerHatGeworfen(spieler2, wurf2);
	// //
	// // Wurf wurf3 = new Wurf(PunkteModifier.SINGLE, PunkteFeld.EINS);
	// // standSpieler2.spielerHatGeworfen(spieler2, wurf3);
	// }
	// assertEquals(60,
	// standSpieler2.getPunkteStandFuer(spieler2).ermittleGesamtPunktZahl());
	// assertEquals(20.0,
	// standSpieler2.getPunkteStandFuer(spieler2).ermittleAverage(), 0.0);
	// assertEquals(441,
	// standSpieler2.getPunkteStandFuer(spieler2).ermittleVerbleibendePunkte());
	//
	// // while () {
	// // Wurf wurf = new Wurf(btnMod.getText(), btnFeld.getText());
	// // }
	// }
	//
	// public void testWhileJOptionPane() throws Exception {
	// String eingabe;
	// Leg leg1 = new Leg(501);
	//
	// Spieler spieler1 = new Spieler("Max");
	// Spieler spieler2 = new Spieler("Bobbi");
	//
	// Spielstand standSpieler1 = new Spielstand(leg1, spieler1);
	// Spielstand standSpieler2 = new Spielstand(leg1, spieler2);
	//
	// while (standSpieler1.getPunkteStandFuer(spieler1).getAnzahlWuerfe() < 3) {
	// // eingabe = JOptionPane.showInputDialog("Geben Sie den Mod an:");
	// Wurf wurf1 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.ZWANZIG);
	// // Wurf wurf2 = new Wurf(eingabe, PunkteFeld.ZWANZIG);
	// standSpieler1.spielerHatGeworfen(spieler1, wurf1);
	// }
	//
	// assertEquals(180,
	// standSpieler1.getPunkteStandFuer(spieler1).ermittleGesamtPunktZahl());
	// assertEquals(60.0,
	// standSpieler1.getPunkteStandFuer(spieler1).ermittleAverage(), 0.0);
	// assertEquals(321,
	// standSpieler1.getPunkteStandFuer(spieler1).ermittleVerbleibendePunkte());
	//
	// }
}
