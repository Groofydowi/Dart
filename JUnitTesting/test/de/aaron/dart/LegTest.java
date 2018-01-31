package de.aaron.dart;

import junit.framework.TestCase;

public class LegTest extends TestCase {

	public void testLegMinus() {

		try {

			new Leg(-1);

			fail("Bei -1 hätte eine Exception fliegen müssen");

		} catch (Exception e) {
			assertNotNull("Die Exception hätte hier nicht 'null' sein dürfen", e);
		}
	}

	public void testNeuesLegValide() throws Exception {
		new Leg(501);
	}
}
