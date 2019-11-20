package pieces;

public class GeneralOro {

    private String nombre;
    private boolean playerOne;
    private String[][] matrizGeneralOro = new String[3][3];

    public GeneralOro() {
        generadorMatrizGO();
    }

    private void generadorMatrizGO() {
        matrizGeneralOro[0][0] = " x ";
        matrizGeneralOro[0][1] = " x  ";
        matrizGeneralOro[0][2] = "x ";

        matrizGeneralOro[1][0] = " x ";
        matrizGeneralOro[1][1] = " GO ";
        matrizGeneralOro[1][2] = "x ";

        matrizGeneralOro[2][0] = "   ";
        matrizGeneralOro[2][1] = " x  ";
        matrizGeneralOro[2][2] = "   ";

    }

    public void showMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizGeneralOro[i][j]);
            }
            System.out.println("");
        }
    }

    public boolean movimientoGeneralOro(boolean player1, Integer xPos, Integer yPos, Integer xMov, Integer yMov) {
        boolean puede=false;

        return puede;
    }

}
