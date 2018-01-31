package de.aaron.jiraoverhead;

import junit.framework.TestCase;

public class ErsteTestKlasse extends TestCase {

	public void testErsterTestFallVonVielen() throws Exception {

		TestMain testMain = new TestMain();
		String testText = testMain.getTestString();

		assertEquals("Die beiden Texte hätten identisch sein sollen", "test", testText);
	}

	public void testZweiterTestFall() throws Exception {

		TestMain testMain = new TestMain();
		assertNotNull("testMain darf an dieser Stelle nicht 'null' sein", testMain);
	}
}
