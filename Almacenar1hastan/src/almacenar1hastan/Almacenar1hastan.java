/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package almacenar1hastan;
import java.util.Scanner;
/**
 *
 * @author Ambiente 209-3
 */
public class Almacenar1hastan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Almacenar en un vector los números de 1 hasta n.
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = sc.nextInt();
        int[] numero = new  int[num];
        for (int i = 1; i < num; i++) {
            numero[i] = i+1;
        }
    }
    
}
