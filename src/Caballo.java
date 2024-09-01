public class Caballo extends Pieza {

    public Caballo(String color, int fila, int columna) {
        super(color, fila, columna);
    }

    @Override
    public boolean movimientoValido(int filaDestino, int columnaDestino) {
        int difFila = Math.abs(filaDestino - getFila());
        int difColumna = Math.abs(columnaDestino - getColumna());

        // El movimiento del caballo es en forma de L: 2+1 o 1+2
        return (difFila == 2 && difColumna == 1) || (difFila == 1 && difColumna == 2);
    }

    @Override
    public String toString() {
        return "C"; 
    }
}