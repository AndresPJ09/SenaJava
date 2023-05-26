/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg10.pkg5;

import java.util.Scanner;

/**
 *
 * @author Ambiente 209-1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("ingrese la cantidad de obreros");
            n = sc.nextInt();
        } while (n <= 0);
        int contador = 1;
        while (contador <= n) {
            System.out.println("obrero" + contador + ":");
            System.out.println("ingrese la cantidad de horas trabajadas:");
            int horasTrabajadas = sc.nextInt();

            double salarioSemanal;
            if (horasTrabajadas > 40) {
                int horasExtras = horasTrabajadas - 40;
                if (horasExtras <= 8) {
                    salarioSemanal = 40 * 16 + horasExtras * 16 * 2;
                } else {
                    salarioSemanal = 40 * 16 * +8 * 16 * 2 + (horasExtras - 8) * 16 * 3;
                }
            } else {
                salarioSemanal = horasTrabajadas * 16;
            }
            System.out.println("el salario semanal es:$" + salarioSemanal);
            contador++;
        }
        sc.close();
    }
}
