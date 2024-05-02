
package Instituto;

public class Instituto {
    private String nombre;
    private String apellido;
    private double sueldoBasico; 
    private double sueldoTotal; 
    private String cedula;

    public Instituto(String nombre, String apellido, String cedula,double sueldoBasico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
    }
    
    public Instituto(String nombre, String apellido, String cedula,double sueldoBasico, double sueldoTotal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.sueldoTotal = (sueldoBasico*0.2)+sueldoBasico;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public void CalcularSueldoTotal() {
        sueldoTotal= (sueldoBasico*0.2)+sueldoBasico;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }
    
    public String toString() {
        return  "Profesor: " + nombre +" "+ apellido+ ". Numero de cedula: "+ cedula +". Tiene como sueldo básico: " + sueldoBasico+ " y su sueldo total es: "+ sueldoTotal;
    }

   
    
    
}
