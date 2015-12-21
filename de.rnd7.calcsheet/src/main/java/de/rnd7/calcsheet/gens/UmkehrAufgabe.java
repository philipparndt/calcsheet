package de.rnd7.calcsheet.gens;

import de.rnd7.calcsheet.CalcGenerator;

public class UmkehrAufgabe extends CalcGenerator {

	private static final int MIN = 3;

	@Override
	public String doGen(final int solutionMax) {

		int a = rand(MIN, solutionMax);
		int b = rand(MIN, solutionMax);
		
		while (a + b > solutionMax) {
			a = rand(MIN, solutionMax);
			b = rand(MIN, solutionMax);
		}
		
		return String.format("%d\t+\t%d\t=\n%d\t+\t%d\t=", a,b, b,a);
	}

}
