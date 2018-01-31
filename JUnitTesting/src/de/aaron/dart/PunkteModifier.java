package de.aaron.dart;

public enum PunkteModifier {

	SINGLE(1), DOUBLE(2), TRIPLE(3);

	private PunkteModifier(int modifier) {
		this.modifier = modifier;
	}

	private int modifier;

	public int getModifier() {
		return modifier;
	}

}
