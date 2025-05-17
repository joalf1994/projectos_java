package com.jbobadilla.oneToManyDirect;

import java.time.LocalDate;

public class OneToManyDirect {
    public static void main(String[] args) {
        /* Relación Directa de Uno a Muchos:
         * Solo Cliente conoce sus Pedidos.
         * Desde el cliente accedes a todos sus pedidos, pero un pedido no conoce a su cliente.
         */
        Cliente c1 = new Cliente("10101010", "Carlos", "Perez");
        Factura f1 = new Factura("121212121212", "F001-23", LocalDate.of(2025,5,12), "caja de chocolates", 30.0);
        c1.addFactura(f1);
        c1.addFactura("13131313", "F001-1212", LocalDate.of(2025,4,10), "Cocina a gas", 2500);
        c1.verPedido("F001-1212");


        Cliente c2 = new Cliente("20202020", "Pedro", "Alvarez");
        c2.addFactura("11111111", "F001-4545", LocalDate.of(2025,2,28), "licuadora oster", 150);
        c2.verPedido("F001-4545");
    }
}


