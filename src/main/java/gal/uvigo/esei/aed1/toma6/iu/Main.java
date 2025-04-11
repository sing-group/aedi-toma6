/*-
 * #%L
 * Proyecto_Toma6_Plantilla
 * %%
 * Copyright 2024 Florentino Fernández Riverola,  Rosalía Laza Fidalgo, María Novo Lourés, Reyes Pavón Rial.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gal.uvigo.esei.aed1.toma6.iu;

import gal.uvigo.esei.aed1.toma6.core.Juego;

public class Main {

    public static void main(String[] args) {
        IU iu = new IU();
        Juego toma6 = new Juego(iu);
        toma6.jugar();
    }
}
