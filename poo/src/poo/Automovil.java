package poo;

public class Automovil {
    /* Atributos de instancia */
    private String marca;
    private String modelo;
    private Color color;
    private double cilindrada;

    /* Atributos de clase */
    private static int nroRuedas;
    private static int contId;

    /* Métodos de clase*/
    public static int getNroRuedas() {
        return nroRuedas;
    }
    public static void setNroRuedas(int nroRuedas) {
        Automovil.nroRuedas = nroRuedas;
    }

    /* Métodos de instancia */
    //Sobrecarga de constructores
    public Automovil() {
        ++contId; //contador de numero de instancia del objeto
    }

    public Automovil(String marca, String modelo) {
        this();
        this.marca = marca;
        this.modelo = modelo;
    }

    public Automovil(String marca, String modelo, Color color, double cilindrada) {
        this(marca, modelo);
        this.color = color;
        this.cilindrada = cilindrada;
    }

    //Getter and Setter
    public static int getContId() {
        return contId;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Automovil " + Automovil.getContId() + ": " +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color=" + color +
                ", cilindrada=" + cilindrada;
    }
}
