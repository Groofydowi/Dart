package de.aaron.dart;

import junit.framework.TestCase;

public class SpielerPunkteStandTest extends TestCase {
	public void testErmittleAverage() throws Exception {
		Leg leg1 = new Leg(501);
		SpielerPunkteStand stand = new SpielerPunkteStand(leg1);
		Wurf wurf1 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.ZWANZIG);
		stand.spielerHatGeworfen(wurf1);

		Wurf wurf2 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.FÜNFZEHN);
		stand.spielerHatGeworfen(wurf2);
		assertEquals(52.5f, stand.ermittleAverage());
	}

	public void testAnzahlWuerfe() throws Exception {
		Leg leg1 = new Leg(501);
		SpielerPunkteStand stand = new SpielerPunkteStand(leg1);
		Wurf wurf1 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.ZWANZIG);
		stand.spielerHatGeworfen(wurf1);

		Wurf wurf2 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.FÜNFZEHN);
		stand.spielerHatGeworfen(wurf2);

		assertEquals(2, stand.getAnzahlWuerfe());
	}

	public void testGesamtPunktzahl() throws Exception {
		Leg leg1 = new Leg(501);
		SpielerPunkteStand stand = new SpielerPunkteStand(leg1);
		Wurf wurf1 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.ZWANZIG);
		stand.spielerHatGeworfen(wurf1);

		Wurf wurf2 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.FÜNFZEHN);
		stand.spielerHatGeworfen(wurf2);

		assertEquals(105, stand.ermittleGesamtPunktZahl());
	}

	public void testVerbleibendePunkte() throws Exception {
		Leg leg1 = new Leg(501);
		SpielerPunkteStand stand = new SpielerPunkteStand(leg1);
		Wurf wurf1 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.ZWANZIG);
		stand.spielerHatGeworfen(wurf1);

		Wurf wurf2 = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.FÜNFZEHN);
		stand.spielerHatGeworfen(wurf2);

		assertEquals(396, stand.ermittleVerbleibendePunkte());
	}

	public void testBull() throws Exception {
		Leg leg1 = new Leg(501);
		Wurf wurf1 = new Wurf(PunkteFeld.BULL);
		SpielerPunkteStand stand = new SpielerPunkteStand(leg1);
		stand.spielerHatGeworfen(wurf1);

		assertEquals(25, stand.ermittleGesamtPunktZahl());
	}

	public void testBullsEye() throws Exception {
		Leg leg1 = new Leg(501);
		Wurf wurf1 = new Wurf(PunkteFeld.BULLS_EYE);
		SpielerPunkteStand stand = new SpielerPunkteStand(leg1);
		stand.spielerHatGeworfen(wurf1);

		assertEquals(50, stand.ermittleGesamtPunktZahl());
	}
}
