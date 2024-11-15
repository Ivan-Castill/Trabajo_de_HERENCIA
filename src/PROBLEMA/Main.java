package PROBLEMA;

public class Main {
    public static void main(String[] args) {
        Portero portero = new Portero("Juan", 30, "Equipo A", 100, 20);
        Defensa defensa = new Defensa("Carlos", 25, "Equipo B", 50);
        Delantero delantero = new Delantero("Pedro", 22, "Equipo C");

        portero.mostrarInfo();
        System.out.println();
        defensa.mostrarInfo();
        System.out.println();
        delantero.mostrarInfo();
    }
}