package com.jbobadilla.manyToManyDirect;

public class ManyToManyDirect {
    public static void main(String[] args) {
        Empresa empresa01 = new Empresa("4040606080", "Nestle");
        Empresa empresa02 = new Empresa("1002005454", "Gloria");

        Empleado empleado01 = new Empleado("123456789", "Juan", "Perez");
        Empleado empleado02 = new Empleado("987654321", "Maria", "Lopez");
        Empleado empleado03 = new Empleado("000000000", "Pedro", "Garcia");
        Empleado empleado04 = new Empleado("111111111", "Ana", "Gonzalez");
        Empleado empleado05 = new Empleado("222222222", "Jose", "Martinez");

        empresa01.contratar(empleado01);
        empresa01.contratar(empleado02);
        empresa01.contratar(empleado03);

        empresa02.contratar(empleado02);
        empresa02.contratar(empleado04);
        empresa02.contratar(empleado05);

        empresa01.solicitarInforme("987654321");
        empresa02.solicitarInforme("987654321");
    }


}
