
package EntidadFinanciera;

public class EntidadFinanciera {
    private String nombre;
    private String nombreB;
    private double valor;
    private double comision;
    
    public EntidadFinanciera(String nombre, String nombreB, double valor) {
        this.nombre = nombre;
        this.nombreB = nombreB;
        this.valor = valor;
    }
    
     public EntidadFinanciera(String nombre, String nombreB, double valor, double comision) {
        this.nombre = nombre;
        this.nombreB = nombreB;
        this.valor = valor;
        this.comision = valor*0.003;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreB() {
        return nombreB;
    }

    public void setNombreB(String nombreB) {
        this.nombreB = nombreB;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
     public String toString() {
        return "Nombre del Cliente: " + nombre + ", Nombre del Banco: " + nombreB + ", Valor del cheque " + valor + ", Comision que cobra el Banco " + comision ;
    }
    
}
