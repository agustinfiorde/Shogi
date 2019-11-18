package pieces;

public class Caballo {

    private boolean playerOne;
    private boolean upGrade;
    private String[][] matrizCaballo = new String[3][3];
    private String nombre;

    public Caballo() {
        generadorMatrizCaballo();
    }

    private void generadorMatrizCaballo() {
        matrizCaballo[0][0] = " x ";
        matrizCaballo[0][1] = "   ";
        matrizCaballo[0][2] = " x ";

        matrizCaballo[1][0] = "   ";
        matrizCaballo[1][1] = "   ";
        matrizCaballo[1][2] = "   ";

        matrizCaballo[2][0] = "   ";
        matrizCaballo[2][1] = " c ";
        matrizCaballo[2][2] = "   ";

    }

    private void generadorMatrizUpgradeCaballo() {
        matrizCaballo[0][0] = " x ";
        matrizCaballo[0][1] = " x ";
        matrizCaballo[0][2] = " x ";

        matrizCaballo[1][0] = " x ";
        matrizCaballo[1][1] = " C ";
        matrizCaballo[1][2] = " x ";

        matrizCaballo[2][0] = "   ";
        matrizCaballo[2][1] = " x ";
        matrizCaballo[2][2] = "   ";

    }

    public void showMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizCaballo[i][j]);
            }
            System.out.println("");
        }
        generadorMatrizUpgradeCaballo();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizCaballo[i][j]);
            }
            System.out.println("");
        }
    }

}
