public class Torre extends Pieza{


    public Torre(boolean es_blanca) {
        super(es_blanca);
        nombre = "Torre";
        if (es_blanca) {
            color = "blanca";
        } else {
            color = "negra";
        }
        System.out.println("Hola! Soy una Torre " + color + "!");
    }
}
