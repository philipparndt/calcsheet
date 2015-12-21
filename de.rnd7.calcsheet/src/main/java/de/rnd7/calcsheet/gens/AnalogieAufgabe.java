package de.rnd7.calcsheet.gens;

import de.rnd7.calcsheet.CalcGenerator;

public class AnalogieAufgabe extends CalcGenerator {

	private static final int MIN = 3;

	@Override
	public String doGen(final int solutionMax) {

		final int a = rand(MIN, 10);
		final int b = rand(MIN, 10);
		
		return String.format("%d\t+\t%d\t=\n%d\t+\t%d\t=", a,b, 10 + a,b);
	}

}
