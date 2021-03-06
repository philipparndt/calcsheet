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
package de.rnd7.calcsheet.gens;

import de.rnd7.calcsheet.CalcGenerator;

public class KleinerAufgabe extends CalcGenerator {

    private static final int MIN = 3;

    @Override
    public String doGen(final int solutionMax) {
        final int a = rand(MIN, solutionMax);

        return String.format("%d\t<", a);
    }

}
