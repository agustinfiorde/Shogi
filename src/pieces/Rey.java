package pieces;

public class Rey {

    //Es necesario?
    private boolean state;
    private boolean jaque;
    public static String matrizRey[][] = new String[3][3];

    public Rey() {
        generadorMatrizRey();
        jaque = false;
        state = true;
    }

    private void generadorMatrizRey() {
        matrizRey[0][0] = " x ";
        matrizRey[0][1] = " x ";
        matrizRey[0][2] = " x ";

        matrizRey[1][0] = " x  ";
        matrizRey[1][1] = "R";
        matrizRey[1][2] = "  x ";

        matrizRey[2][0] = " x ";
        matrizRey[2][1] = " x ";
        matrizRey[2][2] = " x ";

    }

    public void showMatrizRey() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizRey[i][j]);
            }
            System.out.println("");
        }
    }

    public static boolean movimientoRey(boolean player1, Integer xPos, Integer yPos, Integer xMov, Integer yMov) {
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
