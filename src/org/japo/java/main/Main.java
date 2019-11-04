/* 
 * Copyright 2019 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
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
 */
package org.japo.java.main;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public final class Main {

    public static void main(String[] args) {

        // Variables
        int totalPatas;
        int totalPares;
        int patasanimal1;
        int patasanimal2;
        int patasanimal3;
        int patasanimal4;

        //Constantes
        final String animal = "Vaca";
        final int vaca = 3;
        
        final String animal2 = "Oveja";
        final int oveja = 14;
        
        final String animal3 = "Burro";
        final int burro = 2;
        
        final String animal4 = "Gallina";
        final int gallina = 18;

        final int cuadropedo = 4;
        final int bipedo = 2;

        //Operaciones
              System.out.printf("Secuencia de Patas%n");
              System.out.printf("====================%n");
        //Vaca
              System.out.printf("Animal .........: %s%n", animal);
              System.out.printf("Cantidad .......: %d%n", vaca);
              patasanimal1 = vaca * cuadropedo;
              System.out.printf("Patas ..........: %d%n", patasanimal1);
        
        //Oveja
             System.out.printf("---%n");
             System.out.printf("Animal .........: %s%n", animal2);
             System.out.printf("Cantidad .......: %d%n", oveja);
             patasanimal2 = oveja * cuadropedo;
             System.out.printf("Patas ..........: %d%n", patasanimal2);
             System.out.printf("---%n");
        
        //Burro
             System.out.printf("Animal .........: %s%n", animal3);
             System.out.printf("Cantidad .......: %d%n", oveja);
             patasanimal3 = burro * cuadropedo;
             System.out.printf("Patas ..........: %d%n", patasanimal3);
             System.out.printf("---%n");
        
        //Gallina
             System.out.printf("Animal .........: %s%n", animal4);
             System.out.printf("Cantidad .......: %d%n", gallina);
             patasanimal4 = gallina * bipedo;
             System.out.printf("Patas ..........: %d%n", patasanimal4);
             System.out.printf("---%n");
             
        //Totales
             totalPatas = patasanimal1 + patasanimal2 + patasanimal3 
                     + patasanimal4;
             System.out.printf("Total de Patas .: %d%n", totalPatas);
             totalPares = totalPatas / 2;
             System.out.printf("Total de Pares .: %d%n", totalPares);
    }
}
