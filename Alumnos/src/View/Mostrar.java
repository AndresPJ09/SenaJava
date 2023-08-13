/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;


import Utils.FunctionNumeric;
import Utils.FunctionString;

/**
 *
 * @author Ambiente 209-2
 */
public class Mostrar {

       public static void main(String[] args) {
      FunctionString fs = new FunctionString();
      FunctionNumeric fn = new FunctionNumeric();
      
        fs.InputScanner("Ingrese el nivel del alumno (preparatoria/profesional): ");
        String nivel = fs.InputScanner();

        fs.InputScanner("Ingrese el promedio del alumno: ");
        double promedio = fs.();

        fs.InputScanner("Ingrese el número de materias reprobadas: ");
        int materiasReprobadas = scanner.nextInt();

        Alumno alumno = new Alumno(nivel, promedio, materiasReprobadas);

        double totalPagar = ProgramaEstimulo.calcularDescuento(alumno);
        fs.InputScanner("Total a pagar: $" + totalPagar);

       
    }
}