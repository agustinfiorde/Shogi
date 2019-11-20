package pieces;

public class Torre {

    private boolean playerOne;
    private boolean upGrade;
    private String[][] matrizTorre = new String[3][3];
    private String[][] matrizTorreUp = new String[3][3];
    private String nombre;

    public Torre() {
        generadorMatrizTorre();
        generadorMatrizTorreUpgrade();
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

    private void generadorMatrizTorreUpgrade() {
        matrizTorreUp[0][0] = " x ";
        matrizTorreUp[0][1] = "█";
        matrizTorreUp[0][2] = " x ";

        matrizTorreUp[1][0] = " █";
        matrizTorreUp[1][1] = " T ";
        matrizTorreUp[1][2] = "█";

        matrizTorreUp[2][0] = " x ";
        matrizTorreUp[2][1] = "█";
        matrizTorreUp[2][2] = " x ";

    }

    public void showMatrizTorre() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizTorre[i][j]);
            }
            System.out.println("");
        }
    }

    public void showMatrizTorreUpgrade() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizTorreUp[i][j]);
            }
            System.out.println("");
        }
    }

    //Desplazamiento largos
    public boolean movimientoTorre(boolean player1, Integer xPos, Integer yPos, Integer xMov, Integer yMov) {
        boolean puede=false;

        return puede;
    }
    
    //Desplazamiento largos
    public boolean movimientoTorreUp(boolean player1, Integer xPos, Integer yPos, Integer xMov, Integer yMov) {
        boolean puede=false;

        return puede;
    }
}
