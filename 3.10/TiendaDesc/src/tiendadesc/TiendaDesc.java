/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendadesc;

import java.util.Scanner;

/**
 *
 * @author Jackeline -En una tienda de descuento las personas que van a pagar el
 * importe de su compra -llegan a la caja y sacan una bolita de color, que les
 * dirá que descuento tendrán -sobre el total de su compra. Determinar la
 * cantidad que pagara cada cliente desde -que la tienda abre hasta que cierra.
 * Se sabe que si el color de la bolita es roja el -cliente obtendrá un 40% de
 * descuento; si es amarilla un 25% y si es blanca no -obtendrá descuento.
 */
public class TiendaDesc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        int opcion;
        double des = 0, preCom, toAPag;
        System.out.print("Ingrese el precio de compra: ");
        preCom = scan.nextDouble();
        do {
            System.out.println("Seleccione el color de la bolita:");
            System.out.println("1. Bolita roja");
            System.out.println("2. Bolita amarilla");
            System.out.println("3. Bolita blanca");
            System.out.println("4. Salir");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    des = preCom * 0.4;
                    break;
                case 2:
                    des = preCom * 0.25;
                    break;
                case 3:
                    des = 0;
                    break;
                case 4:
                    System.out.println("¡Gracias por usar nuestro programa!");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    continue;
            }
            if (opcion != 4) {
                toAPag = preCom - des;
                System.out.println("El descuento obtenido es de: " + des);
                System.out.println("El total a pagar es de: " + toAPag);
                System.out.print("Ingrese el precio de compra: ");
                preCom = scan.nextDouble();
            }
        } while (opcion != 4);
    }
}