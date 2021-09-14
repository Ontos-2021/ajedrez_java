public class Tablero {
    Casillero[][] casillas = new Casillero[8][8];
    Pieza pieza;

    public Tablero() {

        System.out.println("Hola! Soy un tablero!");
        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j < 8; j++) {
                this.casillas[i][j] = new Casillero(nombrar_casilla(i, j));
            }
        }
    }

    String nombrar_casilla(int eje_x, int eje_y) {
        String letra = "", numero = "";

        switch (eje_x) {
            case 0 -> letra = "A";
            case 1 -> letra = "B";
            case 2 -> letra = "C";
            case 3 -> letra = "D";
            case 4 -> letra = "E";
            case 5 -> letra = "F";
            case 6 -> letra = "G";
            case 7 -> letra = "H";
        }

        switch (eje_y) {
            case 0 -> numero = "1";
            case 1 -> numero = "2";
            case 2 -> numero = "3";
            case 3 -> numero = "4";
            case 4 -> numero = "5";
            case 5 -> numero = "6";
            case 6 -> numero = "7";
            case 7 -> numero = "8";
        }

        return (letra + numero);
    }

    void llenar_tablero() {

        for (int i = 0; i <8; i++) {
            for (int j = 0; j <8; j++) {
                String posicion = this.casillas[i][j].posicion;
                Pieza pieza = elegir_pieza(posicion);
                if (pieza != null) {
                    this.casillas[i][j].poner_pieza(pieza);
                }
            }
        }
    }

    Pieza elegir_pieza(String posicion) {
        switch (posicion) {

            case "A2":
            case "B2":
            case "C2":
            case "D2":
            case "E2":
            case "F2":
            case "G2":
                pieza = new Peon();
                break;
            case "A7":
                pieza = new Peon();
                break;
            case "B7":
                pieza = new Peon();
                break;
            case "C7":
                pieza = new Peon();
                break;
            case "D7":
                pieza = new Peon();
                break;
            case "E7":
                pieza = new Peon();
                break;
            case "F7":
                pieza = new Peon();
                break;
            case "G7":
                pieza = new Peon();
                break;
            case "H7":
                pieza = new Peon();
                break;


            default:
                return null;
        }
    return pieza;
    }

}
