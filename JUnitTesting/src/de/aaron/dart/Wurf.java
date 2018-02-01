package de.aaron.dart;

public class Wurf {

	private int punktZahl, originalZahl;

	public Wurf(PunkteFeld punkteFeld) {

		if (punkteFeld == PunkteFeld.BULL || punkteFeld == PunkteFeld.BULLS_EYE) {

			this.punktZahl = punkteFeld.getPunktZahl();

		} else {

			this.punktZahl = punkteFeld.getPunktZahl();
		}

		// if (punktZahl >= 0 && punktZahl <= 60) {
		// if (feld > 0 && feld < 4) {
		// this.punktZahl = punktZahl;
		// originalZahl = punktZahl / feld;
		// } else {
		// System.out.println("Dies ist kein gültiges Feld!");
		// }
		// } else {
		// System.out.println("Dies ist keine gültige Zahl!");
		// }
	}

	public Wurf(PunkteModifier punkteModifier, PunkteFeld punkteFeld) {

		if ((punkteModifier == PunkteModifier.DOUBLE || punkteModifier == PunkteModifier.TRIPLE)
				&& punkteFeld == PunkteFeld.BULLS_EYE) {

			throw new IllegalArgumentException("Es gibt kein 'Double Bullseye' oder 'Triple Bullseye'");
		} else if (!(punkteModifier == PunkteModifier.DOUBLE && punkteFeld == PunkteFeld.BULL)
				|| punkteFeld == PunkteFeld.BULL || punkteFeld == PunkteFeld.BULLS_EYE) {

			this.punktZahl = punkteFeld.getPunktZahl();
		} else {
			this.punktZahl = punkteModifier.getModifier() * punkteFeld.getPunktZahl();
		}

		// if (punktZahl >= 0 && punktZahl <= 60) {
		// if (feld > 0 && feld < 4) {
		// this.punktZahl = punktZahl;
		// originalZahl = punktZahl / feld;
		// } else {
		// System.out.println("Dies ist kein gültiges Feld!");
		// }
		// } else {
		// System.out.println("Dies ist keine gültige Zahl!");
		// }
	}

	public int getOriginalWurf() {
		return originalZahl;
	}

	public int getPunktZahl() {
		return punktZahl;
	}

}
