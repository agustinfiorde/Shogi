package logic;

import java.util.Scanner;

public class Controller {

    private Scanner sc = new Scanner(System.in);
    private Player player1 = new Player(true, true);
    private Player player2 = new Player(false, false);
    private Integer[] ejesXYPieza = new Integer[2];
    private Integer[] ejesXYMov = new Integer[2];
    private CreateSetMatrix starter = new CreateSetMatrix();

    private String letra;
    private Integer numero;

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

    public void accion() {
        do {
            if (player1.isTurno()) {
                starter.MostrarShowMatriz();
                player1.showPiezasCapturadas();

                System.out.print("Seleccione la pieza a mover en Eje letras :");
                letra = sc.nextLine().toUpperCase();
                while (!(letra.equals("A") || letra.equals("B") || letra.equals("C") || letra.equals("D") || letra.equals("E") || letra.equals("F") || letra.equals("G") || letra.equals("H") || letra.equals("I"))) {
                    System.out.print("Porfavor, Seleccione la pieza a mover en eje letra :");
                    letra = sc.nextLine().toUpperCase();
                }
                switch (letra) {
                    case "A":
                        ejesXYPieza[1] = 0;
                        break;
                    case "B":
                        ejesXYPieza[1] = 1;
                        break;
                    case "C":
                        ejesXYPieza[1] = 2;
                        break;
                    case "D":
                        ejesXYPieza[1] = 3;
                        break;
                    case "E":
                        ejesXYPieza[1] = 4;
                        break;
                    case "F":
                        ejesXYPieza[1] = 5;
                        break;
                    case "G":
                        ejesXYPieza[1] = 6;
                        break;
                    case "H":
                        ejesXYPieza[1] = 7;
                        break;
                    case "I":
                        ejesXYPieza[1] = 8;
                        break;
                }

                System.out.print("Seleccione la pieza a mover en eje numeros :");
                try {
                    numero = sc.nextInt();
                } catch (Exception e) {
                    //Pedir ayuda a Eze
                    System.out.println("Pusiste algo distinto a un numero");
                }

                while (!(numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9)) {
                    System.out.print("Porfavor, Seleccione la pieza a mover en eje numeros :");
                    numero = sc.nextInt();
                }
                ejesXYPieza[0] = numero - 1;

                System.out.println("Desea: M Mover; P Promocionar; A Agregar Pieza");
                letra = sc.nextLine().toUpperCase();
                while (!(letra.equals("M") || letra.equals("P") || letra.equals("A"))) {
                    letra = sc.nextLine().toUpperCase();
                }

                player1.setTurno(false);
                player2.setTurno(true);
                letra = null;
                numero = null;
                ejesXYPieza[0] = null;
                ejesXYPieza[1] = null;
                ejesXYMov[0] = null;
                ejesXYMov[1] = null;
            } else {

            }
            //King is alive?
        } while (false);

    }

    public void mover() {

    }

    public void upgradear() {

    }

    public void agregarPieza() {

    }

}
