package logic;

import java.util.ArrayList;
import java.util.Scanner;
import pieces.Alfil;
import pieces.Caballo;
import pieces.GeneralOro;
import pieces.GeneralPlata;
import pieces.Lancero;
import pieces.Peon;
import pieces.Rey;
import pieces.Torre;

public class Player {

    Scanner sc = new Scanner(System.in);
    private String name;

    private boolean playerOne;
    private boolean turno;
    private ArrayList<String> piezasCapturadas = new ArrayList<String>();

    public Rey rey = new Rey();
    public GeneralOro generalOro = new GeneralOro();
    public GeneralPlata generalPlata = new GeneralPlata();
    public Alfil alfil = new Alfil();
    public Torre torre = new Torre();
    public Lancero lancero = new Lancero();
    public Caballo caballo = new Caballo();
    public Peon peon = new Peon();

    public Player(boolean playerOne, boolean turno) {
        this.playerOne = playerOne;
        this.turno = turno;
    }

    public String[][] mover(String[][] matriz) {

        return matriz;
    }

    public String[][] upgradear(String[][] matriz) {
        return matriz;
    }

    public void showPiezasCapturadas() {
        System.out.print("Piezas capturadas por " + name + " : ");
        for (String i : piezasCapturadas) {
            System.out.print(i + ". ");
        }
        System.out.println("");
    }

    public void piezasCapturadas(String pieza) {
        piezasCapturadas.add(pieza);
    }

    public String[][] ingresarPiezas(String[][] matriz) {
        piezasCapturadas.get(455);
        return matriz;
    }

    public void eliminarPieza(Integer posicion) {
        piezasCapturadas.remove(posicion);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(boolean playerOne) {
        this.playerOne = playerOne;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public ArrayList<String> getPiezasCapturadas() {
        return piezasCapturadas;
    }

    public void setPiezasCapturadas(ArrayList<String> piezasCapturadas) {
        this.piezasCapturadas = piezasCapturadas;
    }

}
