package shogi;

import java.util.Scanner;
import logic.CreateSetMatrix;

public class Shogi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String nombre1="Agustin";
        String nombre2= "Martin";
        //Pedir Nombre de jugador 1 y 2 con sc
        
        
        CreateSetMatrix starter = new CreateSetMatrix(nombre1,nombre2);
        

        starter.fillShowMatrix();
        starter.MostrarShowMatriz();


    }

}
