package poo;

public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris"),
    TURQUESA("Turquesa");

    private final String color;

    Color (String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

}
