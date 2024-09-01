public class Alfil extends Pieza {

    public Alfil(String color, int fila, int columna) {
        super(color, fila, columna);
        
    }

    @Override
    public boolean movimientoValido(int filaDestino, int columnaDestino) {
        int difFila = Math.abs(filaDestino - getFila());
        int difColumna = Math.abs(columnaDestino - getColumna());
        return (difFila == difColumna);

    }

    @Override
    public String toString(){
        return "A";
    }

}
