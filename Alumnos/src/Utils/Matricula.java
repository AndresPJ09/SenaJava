/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

/**
 *
 * @author Ambiente 209-2
 */
public class Matricula extends Notas {

    private String nombre;
    private Double TotalPagar;
    private Double PorcentajeDescuento;
    private Byte CantidadUnidades;
    private Byte Reprobadas;
    
    final Double costePreparatoria = 180.0;
    final Double costeProfesional = 300.0;
    
    public Byte getReprobadas() {
        return Reprobadas;
    }

    public void setReprobadas(Byte Reprobadas) {
        this.Reprobadas = Reprobadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getTotalPagar() {
        return TotalPagar;
    }

    public void setTotalPagar(Double TotalPagar) {
        this.TotalPagar = TotalPagar;
    }

    public Double getPorcentajeDescuento() {
        return PorcentajeDescuento;
    }

    public void setPorcentajeDescuento(Double PorcentajeDescuento) {
        this.PorcentajeDescuento = PorcentajeDescuento;
    }

    public Byte getCantidadUnidades() {
        return CantidadUnidades;
    }

    public void setCantidadUnidades(Byte CantidadUnidades) {
        this.CantidadUnidades = CantidadUnidades;
    }

    public void GenerarFactura() {
        this.CapturarDatos();
        if (super.getTipo().equals("Preparatoria")) {
            this.FacturarPreparatoria();
            this.setTotalPagar((costePreparatoria*(this.getCantidadUnidades()/5))*(1-this.getPorcentajeDescuento()));
        }else{
            this.FacturarProfesional();
            this.setTotalPagar((costeProfesional*(this.getCantidadUnidades()/5))*(1-this.getPorcentajeDescuento()));
        }
    }

    private void CapturarDatos() {
        FunctionNumeric fn = new FunctionNumeric();
        FunctionString fs = new FunctionString();
        
        this.setNombre(fs.InputScanner("Digite el nombre del estudiante "));
        
        do {
            super.setTipo(fs.InputScanner("Digite Preparatoria/Profesional: "));
        } while (!(super.getTipo().equals("Preparatoria")|| super.getTipo().equals("Profesional")));
        super.setPromedio(fn.InputDoubleNumericRangeScanner("Digite el promedio: ", 0.0, 10.0));

        if (super.getPromedio() < 7 && super.getTipo().equals("Preparatoria")) {
            this.setReprobadas(fn.InputIntegerNumericRangeScanner("Digite la cantidad de materias reprobadas 0/6", 0.0, 6.0).byteValue());
        }

    }

    public void FacturarPreparatoria() {
        if (super.getPromedio() >= 9.5) {
            this.setPorcentajeDescuento(0.25);
            this.setCantidadUnidades((byte) 55);
        } else if (super.getPromedio() >= 9.0) {
            this.setPorcentajeDescuento(0.1);
            this.setCantidadUnidades((byte) 50);
        } else if (super.getPromedio() > 7.0) {
            this.setPorcentajeDescuento(0.0);
            this.setCantidadUnidades((byte) 50);
        } else if (super.getPromedio() <= 7.0 && this.getReprobadas() <= 3) {
            this.setPorcentajeDescuento(0.0);
            this.setCantidadUnidades((byte) 45);
        } else if (super.getPromedio() <= 7.0 && this.getReprobadas() > 3) {
            this.setPorcentajeDescuento(0.1);
            this.setCantidadUnidades((byte) 40);
        }
    }
    public void FacturarProfesional() {
        if (super.getPromedio() >= 9.5) {
            this.setPorcentajeDescuento(0.25);
            this.setCantidadUnidades((byte) 55);
            
        } else if (super.getPromedio() >= 9.0) {
            this.setPorcentajeDescuento(0.1);
            this.setCantidadUnidades((byte) 50);
        }
    }
}
