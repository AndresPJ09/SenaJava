/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;



/**
 *
 * @author Ambiente 209-2
 */
public class Mostrar {
    public static void main(String[] args) {
        FunctionString fs = new FunctionString();
        FunctionNumeric fn = new FunctionNumeric();
        FunctionProblem fp = new FunctionProblem();
        
        
        
        fp.CelsiusFahrenheit(fn.InputNumericScanner("digite los grados en celsius: "));
        fp.CelsiusKelvin(fn.InputNumericScanner("digite los grados en celsius: "));
        fp.FahrenheitCelsius(fn.InputNumericScanner("digite los grados en Fahrenheit: "));
        fp.Fahrenheitkelvin(fn.InputNumericScanner("digite los grados en Fahrenheit: "));
        fp.kelvinFahrenheit(fn.InputNumericScanner("digite los grados en kelvin: " ));
        fp.kelvinCelsius(fn.InputNumericScanner("digite los grados en kelvin: "));
        

    }
}