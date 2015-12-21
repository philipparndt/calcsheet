package de.rnd7.calcsheet.gens;

import de.rnd7.calcsheet.CalcGenerator;

public class MinusAufgabe extends CalcGenerator {

	private final int min;
	
	public MinusAufgabe(final int min) {
		this.min = min;
	}

	@Override
	public String doGen(final int solutionMax) {

		final int a = rand(min, solutionMax);
		final int b = rand(min, solutionMax);
		
		final int aa = Math.max(a, b);
		final int bb = Math.min(a, b);
		
		return String.format("%d\t-\t%d\t=", aa,bb);
	}

}
