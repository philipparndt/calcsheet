/**
 * Copyright 2015 Philipp Arndt
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */package de.rnd7.calcsheet.gens;

import de.rnd7.calcsheet.CalcGenerator;

public class PlusMinusAufgabeKl5 extends CalcGenerator {

	private final int min;

	public PlusMinusAufgabeKl5(final int min) {
		this.min = min;
	}
	
	@Override
	public String doGen(final int solutionMax) {
		int anzahl=rand(3, 4);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<anzahl;i++) {
			if (sb.length() != 0) {
				sb.append(String.format("\t%s\t", nextOp()));
			}
			
			sb.append(String.format("(%s)", nextValue(solutionMax)));
		}

		sb.append("\t=");
		return sb.toString();
	}

	private int nextValue(final int solutionMax) {
		int a = rand(min, solutionMax);
		
		if (randBoolean()) {
			a *= -1;
		}
		return a;
	}

	private String nextOp() {
		String op = "+";
		
		if (randBoolean()) {
			op = "-";
		}
		return op;
	}

}
