package pieces;

public class Torre {

    private boolean playerOne;
    private boolean upGrade;
    private String[][] matrizTorre = new String[3][3];
    private String nombre;

    public Torre() {
        generadorMatrizTorre();
    }

    private void generadorMatrizTorre() {
        matrizTorre[0][0] = "   ";
        matrizTorre[0][1] = "█";
        matrizTorre[0][2] = "  ";

        matrizTorre[1][0] = " █";
        matrizTorre[1][1] = " t ";
        matrizTorre[1][2] = "█";

        matrizTorre[2][0] = "   ";
        matrizTorre[2][1] = "█";
        matrizTorre[2][2] = "  ";

    }

    private void generadorMatrizPeonUpgrade() {
        matrizTorre[0][0] = " x ";
        matrizTorre[0][1] = "█";
        matrizTorre[0][2] = " x ";

        matrizTorre[1][0] = " █";
        matrizTorre[1][1] = " T ";
        matrizTorre[1][2] = "█";

        matrizTorre[2][0] = " x ";
        matrizTorre[2][1] = "█";
        matrizTorre[2][2] = " x ";

    }

    public void showMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizTorre[i][j]);
            }
            System.out.println("");
        }
        generadorMatrizPeonUpgrade();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizTorre[i][j]);
            }
            System.out.println("");
        }
    }
}
