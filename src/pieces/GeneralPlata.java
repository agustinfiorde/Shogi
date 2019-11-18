package pieces;

public class GeneralPlata {

    private String nombre;
    private boolean playerOne;
    private boolean upGrade;
    private String[][] matrizGeneralPlata = new String[3][3];

    public GeneralPlata() {
        generadorMatrizGP();
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

    public void showMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizGeneralPlata[i][j]);
            }
            System.out.println("");
        }
    }
}
