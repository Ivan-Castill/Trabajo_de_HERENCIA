package PROBLEMA;

public class Portero extends Jugador {
    private int atajadas;
    private int golesRecibidos;

    // Constructor
    public Portero(String nombre, int edad, String equipo, int atajadas, int golesRecibidos) {
        super(nombre, edad, equipo); // Hereda atributos de Jugador
        this.atajadas = atajadas;
        this.golesRecibidos = golesRecibidos;
    }

    // Sobrescribir el método
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llamar al método de la superclase
        System.out.println("Atajadas: " + atajadas);
        System.out.println("Goles Recibidos: " + golesRecibidos);
    }
}