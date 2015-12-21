package de.rnd7.calcsheet.gens;

import de.rnd7.calcsheet.CalcGenerator;

public class GroesserAufgabe extends CalcGenerator {

	private static final int MIN = 3;

	@Override
	public String doGen(final int solutionMax) {
		final int a = rand(MIN, solutionMax);
		
		return String.format("%d\t>", a);
	}

}
