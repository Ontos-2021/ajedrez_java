public class Rey extends Pieza {

    public Rey(boolean es_blanca) {
        super(es_blanca);
        nombre = "Rey";

        if (es_blanca) {
            color = "blanco";
        } else {
            color = "negro";
        }
        System.out.println("Hola! Soy un Rey " + color + "!");
    }
}
