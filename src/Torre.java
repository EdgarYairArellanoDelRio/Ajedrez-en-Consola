public class Torre extends Pieza{

    public Torre(String color, int fila, int columna) {
        super(color, fila, columna);
    }

    @Override
    public boolean movimientoValido(int filaDestino, int columnaDestino) {
        int difFila = Math.abs(filaDestino - getFila());
        int difColumna = Math.abs(columnaDestino - getColumna());
        return (difFila == 0 || difColumna == 0);
    }

    @Override
    public String toString() {
        return "T"; 
    }


    

}
