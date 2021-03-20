/**
 * Copyright 2015 Philipp Arndt
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.rnd7.calcsheet;

import de.rnd7.calcsheet.gens.PlusMinusAufgabeKl5;

import java.util.Random;

public class Main {
    private static final int MAX_TOTAL = 150;
    private static final int MIN = 5;
    private final Random rand = new Random();


    public Main() {
        final CalcGenerator[] aufgaben1 = new CalcGenerator[]{
//          new PlusAufgabe(MIN),
//          new MinusAufgabe(MIN),
//          new MinusAufgabe(MIN),
//          new MinusAufgabe(MIN),
            new PlusMinusAufgabeKl5(11),
            new PlusMinusAufgabeKl5(65),
            new PlusMinusAufgabeKl5(1),
//          new UmkehrAufgabe(),
//          new GroesserKleinerAufgabe(),
//          new GroesserAufgabe(),
//          new KleinerAufgabe(),
//          new FindeBAufgabe(),
        };

        for (int i = 0; i < 100; i++) {
            System.out.println(rand(aufgaben1).doGen(MAX_TOTAL));
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }

    }

    public static void main(final String[] args) {
        new Main();

    }

    protected CalcGenerator rand(final CalcGenerator[] aufgaben) {
        final int min = 0;
        final int max = aufgaben.length - 1;
        final int index = rand.nextInt((max - min) + 1) + min;

        return aufgaben[index];
    }
}
