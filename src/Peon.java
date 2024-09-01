public class Peon extends Pieza{

    public Peon(String color, int fila, int columna) {
        super(color, fila, columna);
        
    }

    @Override
    public boolean movimientoValido(int filaDestino, int columnaDestino) {
        int difFila = filaDestino - getFila();
        int difColumna = Math.abs(columnaDestino - getColumna());

        // Movimiento regular (1 casilla adelante o 2 casillas adelante desde la fila inicial)
        if (difColumna == 0) {
            if (difFila == 1) {
                return true; // Movimiento regular (1 casilla adelante)
            }
            if (difFila == 2 && getFila() == 2) {
                return true; // Movimiento inicial (2 casillas adelante)
            }
        }

        // Captura diagonal
        if (difColumna == 1 && difFila == 1) {
            return true; // Captura diagonal
        }

        return false; // Movimiento inválido
    }

    @Override
    public String toString() {
        return "P"; 
    }

}
