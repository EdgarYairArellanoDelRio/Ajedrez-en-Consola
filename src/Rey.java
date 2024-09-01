public class Rey extends Pieza {

    public Rey(String color, int fila, int columna) {
        super(color, fila, columna);
        
    }

    @Override
    public boolean movimientoValido(int filaDestino, int columnaDestino) {
        int difFila = Math.abs(filaDestino - getFila());
        int difColumna = Math.abs(columnaDestino - getColumna());
        return (difFila <= 1 && difColumna <= 1); 
    }

    @Override
    public String toString(){
        return "R";
    }
   

}
