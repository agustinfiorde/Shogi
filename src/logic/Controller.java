package logic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {

    private Scanner sc = new Scanner(System.in);
    private Player player1 = new Player(true, true);
    private Player player2 = new Player(false, false);
    private Integer[] ejesXYSeleccion = new Integer[2];
    private Integer[] ejesXYMov = new Integer[2];
    private CreateSetMatrix starter = new CreateSetMatrix();

    private String letra;
    private Integer numero;

    private boolean estadoReyPlayer1;
    private boolean estadoReyPlayer2;

    public Controller() {

        String nombre1 = "Agustin";
        String nombre2 = "Martin";
        //Pedir Nombre de jugador 1 y 2 con sc
//        System.out.println("Bienvenido jugador 1, por favor introducir su alias para el juego: ");
//        String nombre1 = sc.nextLine();
//        System.out.println("Muchas gracias " + nombre1);
//        System.out.println("");
//
//        System.out.println("Bienvenido jugador 2, por favor introducir su alias para el juego: ");
//        String nombre2 = sc.nextLine();
//        System.out.println("Muchas gracias " + nombre2);
//        System.out.println("");

        player1.setName(nombre1);
        player2.setName(nombre2);

        accion();
    }

    public Integer pedirLetra() {
        letra = null;
        Integer num = null;
        System.out.print("Seleccione la letra de la casilla:");
        letra = sc.nextLine().toUpperCase();
        while (!(letra.equals("A") || letra.equals("B") || letra.equals("C") || letra.equals("D") || letra.equals("E") || letra.equals("F") || letra.equals("G") || letra.equals("H") || letra.equals("I"))) {
            System.out.print("Porfavor, Seleccione la letra de la casilla :");
            letra = sc.nextLine().toUpperCase();
        }

        switch (letra) {
            case "A":
                num = 0;
                break;
            case "B":
                num = 1;
                break;
            case "C":
                num = 2;
                break;
            case "D":
                num = 3;
                break;
            case "E":
                num = 4;
                break;
            case "F":
                num = 5;
                break;
            case "G":
                num = 6;
                break;
            case "H":
                num = 7;
                break;
            case "I":
                num = 8;
                break;
        }

        return num;
    }

    public Integer pedirNumero() {
        System.out.print("Seleccione el numero de la casilla :");
        try {
            numero = sc.nextInt();
        } catch (InputMismatchException e) {
            //Pedir ayuda a Eze
            sc.next();
            System.out.println("Introducir un numero del 1-9");
        }
        numero = 10;
        while (!(numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9)) {
            System.out.print("Porfavor, Seleccione el numero de la casilla :");
            try {
                numero = sc.nextInt();
            } catch (InputMismatchException e) {
                //Pedir ayuda a Eze
                sc.next();
                System.out.println("Introducir un numero del 1-9");
            }
        }
        return numero;
    }

    public String pedirAccion() {
        letra = null;
//        System.out.println("Desea: M Mover; P Promocionar; A Agregar Pieza");
//        letra = sc.nextLine().toUpperCase();
//        while (!(letra.equals("M") || letra.equals("P") || letra.equals("A"))) {
//            letra = sc.nextLine().toUpperCase();
//        }

        return letra;
    }

    public void accion() {
        do {
            if (player1.isTurno()) {
                starter.MostrarShowMatriz();
                player1.showPiezasCapturadas();

                ejesXYSeleccion[1] = pedirLetra();
                ejesXYSeleccion[0] = pedirNumero() - 1;

                player1.setTurno(false);
                player2.setTurno(true);
                ejesXYSeleccion[0] = null;
                ejesXYSeleccion[1] = null;
                ejesXYMov[0] = null;
                ejesXYMov[1] = null;
            } else {

            }
            //King is alive?
        } while (!(player1KingAlive() || player2KingAlive()));

        if (player1KingAlive()) {
            System.out.println("Felicitaciones " + player1.getName() + " . GANASTE!!");
        } else {
            System.out.println("Felicitaciones " + player2.getName() + " . GANASTE!!");
        }

    }

    public void mover() {

    }

    public void upgradear() {

    }

    public void agregarPieza() {

    }

    public boolean player1KingAlive() {
        estadoReyPlayer1 = false;
        String[][] matrix = starter.getMatrixGame();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                //Aca hay un null pointer
                if (matrix[i][j] != null) {
                    if (matrix[i][j].equals(" K^ ")) {
                        estadoReyPlayer1 = true;
                        break;
                    }
                }
            }
        }
        return estadoReyPlayer1;
    }

    public boolean player2KingAlive() {
        estadoReyPlayer2 = false;
        String[][] matrix = starter.getMatrixGame();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                //Aca hay un null pointer
                if (matrix[i][j] != null) {
                    if (matrix[i][j].equals(" Kv ")) {
                        estadoReyPlayer2 = true;
                        break;
                    }
                }
            }
        }
        return estadoReyPlayer2;
    }

    public boolean casilleroEnemigoPlayer1() {

        return true;
    }

    public boolean casilleroEnemigoPlayer2 () {

        return true;
    }
}
