public class Tablero {
    private Pieza[][] tablero;

    public Tablero() {
        // Inicializa el tablero con un tamaño de 8x8
        tablero = new Pieza[8][8];
        inicializarTablero();
    }

    private void inicializarTablero() {
        // Coloca las piezas en sus posiciones iniciales
        // Piezas blancas
        tablero[0][0] = new Torre("blanco", 0, 0);
        tablero[0][1] = new Caballo("blanco", 0, 1);
        tablero[0][2] = new Alfil("blanco", 0, 2);
        tablero[0][3] = new Dama("blanco", 0, 3);
        tablero[0][4] = new Rey("blanco", 0, 4);
        tablero[0][5] = new Alfil("blanco", 0, 5);
        tablero[0][6] = new Caballo("blanco", 0, 6);
        tablero[0][7] = new Torre("blanco", 0, 7);
        for (int i = 0; i < 8; i++) {
            tablero[1][i] = new Peon("blanco", 1, i);
        }

        // Piezas negras
        tablero[7][0] = new Torre("negro", 7, 0);
        tablero[7][1] = new Caballo("negro", 7, 1);
        tablero[7][2] = new Alfil("negro", 7, 2);
        tablero[7][3] = new Dama("negro", 7, 3);
        tablero[7][4] = new Rey("negro", 7, 4);
        tablero[7][5] = new Alfil("negro", 7, 5);
        tablero[7][6] = new Caballo("negro", 7, 6);
        tablero[7][7] = new Torre("negro", 7, 7);
        for (int i = 0; i < 8; i++) {
            tablero[6][i] = new Peon("negro", 6, i);
        }
    }

    public Pieza getPieza(int fila, int columna) {
        return tablero[fila][columna];
    }

    public void moverPieza(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
        Pieza pieza = getPieza(filaOrigen, columnaOrigen);
        if (pieza == null) {
            System.out.println("No hay pieza en la posición de origen.");
            return;
        }

        if (pieza.movimientoValido(filaDestino, columnaDestino)) {
            tablero[filaDestino][columnaDestino] = pieza;
            tablero[filaOrigen][columnaOrigen] = null;
            pieza.setFila(filaDestino);
            pieza.setColumna(columnaDestino);
        } else {
            System.out.println("Movimiento inválido para la pieza.");
        }
    }

    public void imprimirTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tablero[i][j] != null) {
                    System.out.print(tablero[i][j] + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
