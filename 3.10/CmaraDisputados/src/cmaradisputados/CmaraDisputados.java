/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cmaradisputados;
import java.util.Scanner;
/**
 *
 * @author Ambiente 209-1
 */
public class CmaraDisputados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan =new Scanner(System.in);
        int aFavor = 0, enContra = 0, abstencion = 0;
        int totalDiputados, maxCantidad = 1000;

        System.out.println("Ingrese el total de diputados: ");
        totalDiputados = scan.nextInt();

        do {
            System.out.println("Ingrese la cantidad de diputados a favor del Tratado de Libre Comercio: ");
            aFavor = scan.nextInt();
        } while (aFavor < 0 || aFavor > maxCantidad || aFavor > totalDiputados);

        totalDiputados -= aFavor;

        do {
            System.out.println("Ingrese la cantidad de diputados en contra del Tratado de Libre Comercio: ");
            enContra = scan.nextInt();
        } while (enContra < 0 || enContra > maxCantidad || enContra > totalDiputados);

        totalDiputados -= enContra;
        abstencion = totalDiputados;

        System.out.println("Porcentaje de diputados a favor: " + ((double)aFavor / (double)(aFavor + enContra + abstencion)) * 100 + "%");
        System.out.println("Porcentaje de diputados en contra: " + ((double)enContra / (double)(aFavor + enContra + abstencion)) * 100 + "%");
        System.out.println("Porcentaje de diputados que se abstienen de opinar: " + ((double)abstencion / (double)(aFavor + enContra + abstencion)) * 100 + "%");

    }
}