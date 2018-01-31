package de.aaron.dart;

import junit.framework.TestCase;

public class LegTest extends TestCase {

	public void testLegMinus() {

		try {

			new Leg(-1);

			fail("Bei -1 h�tte eine Exception fliegen m�ssen");

		} catch (Exception e) {
			assertNotNull("Die Exception h�tte hier nicht 'null' sein d�rfen", e);
		}
	}

	public void testNeuesLegValide() throws Exception {
		new Leg(501);
	}
}
