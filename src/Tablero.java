public class Tablero {
    Casillero[][] casillas = new Casillero[8][8];

    public Tablero() {

        System.out.println("Hola! Soy un tablero!");
        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j < 8; j++) {
                this.casillas[i][j] = new Casillero(nombre_casilla(i, j));
            }
        }
    }

    String nombre_casilla(int eje_x, int eje_y) {
        String letra = "", numero = "";

        switch (eje_x) {

            case 0:
                letra = "A";
                break;
            case 1:
                letra = "B";
                break;
            case 2:
                letra = "C";
                break;
            case 3:
                letra = "D";
                break;
            case 4:
                letra = "E";
                break;
            case 5:
                letra = "F";
                break;
            case 6:
                letra = "G";
                break;
            case 7:
                letra = "H";
                break;
        }

        switch (eje_y) {

            case 0:
                numero = "1";
                break;
            case 1:
                numero = "2";
                break;
            case 2:
                numero = "3";
                break;
            case 3:
                numero = "4";
                break;
            case 4:
                numero = "5";
                break;
            case 5:
                numero = "6";
                break;
            case 6:
                numero = "7";
                break;
            case 7:
                numero = "8";
                break;
        }

        return (letra + numero);
    }
}
