/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package almacenar1hastanimprmir;

import java.util.Scanner;

/**
 *
 * @author Ambiente 209-3
 */
public class Almacenar1hastanimprmir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //3.13.3. Almacenar en un vector los números de 1 hasta n 
        //y posteriormente imprimir su contenido.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int n = sc.nextInt();
        int[] numero = new int[n];
        for (int i = 0; i < n; i++) {
            numero[i] = i + 1;
            System.out.println(numero[i]);
        }
    }
}
