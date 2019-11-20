package pieces;

public class Caballo {

    private boolean upGrade;
    private String[][] matrizCaballo = new String[3][3];
    private String[][] matrizCaballoUp = new String[3][3];
    private String nombre;

    public Caballo() {
        generadorMatrizCaballo();
        generadorMatrizUpgradeCaballo();
    }

    private void generadorMatrizCaballo() {
        matrizCaballo[0][0] = " x ";
        matrizCaballo[0][1] = "   ";
        matrizCaballo[0][2] = " x ";

        matrizCaballo[1][0] = "   ";
        matrizCaballo[1][1] = "   ";
        matrizCaballo[1][2] = "   ";

        matrizCaballo[2][0] = "   ";
        matrizCaballo[2][1] = " c ";
        matrizCaballo[2][2] = "   ";

    }

    private void generadorMatrizUpgradeCaballo() {
        matrizCaballoUp[0][0] = " x ";
        matrizCaballoUp[0][1] = " x ";
        matrizCaballoUp[0][2] = " x ";

        matrizCaballoUp[1][0] = " x ";
        matrizCaballoUp[1][1] = " C ";
        matrizCaballoUp[1][2] = " x ";

        matrizCaballoUp[2][0] = "   ";
        matrizCaballoUp[2][1] = " x ";
        matrizCaballoUp[2][2] = "   ";

    }

    public void showMatrizCaballo() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizCaballo[i][j]);
            }
            System.out.println("");
        }
    }

    public void showMatrizCaballoUpgrade() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizCaballoUp[i][j]);
            }
            System.out.println("");
        }
    }

    public boolean movimientoCaballo(boolean player1, Integer xPos, Integer yPos, Integer xMov, Integer yMov) {
        //arreglo[Y][X]
        if (player1) {
            if (xMov >= 0 && xMov <= 8 && yMov >= 0 && yMov <= 8 && ((yPos - yMov == 1) || yMov == yPos || (yMov - yPos == 1)) && ((xMov == xPos || (xPos - xMov == 1) || (xMov - xPos == 1)))) {
                return true;
            }
        } else {
            if (xMov >= 0 && xMov <= 8 && yMov >= 0 && yMov <= 8 && ((yPos - yMov == 1) || yMov == yPos || (yMov - yPos == 1)) && ((xMov == xPos || (xPos - xMov == 1) || (xMov - xPos == 1)))) {
                return true;
            }
        }
        return false;
    }
    //General Oro
    public boolean movimientoCaballoUp(boolean player1, Integer xPos, Integer yPos, Integer xMov, Integer yMov) {
        //arreglo[Y][X]
        if (player1) {
            if (xMov >= 0 && xMov <= 8 && yMov >= 0 && yMov <= 8 && ((yPos - yMov == 1) || yMov == yPos || (yMov - yPos == 1)) && ((xMov == xPos || (xPos - xMov == 1) || (xMov - xPos == 1)))) {
                return true;
            }
        } else {
            if (xMov >= 0 && xMov <= 8 && yMov >= 0 && yMov <= 8 && ((yPos - yMov == 1) || yMov == yPos || (yMov - yPos == 1)) && ((xMov == xPos || (xPos - xMov == 1) || (xMov - xPos == 1)))) {
                return true;
            }
        }
        return false;
    }
}
