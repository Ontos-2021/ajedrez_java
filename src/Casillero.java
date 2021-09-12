public class Casillero {

    boolean vacio;
    Pieza pieza;

    public Casillero(boolean vacio, Pieza pieza) {
        this.vacio = vacio;
        this.pieza = pieza;
    }

    public Casillero() {
        this.vacio = true;
        this.pieza = null;
        System.out.println("Hola! Soy un casillero!");
    }

    void poner_pieza(Pieza pieza) {
        this.pieza = pieza;
        this.vacio = false;
    }
    void sacar_pieza(Pieza pieza) {
        this.pieza = null;
        this.vacio = true;
    }


}
