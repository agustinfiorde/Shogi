package pieces;

public class Lancero {

    private boolean playerOne;
    private boolean upGrade;
    private String[][] matrizLancero = new String[3][3];
    private String[][] matrizLanceroUp = new String[3][3];
    private String nombre;

    public Lancero() {
        generadorMatrizLancero();
        generadorMatrizUpgradeLancero();
        showMatrizLancero();
        showMatrizLanceroUpgrade();
    }

    private void generadorMatrizLancero() {
        matrizLancero[0][0] = "    ";
        matrizLancero[0][1] = "█";
        matrizLancero[0][2] = "   ";

        matrizLancero[1][0] = "   ";
        matrizLancero[1][1] = " l ";
        matrizLancero[1][2] = "  ";

        matrizLancero[2][0] = "  ";
        matrizLancero[2][1] = "  ";
        matrizLancero[2][2] = "  ";

    }

    private void generadorMatrizUpgradeLancero() {
        matrizLanceroUp[0][0] = " x ";
        matrizLanceroUp[0][1] = " x ";
        matrizLanceroUp[0][2] = " x ";

        matrizLanceroUp[1][0] = " x ";
        matrizLanceroUp[1][1] = " L ";
        matrizLanceroUp[1][2] = " x ";

        matrizLanceroUp[2][0] = "   ";
        matrizLanceroUp[2][1] = " x ";
        matrizLanceroUp[2][2] = "   ";

    }

    public void showMatrizLancero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizLancero[i][j]);
            }
            System.out.println("");
        }
    }

    public void showMatrizLanceroUpgrade() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizLanceroUp[i][j]);
            }
            System.out.println("");
        }
    }

    //Desplazamiento largos
    public boolean movimientoLancero(boolean player1, Integer xPos, Integer yPos, Integer xMov, Integer yMov) {
        boolean puede=false;

        return puede;
    }
    //General Oro
    public boolean movimientoLanceroUp(boolean player1, Integer xPos, Integer yPos, Integer xMov, Integer yMov) {
        boolean puede=false;

        return puede;
    }

}
