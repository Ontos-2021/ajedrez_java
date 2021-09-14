public class Dama extends Pieza {

    public Dama(boolean es_blanca) {
        super(es_blanca);
        nombre = "Dama";

        if (es_blanca) {
            color = "blanca";
        } else {
            color = "negra";
        }
        System.out.println("Hola! Soy una Dama " + color + "!");
    }

}
