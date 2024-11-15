package PROBLEMA;

public class Delantero extends Jugador {

    // Constructor
    public Delantero(String nombre, int edad, String equipo) {
        super(nombre, edad, equipo); // Hereda atributos de Jugador
    }

    // Utilizar el método heredado
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }
}