/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

/**
 *
 * @author Ambiente 209-2
 */
public class FunctionProblem  {
    
    FunctionString fs = new FunctionString();
    private double resultado;
    private double grados;

    public double getGrados() {
        return grados;
    }

    public void setGrados(double Celsius) {
        this.grados = Celsius;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double grados) {
        this.resultado = grados;
    }
    
    
    
    public double CelsiusFahrenheit(double dato){
        setGrados(dato);
         resultado =(getGrados() * 9/5)+32;
         fs.ShowScanner(String.valueOf(resultado+"\n"));
        return resultado;
    }
        public double CelsiusKelvin(double dato){
       setGrados(dato);
         resultado=(getGrados()) + 273.15;
         fs.ShowScanner(String.valueOf(resultado+"\n"));
        return resultado;
    }
        public double FahrenheitCelsius(double dato){
    setGrados(dato);
            resultado=(getGrados() - 32) * 5/9;
            fs.ShowScanner(String.valueOf(resultado+"\n"));
            return resultado;
        }
        public double Fahrenheitkelvin(double dato){
    setGrados(dato);
            resultado=(getGrados() - 32) * 5/9 + 273.15;
            fs.ShowScanner(String.valueOf(resultado+"\n"));
            return resultado;
        }
        public double kelvinFahrenheit(double dato){
    setGrados(dato);
            resultado=(getGrados() - 273.15) * 9/5 + 32;
            fs.ShowScanner(String.valueOf(resultado+"\n"));
            return resultado;
        }
        public double kelvinCelsius(double dato){
    setGrados(dato);
            resultado= (getGrados())  - 273.15;
            fs.ShowScanner(String.valueOf(resultado+"\n"));
            return resultado;
        }
}
