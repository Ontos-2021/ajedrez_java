public class Tablero {
    Casillero[][] casillas = new Casillero[8][8];

    public Tablero() {

        System.out.println("Hola! Soy un tablero!");
        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j < 8; j++) {
                this.casillas[i][j] = new Casillero();
            }
        }
    }
}
