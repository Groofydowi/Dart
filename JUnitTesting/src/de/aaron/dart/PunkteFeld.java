package de.aaron.dart;

public enum PunkteFeld {

	EINS(1), ZWEI(2), DREI(3), VIER(4), FÜNF(5), SECHS(6), SIEBEN(7), ACHT(8), NEUN(9), ZEHN(10), ELF(11), ZWÖLF(
			12), DREIZEHN(13), VIERZEHN(14), FÜNFZEHN(15), SECHZEHN(
					16), SIEBZEHN(17), ACHTZEHN(18), NEUNZEHN(19), ZWANZIG(20), BULL(25), BULLS_EYE(50), AUSSEN(0);

	private PunkteFeld(int punktZahl) {
		this.punktZahl = punktZahl;
	}

	private int punktZahl;

	public int getPunktZahl() {
		return punktZahl;
	}
}
