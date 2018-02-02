package de.aaron.dart;

import junit.framework.TestCase;

public class WurfTest extends TestCase {

	public void testWurfPunktZahl() throws Exception {

		Wurf wurf = new Wurf(PunkteModifier.TRIPLE, PunkteFeld.ZWANZIG);
		assertEquals("Die Punktzahl dieses Wurfs hätte '60' sein müssen", 60, wurf.getPunktZahl());
	}
}
