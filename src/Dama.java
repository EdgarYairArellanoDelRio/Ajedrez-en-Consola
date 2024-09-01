public class Dama extends Pieza {

    public Dama(String color, int fila, int columna) {
        super(color, fila, columna);
    }

    @Override
    public boolean movimientoValido(int filaDestino, int columnaDestino) {
        int difFila = Math.abs(filaDestino - getFila());
        int difColumna = Math.abs(columnaDestino - getColumna());

        // La dama puede moverse en línea recta horizontal, vertical o diagonal
        return (difFila == 0 || difColumna == 0 || difFila == difColumna);
    }

    @Override
    public String toString() {
        return "D"; 
    }
}
