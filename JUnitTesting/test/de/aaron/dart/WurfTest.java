package de.aaron.dart;

import junit.framework.TestCase;

public class WurfTest extends TestCase {

	public void testWurfPunktZahl() throws Exception {

		Wurf wurf = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.ZWANZIG);
		assertEquals("Die Punktzahl dieses Wurfs h�tte '60' sein m�ssen", 60, wurf.getPunktZahl());
	}

	public void testBull() throws Exception {
		Wurf wurf = new Wurf(PunkteFeld.BULL);

		assertEquals(25, wurf.getPunktZahl());
	}

	public void testBullseyeMitModifier() throws Exception {
		try {
			Wurf wurf = new Wurf(PunkteModifier.DOUBLE, PunkteFeld.BULLS_EYE);
		} catch (Exception e) {
			assertNotNull("Die Exception h�tte hier nicht 'null' sein d�rfen", e);
		}
	}
}
