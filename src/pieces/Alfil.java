package pieces;

public class Alfil {

    private boolean playerOne;
    private boolean upGrade;
    private String[][] matrizAlfil = new String[3][3];
    private String nombre;

    public Alfil() {
        generadorMatrizAlfil();
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

    private void generadorMatrizUpgradeCaballo() {
        matrizAlfil[0][0] = " █";
        matrizAlfil[0][1] = " x ";
        matrizAlfil[0][2] = "█";

        matrizAlfil[1][0] = "  x ";
        matrizAlfil[1][1] = "A ";
        matrizAlfil[1][2] = "x ";

        matrizAlfil[2][0] = " █";
        matrizAlfil[2][1] = " x ";
        matrizAlfil[2][2] = "█";

    }

    public void showMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizAlfil[i][j]);
            }
            System.out.println("");
        }
        generadorMatrizUpgradeCaballo();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizAlfil[i][j]);
            }
            System.out.println("");
        }
    }

}
