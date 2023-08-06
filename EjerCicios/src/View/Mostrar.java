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
      
        fn.InputNumericRangeScanner("Digite la nota: ",40.0,100.0);
      //  fn.InputNumericRangeScannerPositivo("Digite un número positivo : ");
     //   fn. InputNumericRangeScannerNegativo("Digite un número negativo: ");
     //   fn.InputNumericRangeScannerEntero("Digite la nota: ",30.0,100.0);
     //   fn.InputNumericRangeScannerPositivoEntero("Digite un número positivo : ");
     //   fn. InputNumericRangeScannerNegativoEntero("Digite un número negativo: ");
    }
}
