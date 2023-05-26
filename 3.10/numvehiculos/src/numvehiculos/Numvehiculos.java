/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numvehiculos;
import java.util.Scanner;
/**
 *
 * @author Ambiente 209-1
 */
public class Numvehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int numVehiculos = 0;
        double masaTotal = 0;
        boolean salir;
        do {
            System.out.println("Ingrese los datos del vehículo:");
            System.out.print("Presión: ");
            double presion = scan.nextDouble();
            System.out.print("Volumen: ");
            double volumen = scan.nextDouble();
            System.out.print("Temperatura: ");
            double temperatura = scan.nextDouble();
            System.out.print("Tipo de vehículo (1: motocicleta, 2: automóvil): ");
            int tipoVehiculo = scan.nextInt();
            
            double masaAire = presion * volumen / (0.37 * (temperatura + 460));
            
            if (tipoVehiculo == 1) {
                masaAire *= 0.8; // descuento del 20% para motocicletas
            }
            
            masaTotal += masaAire;
            numVehiculos++;
            
            System.out.print("¿Desea ingresar otro vehículo? (s/n): ");
            String respuesta = scan.next();
            salir = respuesta.equalsIgnoreCase("n");
        } while (!salir);
        
        double promedioMasa = masaTotal / numVehiculos;
        
        System.out.println("El promedio de masa de aire de los neumáticos es: " + promedioMasa);
        
       
    }
}
    
    

