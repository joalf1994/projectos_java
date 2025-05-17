package com.jbobadilla.oneToOneDirect;

import java.time.LocalDate;

public class OneToOneDirect {
    public static void main(String[] args) {
        /* Relación 1 a 1 Directa:
         * Persona y Pasaporte
         * Directa: Solo la persona conoce su pasaporte.
         * Una persona tiene un único pasaporte.
         * Cada pasaporte pertenece a una única persona.
         */

        /* Persona 01 */
        Persona p1 = new Persona();
        p1.setDni("1234567890");
        p1.setNombre("Maria");
        p1.setApellido("Castro");
        p1.setFechaNacimiento(LocalDate.of(1990, 1, 1));
        p1.setNacionalidad("Peru");
        p1.setNroPasaporte("1234");
        p1.imprimir();

        /* Persona 02 */
        Persona p2 = new Persona("20202020", "Carlos", "Chavez", LocalDate.of(2020, 2, 2));
        p2.imprimir();

        /* Persona 03*/
        Persona p3 = new Persona("10101010", "alfie", "bobadilla", LocalDate.of(1994, 3, 8), "España", "Esp-451");
        p3.imprimir();


    }
}
