public abstract class Pieza {

    String nombre;
    boolean blanca;
    String color;

    public Pieza(boolean es_blanca) {
        this.blanca = es_blanca;
        if (es_blanca) {
            color = "blanca";
        } else {
            color = "negra";
        }
        // System.out.println("Hola! Soy una pieza " + color +"!");

    }
}
