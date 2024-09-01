

public class App {
    public static void main(String[] args) throws Exception {
        // Crear un nuevo tablero de ajedrez
        Tablero tablero = new Tablero();

        // Imprimir el tablero inicial
        System.out.println("Tablero inicial:");
        tablero.imprimirTablero();

        tablero.moverPieza(1, 0, 3, 0);

        // Mover un caballo blanco de (0, 1) a (2, 2)
        tablero.moverPieza(0, 1, 2, 2);

        // Imprimir el tablero después de los movimientos
        System.out.println("\nTablero después de los movimientos:");
        tablero.imprimirTablero();
    }
}
