public class Alfil extends Pieza {

    public Alfil(boolean es_blanca) {
        super(es_blanca);
        nombre = "Alfil";

        if (es_blanca) {
            color = "blanco";
        } else {
            color = "negro";
        }
        System.out.println("Hola! Soy un Alfil " + color + "!");
    }
}
