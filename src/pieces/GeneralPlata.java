package pieces;

public class GeneralPlata {

    private String nombre;
    private boolean playerOne;
    private boolean upGrade;
    private String[][] matrizGeneralPlata = new String[3][3];
    private String[][] matrizGeneralPlataUp = new String[3][3];

    public GeneralPlata() {
        generadorMatrizGP();
        generadorMatrizGPUp();
    }

    private void generadorMatrizGP() {
        matrizGeneralPlata[0][0] = " x ";
        matrizGeneralPlata[0][1] = " x ";
        matrizGeneralPlata[0][2] = " x ";

        matrizGeneralPlata[1][0] = "   ";
        matrizGeneralPlata[1][1] = " GP";
        matrizGeneralPlata[1][2] = "   ";

        matrizGeneralPlata[2][0] = " x ";
        matrizGeneralPlata[2][1] = "   ";
        matrizGeneralPlata[2][2] = " x  ";

    }

    private void generadorMatrizGPUp() {
        matrizGeneralPlataUp[0][0] = " x ";
        matrizGeneralPlataUp[0][1] = " x  ";
        matrizGeneralPlataUp[0][2] = "x ";

        matrizGeneralPlataUp[1][0] = " x ";
        matrizGeneralPlataUp[1][1] = " GO ";
        matrizGeneralPlataUp[1][2] = "x ";

        matrizGeneralPlataUp[2][0] = "   ";
        matrizGeneralPlataUp[2][1] = " x  ";
        matrizGeneralPlataUp[2][2] = "   ";

    }

    public void showMatrizGeneralPlata() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizGeneralPlata[i][j]);
            }
            System.out.println("");
        }
    }

    public void showMatrizGeneralPlaraUpgrade() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizGeneralPlata[i][j]);
            }
            System.out.println("");
        }
    }

    public boolean movimientoGeneralPlata(boolean player1, Integer xPos, Integer yPos, Integer xMov, Integer yMov) {
        boolean puede=false;

        return puede;
    }
    //Copiar General oro
    public boolean movimientoGeneralPlataUp(boolean player1, Integer xPos, Integer yPos, Integer xMov, Integer yMov) {
        boolean puede=false;

        return puede;
    }
}
