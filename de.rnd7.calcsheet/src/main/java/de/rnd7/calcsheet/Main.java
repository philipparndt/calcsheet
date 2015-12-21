package de.rnd7.calcsheet;

import java.util.Random;

import de.rnd7.calcsheet.gens.MinusAufgabe;
import de.rnd7.calcsheet.gens.PlusAufgabe;

public class Main {
	private static final int MAX_TOTAL = 100;
	private static final int MIN = 23;
	
	public static void main(final String[] args) {
		new Main();
		
	}
	
	
	private final Random rand = new Random();
	
	public Main() {
		final CalcGenerator[] aufgaben1 = new CalcGenerator[]{
				new PlusAufgabe(MIN),
				// new MinusAufgabe(),
				//new MinusAufgabe(),
				//new MinusAufgabe(),
				//new AnalogieAufgabe(),
				//new UmkehrAufgabe(),
//				new GroesserKleinerAufgabe(),
//				new GroesserAufgabe(),
//				new KleinerAufgabe(),
				//new FindeBAufgabe(),
		};
		final CalcGenerator[] aufgaben2 = new CalcGenerator[]{
//				new PlusAufgabe(),
				 new MinusAufgabe(MIN),
				//new MinusAufgabe(),
				//new MinusAufgabe(),
				//new AnalogieAufgabe(),
				//new UmkehrAufgabe(),
//				new GroesserKleinerAufgabe(),
//				new GroesserAufgabe(),
//				new KleinerAufgabe(),
				//new FindeBAufgabe(),
		};
		
		for (int i = 0; i < 100; i++) {
			System.out.println(rand(aufgaben1).doGen(MAX_TOTAL));
			System.out.println(rand(aufgaben2).doGen(MAX_TOTAL));
			if ((i + 1) % 5==0) {
				 System.out.println();
			}
		}
		
	}
	
	protected CalcGenerator rand(final CalcGenerator[] aufgaben) {
		final int min = 0;
		final int max = aufgaben.length - 1;
		final int index = rand.nextInt((max - min) + 1) + min;
		
		return aufgaben[index];
	}
}
