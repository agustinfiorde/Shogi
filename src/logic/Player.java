
package logic;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    
    Scanner sc = new Scanner(System.in);
    private String name;
    private String[] ejesXY = new String[2];
    private boolean playerOne;
    private boolean turno;
    private ArrayList<String> piezasCapturadas = new ArrayList<String>();

    public Player(String name, boolean playerOne, boolean turno) {
        this.name = name;
        this.playerOne = playerOne;
        this.turno = turno;
    }
    
    public String[][] mover(String[][] matriz){
        
        return matriz;
    }
    
    public String[][] upgradear (String[][] matriz){
        return matriz;
    }
    
    public void piezasCapturadas(String pieza){
        piezasCapturadas.add(pieza);
    }
    
    public String[][] ingresarPiezas(String[][] matriz){
        piezasCapturadas.get(455);
        return matriz;
    }
    
    public void eliminarPieza(Integer posicion){
        piezasCapturadas.remove(posicion);
    }
    
}
