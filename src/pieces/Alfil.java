package pieces;

public class Alfil {

    private boolean playerOne;
    private boolean upGrade;
    private String[][] matrizAlfil = new String[3][3];
    private String[][] matrizAlfilUp = new String[3][3];
    private String nombre;

    public Alfil() {
        generadorMatrizAlfil();
        generadorMatrizUpgradeAlfil();
        showMatrizAlfil();
        showMatrizAlfilUpgrade();

    }

    private void generadorMatrizAlfil() {
        matrizAlfil[0][0] = " █";
        matrizAlfil[0][1] = "   ";
        matrizAlfil[0][2] = "█";

        matrizAlfil[1][0] = "    ";
        matrizAlfil[1][1] = "a ";
        matrizAlfil[1][2] = "   ";

        matrizAlfil[2][0] = " █";
        matrizAlfil[2][1] = "   ";
        matrizAlfil[2][2] = "█";

    }

    private void generadorMatrizUpgradeAlfil() {
        matrizAlfilUp[0][0] = " █";
        matrizAlfilUp[0][1] = " x ";
        matrizAlfilUp[0][2] = "█";

        matrizAlfilUp[1][0] = "  x ";
        matrizAlfilUp[1][1] = "A ";
        matrizAlfilUp[1][2] = "x ";

        matrizAlfilUp[2][0] = " █";
        matrizAlfilUp[2][1] = " x ";
        matrizAlfilUp[2][2] = "█";

    }

    public void showMatrizAlfil() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizAlfil[i][j]);
            }
            System.out.println("");
        }
    }

    public void showMatrizAlfilUpgrade() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizAlfilUp[i][j]);
            }
            System.out.println("");
        }
    }

    //Desplazamiento largos
    public boolean movimientoAlfil(boolean player1, Integer xPos, Integer yPos, Integer xMov, Integer yMov) {
        boolean puede=false;

        return puede;
    }

    //Desplazamiento largos
    public boolean movimientoAlfilUp(boolean player1, Integer xPos, Integer yPos, Integer xMov, Integer yMov) {
        boolean puede=false;

        return puede;
    }

}
