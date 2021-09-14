public class Caballo extends Pieza {

    public Caballo(boolean es_blanca) {
        super(es_blanca);
        nombre = "Caballo";

        if (es_blanca) {
            color = "blanco";
        } else {
            color = "negro";
        }
        System.out.println("Hola! Soy un Caballo " + color + "!");
    }

}
