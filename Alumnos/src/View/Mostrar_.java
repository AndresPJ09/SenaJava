/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Utils.FunctionNumeric;
import Utils.FunctionString;
import Utils.Matricula;

/**
 *
 * @author Ambiente 209-2
 */
public class Mostrar_ {

    public static void main(String[] args) {
        FunctionNumeric fn = new FunctionNumeric();
        FunctionString fs = new FunctionString();

        Matricula m[] = new Matricula[fn.InputIntegerNumericPositiveScanner("Indique cuantos estudiantes desea agregar: ")];

        for (int i = 0; i < m.length; i++) {
            m[i] = new Matricula();
            m[i].GenerarFactura();
        }
        for (int i = 0; i < m.length; i++) {
            fs.InputScanner(m[i].getNombre() + " $" + m[i].getTotalPagar().toString());
        }

    }
}
