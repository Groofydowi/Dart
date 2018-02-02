package de.aaron.dart;

import java.util.ArrayList;
import java.util.Collection;

import junit.framework.TestCase;

public class SpielerTest extends TestCase {

	public void testSpielerName() throws Exception {

		Spieler alex = new Spieler("Alex");

		String name = alex.getName();

		assertEquals("Alex", name);

		Spieler spielerZwei = new Spieler("Horst");

		java.util.List<Spieler> spieler = new ArrayList<>();
		spieler.add(alex);
		spieler.add(spielerZwei);

		gibSpielerNamenAufKonsoleAus(spieler);

	}

	public void gibSpielerNamenAufKonsoleAus(Collection<Spieler> spieler) {

		for (Spieler spielerender : spieler) {
			System.out.println(spielerender.getName());
		}
	}
}
