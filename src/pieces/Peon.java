package pieces;

public class Peon {

    private boolean playerOne;
    private boolean upGrade;
    private String[][] matrizPeon = new String[3][3];
    private String[][] matrizPeonUp = new String[3][3];
    private String nombre;

    public Peon() {
        generadorMatrizPeon();
        generadorMatrizPeonUpgrade();
    }

    private void generadorMatrizPeon() {
        matrizPeon[0][0] = "   ";
        matrizPeon[0][1] = " x ";
        matrizPeon[0][2] = "   ";

        matrizPeon[1][0] = "   ";
        matrizPeon[1][1] = " p";
        matrizPeon[1][2] = "   ";

        matrizPeon[2][0] = "   ";
        matrizPeon[2][1] = "   ";
        matrizPeon[2][2] = "   ";

    }

    private void generadorMatrizPeonUpgrade() {
        matrizPeonUp[0][0] = " x ";
        matrizPeonUp[0][1] = " x ";
        matrizPeonUp[0][2] = " x ";

        matrizPeonUp[1][0] = " x ";
        matrizPeonUp[1][1] = " P ";
        matrizPeonUp[1][2] = " x ";

        matrizPeonUp[2][0] = "   ";
        matrizPeonUp[2][1] = " x ";
        matrizPeonUp[2][2] = "   ";

    }

    public void showMatrizPeon() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizPeon[i][j]);
            }
            System.out.println("");
        }
    }

    public void showMatrizPeonUpgrade() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizPeonUp[i][j]);
            }
            System.out.println("");
        }
    }

    public boolean movimientoPeon(boolean player1, Integer xPos, Integer yPos, Integer xMov, Integer yMov) {
        boolean puede = false;

        return puede;
    }
    //General oro
    public boolean movimientoPeonUp(boolean player1, Integer xPos, Integer yPos, Integer xMov, Integer yMov) {
        boolean puede = false;

        return puede;
    }

}
