public class Casillero {

    boolean vacio;
    Pieza pieza;
    String posicion;

    public Casillero(boolean vacio, Pieza pieza) {
        this.vacio = vacio;
        this.pieza = pieza;
    }

    public Casillero(String posicion) {
        this.vacio = true;
        this.pieza = null;
        this.posicion = posicion;
        System.out.println("Hola! Soy un casillero!, y mi posición es: " + this.posicion);
    }

    void poner_pieza(Pieza pieza) {
        this.pieza = pieza;
        this.vacio = false;
        System.out.println("Se acaba de poner la pieza " + pieza + " en la casilla " + this.posicion);
    }
    void sacar_pieza(Pieza pieza) {
        this.pieza = null;
        this.vacio = true;
    }
}
