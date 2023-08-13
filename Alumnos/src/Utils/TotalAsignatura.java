/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

/**
 *
 * @author Ambiente 209-2
 */
public class TotalAsignatura extends Alumno {
private int valor;
private Double descuento;
private int unidades;
private Double TotalAsignatura;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public Double getTotalAsignatura() {
        return TotalAsignatura;
    }

    public void setTotalAsignatura(Double TotalAsignatura) {
        this.TotalAsignatura = TotalAsignatura;
    }
    public Double HallarDescuento (){

if (super.getCurso() = "preparatoria"){
    
    if (super.getPromedio() >= 9.5) {

        this.setDescuento (descuento: 0.25);

}else if (super.getPromedio () >= 9 && super.getPromedio() < 9.5) { 
    this.setDescuento (descuento: 0,1);

else if (super.getCurso () == "profesional" && super.getPromedio() >= 9.5) (

this.setDescuento (descuento: 0.25);

}

} else {


public Double HallarDescuento() { 

if (super.getCurso() = "preparatoria" if (super.getPromedio () >= 9.5) ( 

this.setDescuento (descuento: 0.25); } else if (super.getPromedio() >= 9 && super.getPromedio() < 9.5) 

this.setDescuento (descuento: (0.1); 

} else if (super.getCurso() = "profesional" && super.getPromedio() >= 9.5) { this.setDescuento (descuento: 0.25); 

} else { 

this.setDescuento (descuento: 0.0); 

} 

return this.getDescuento (); 

public int HallarUnidades () 

if (super.getCurso() == "preparatoria" 

if (super.getPromedio() >= 9.5) ( 

this.setUnidades (unidades: 55); 

} else if (super.getPromedio () >= 9 && super.getPromedio () < 9.5) ( 

this.setUnidades (unidades: 50); 

} else if (super.getPromedio() > 7 && super.getPromedio() <9) [ 

this.setUnidades (unidades: 50); 

} else if (super.getPromedio () <= 7 && super.getMateriasReprobadas () > 4) { this.setUnidades (unidades: 40); 

} else { 

this.setUnidades (unidades: 45); 

} 

else if super.getCurso()= "profesional") [ 

this.setUnidades (unidades: 55); 

} 

return this.getUnidades(); 

public Double TotalAsignatura () { this.setUnidades (this.getUnidades ()/5); 

Double descuento-HallarDescuento(); 

if (super.getCurso() = "preparatoria") { 

this.setValor (valo: 180); 

}else if (super.getCurso() = "profesional") { this.setValor (valor: 300); 

} 

this.setTotalAsignatura (this.getValor() (double) this.getUnidades()); 

descuento this.getTotalAsignatura () * descuento; 

this.setTotalAsignatura (this.getTotalAsignatura ()-descuento); 

return this.getTotalAsignatura ();
}



   }
