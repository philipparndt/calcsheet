package de.rnd7.calcsheet.gens;

import de.rnd7.calcsheet.CalcGenerator;

public class PlusAufgabe extends CalcGenerator {

	private final int min;

	public PlusAufgabe(final int min) {
		this.min = min;
	}
	
	@Override
	public String doGen(final int solutionMax) {

		int a = rand(min, solutionMax);
		int b = rand(min, solutionMax);
		
		while (a + b > solutionMax) {
			a = rand(min, solutionMax);
			b = rand(min, solutionMax);
		}
		
		return String.format("%d\t+\t%d\t=", a,b);
	}

}
