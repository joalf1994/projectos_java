package poo;

public class Principal {
    public static void main(String[] args) {
        Automovil suzuki = new Automovil("Suzuki", "T400");
        suzuki.setColor(Color.ROJO);
        suzuki.setCilindrada(12);
        System.out.println(suzuki.toString());

        Automovil toyota = new Automovil("Toyota", "hilux", Color.GRIS, 50);
        System.out.println(toyota.toString());

        Automovil chevrolet = new Automovil("Chevrolet", "T1000", Color.AZUL, 30);
        System.out.println(chevrolet.toString());


    }
}
