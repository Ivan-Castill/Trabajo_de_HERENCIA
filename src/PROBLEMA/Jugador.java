package PROBLEMA;

public class Jugador {
    protected String nombre;
    protected int edad;
    protected String equipo;

    // Constructor
    public Jugador(String nombre, int edad, String equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
    }

    // Método para mostrar la información del jugador
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Equipo: " + equipo);
    }
}