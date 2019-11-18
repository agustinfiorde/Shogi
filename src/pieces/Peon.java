package pieces;

public class Peon {

    private boolean playerOne;
    private boolean upGrade;
    private String[][] matrizPeon = new String[3][3];
    private String nombre;

    public Peon() {
        generadorMatrizPeon();
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
        matrizPeon[0][0] = " x ";
        matrizPeon[0][1] = " x ";
        matrizPeon[0][2] = " x ";

        matrizPeon[1][0] = " x ";
        matrizPeon[1][1] = " P ";
        matrizPeon[1][2] = " x ";

        matrizPeon[2][0] = "   ";
        matrizPeon[2][1] = " x ";
        matrizPeon[2][2] = "   ";

    }

    public void showMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizPeon[i][j]);
            }
            System.out.println("");
        }
        generadorMatrizPeonUpgrade();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizPeon[i][j]);
            }
            System.out.println("");
        }
    }

}
