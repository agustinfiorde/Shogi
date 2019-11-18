package pieces;

public class Rey {

    private String nombre;
    private boolean playerOne;
    private boolean state;
    private boolean jaque;
    private String matrizRey[][] = new String[3][3];

    public Rey() {
        generadorMatrizRey();
    }

    private void generadorMatrizRey() {
        matrizRey[0][0] = " x ";
        matrizRey[0][1] = " x ";
        matrizRey[0][2] = " x ";

        matrizRey[1][0] = " x  ";
        matrizRey[1][1] = "R";
        matrizRey[1][2] = "  x ";

        matrizRey[2][0] = " x ";
        matrizRey[2][1] = " x ";
        matrizRey[2][2] = " x ";

    }
    
    public void showMatriz(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizRey[i][j]);
            }
            System.out.println("");
        }
    }
}
