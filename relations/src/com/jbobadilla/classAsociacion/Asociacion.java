package com.jbobadilla.classAsociacion;

import com.sun.nio.sctp.PeerAddressChangeNotification;

import java.util.Date;

public class Asociacion {
    public static void main(String[] args) {
        Empresa emp1 = new Empresa("1010101010", "UNT");
        Empresa emp2 = new Empresa("2020202020", "UPN");

        Persona p1 = new Persona("99999999", "Carlos");
        Persona p2 = new Persona("88888888", "Juan");
        Persona p3 = new Persona("77777777", "Maria");
        Persona p4 = new Persona("66666666", "Ana");
        Persona p5 = new Persona("55555555", "Pedro");

        emp1.contratar(p1, 630.5f, new Date(16,10,2023));
        emp1.contratar(p3, 500.5f, new Date(8,5,2024));
        emp1.contratar(p4, 400.5f, new Date(2,2,2025));

        emp2.contratar(p2, 300.5f, new Date(15,4,2024));
        emp2.contratar(p3, 100.5f, new Date(26,11,2022));
        emp2.contratar(p4, 200.5f, new Date(9,7,2024));

        emp1.listarEmpleados();
    }
}
