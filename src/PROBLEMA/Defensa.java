package PROBLEMA;

public class Defensa extends Jugador {
    private int bloqueos;

    // Constructor
    public Defensa(String nombre, int edad, String equipo, int bloqueos) {
        super(nombre, edad, equipo); // Hereda atributos de Jugador
        this.bloqueos = bloqueos;
    }

    // Sobrescribir el método
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llamar al método de la superclase
        System.out.println("Bloqueos: " + bloqueos);
    }
}