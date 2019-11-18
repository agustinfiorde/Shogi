package logic;

public class CreateSetMatrix {

    private String matrixShow[][] = new String[21][21];
    private String matrixGame[][] = new String[9][9];

    public CreateSetMatrix(String nombre1,String nombre2) {
        startMatrixShow();
        startMatrixGame();
        Player player1 = new Player(nombre1,true,true);
        Player player2 = new Player(nombre2,false,false);
    }

    public void fillShowMatrix() {
        for (int i = 2; i < 19; i += 2) {
            for (int j = 2; j < 19; j += 2) {

                if (i > 2 && j > 2) {
                    matrixShow[i][j] = matrixGame[(i-2)/2][(j-2)/2];
                } else {
                    matrixShow[i][j] = matrixGame[i/2-1][j/2-1];
                }
                
            }
        }
    }

    private void startMatrixGame() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == 2) {
                    matrixGame[i][j] = " pv ";
                } else if (i == 6) {
                    matrixGame[i][j] = " p^ ";
                }
                if (i == 0) {
                    //Segundo Jugador, ARRIBA
                    matrixGame[i][0] = " lv ";
                    matrixGame[i][8] = " lv ";
                    matrixGame[i][1] = " cv ";
                    matrixGame[i][7] = " cv ";
                    matrixGame[i][2] = " gpv";
                    matrixGame[i][6] = " gpv";
                    matrixGame[i][3] = " GOv";
                    matrixGame[i][5] = " GOv";
                    matrixGame[i][4] = " Kv ";
                } else if (i == 8) {
                    //Primer Jugador, ABAJO
                    matrixGame[i][0] = " l^ ";
                    matrixGame[i][8] = " l^ ";
                    matrixGame[i][1] = " c^ ";
                    matrixGame[i][7] = " c^ ";
                    matrixGame[i][2] = " gp^";
                    matrixGame[i][6] = " gp^";
                    matrixGame[i][3] = " GO^";
                    matrixGame[i][5] = " GO^";
                    matrixGame[i][4] = " K^ ";
                }
            }
        }

        //Segundo Jugador, ARRIBA torre y alfil
        matrixGame[1][1] = " tv ";
        matrixGame[1][7] = " av ";

        //Primer Jugador, ABAJO torre y alfil
        matrixGame[7][1] = " a^ ";
        matrixGame[7][7] = " t^ ";

    }

    private void startMatrixShow() {

        Integer count = 0;

        for (int i = 0; i < 21; i += 20) {
            //Primera y ultima Fila de Letras
            matrixShow[i][2] = " A ";
            matrixShow[i][4] = " B ";
            matrixShow[i][6] = " C ";
            matrixShow[i][8] = " D ";
            matrixShow[i][10] = " E ";
            matrixShow[i][12] = " F ";
            matrixShow[i][14] = " G ";
            matrixShow[i][16] = " H ";
            matrixShow[i][18] = " I ";

            matrixShow[i][0] = "  ";
            matrixShow[i][1] = "  ";
            matrixShow[i][3] = "   ";
            matrixShow[i][5] = "   ";
            matrixShow[i][7] = "   ";
            matrixShow[i][9] = "   ";
            matrixShow[i][11] = "   ";
            matrixShow[i][13] = "   ";
            matrixShow[i][15] = "   ";
            matrixShow[i][17] = "   ";
            matrixShow[i][19] = "   ";
            matrixShow[i][20] = "   ";

            //Primera y ultima Columna de Numeros
            for (int j = 2; j < 19; j += 2) {
                matrixShow[j][i] = Integer.toString(count += 1);
                matrixShow[j - 1][i] = " ";
            }
            count = 0;
        }
        //Llenado con Signos
        for (int i = 1; i < 21; i += 2) {
            //Llenado esquinas ┼
            for (int j = 1; j < 21; j += 2) {
                matrixShow[i][j] = " + ";
                if (i != 19) {
                    matrixShow[i + 1][j] = " |";
                }
            }
            //Llenado con -
            for (int j = 2; j < 20; j += 2) {
                matrixShow[i][j] = "---";
            }
        }
        matrixShow[19][0] = " ";
        matrixShow[19][20] = " ";
    }

    public void MostrarShowMatriz() {
        //Corroborar matriz
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21; j++) {
                if (matrixShow[i][j] == null) {
                    matrixShow[i][j] = "    ";
                }
                System.out.print(matrixShow[i][j]);
            }
            System.out.println("");
        }
    }

}
