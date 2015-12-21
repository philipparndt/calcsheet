package de.rnd7.calcsheet.gens;

import de.rnd7.calcsheet.CalcGenerator;

public class FindeBAufgabe extends CalcGenerator {

	private static final int MIN = 3;

	@Override
	public String doGen(final int solutionMax) {
		final int a = rand(MIN, solutionMax);
		final int b = rand(MIN, solutionMax);
		
		return String.format("%d\t\t\t=\t%d", a,b);
	}

}
