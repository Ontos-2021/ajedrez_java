public class Peon extends Pieza{

    public Peon(boolean es_blanca) {
        super(es_blanca);
        nombre = "Peón";
        if (es_blanca) {
            color = "blanco";
        } else {
            color = "negro";
        }
        System.out.println("Hola! Soy un Peón " + color + "!");

    }
}
