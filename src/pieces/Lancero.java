
package pieces;

public class Lancero {
    
    private boolean playerOne;
    private boolean upGrade;
    private String[][] matrizLancero = new String[3][3];
    private String nombre;

    public Lancero() {
        generadorMatrizLancero();
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
        matrizLancero[0][0] = " x ";
        matrizLancero[0][1] = " x ";
        matrizLancero[0][2] = " x ";

        matrizLancero[1][0] = " x ";
        matrizLancero[1][1] = " L ";
        matrizLancero[1][2] = " x ";

        matrizLancero[2][0] = "   ";
        matrizLancero[2][1] = " x ";
        matrizLancero[2][2] = "   ";

    }

    public void showMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizLancero[i][j]);
            }
            System.out.println("");
        }
        generadorMatrizUpgradeLancero();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizLancero[i][j]);
            }
            System.out.println("");
        }
    }
    
}
