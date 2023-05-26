/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermecado;

import java.util.Scanner;

/**
 *
 * @author Ambiente 209-1 En un supermercado una ama de casa pone en su carrito
 * los artículos que va tomando de los estantes. La señora quiere asegurarse de
 * que el cajero le cobre bien lo que ella ha comprado, por lo que cada vez que
 * toma un artículo anota su precio junto con la cantidad de artículos iguales
 * que ha tomado y determina cuánto dinero gastara en ese artículo; a esto le
 * suma lo que ira gastando en los demás artículos, hasta que decide que ya tomo
 * todo lo que necesitaba. Ayúdale a esta señora a obtener el total de sus
 * compras.
 */

public class Supermecado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        double total = 0;
        String respuesta;

        do {
            System.out.print("Ingrese el precio del artículo: ");
            double precio = scan.nextDouble();
            System.out.print("Ingrese la cantidad de artículos iguales que ha tomado: ");
            int cantidad = scan.nextInt();
            double subtotal = precio * cantidad;
            total += subtotal;

            System.out.print("¿Desea seguir comprando? (Si/No): ");
            respuesta = scan.next();
        } while (respuesta.equals("Salir"));

        System.out.println("El total de sus compras es: $" + total);
    }
}


    

