package de.rnd7.calcsheet;

import java.util.Random;


public abstract class CalcGenerator {
	public abstract String doGen(int solutionMax);
	
	// variable so that it is not re-seeded every call.
	private final Random rand = new Random();
	
	protected int rand(final int min, final int max) {
	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    return rand.nextInt((max - min) + 1) + min;
	}
}
