public abstract class Pieza {

    private String color;
    private int fila;
    private int columna;

    //Constructor
    public Pieza(String color, int fila, int columna){
        this.color = color;
        this.fila = fila;
        this.columna = columna;
    }

    //Metodos getter y setters
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    //Método abstracto para el movimiento
    public abstract boolean movimientoValido(int filaDestino, int columnaDestino);

    @Override
    public String toString(){
        return this.getClass().getSimpleName().substring(0, 1);
    }

}
