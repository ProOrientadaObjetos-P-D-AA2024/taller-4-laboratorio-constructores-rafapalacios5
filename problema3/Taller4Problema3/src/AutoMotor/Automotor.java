
package AutoMotor;

public class Automotor {
    private String cedula;
    private String marca;
    private int anio;
    private double valorVehiculo;
    private double valorMatricula;
    

    public Automotor(String cedula, String marca, int anio, double valorVehiculo) {
        this.cedula = cedula;
        this.marca = marca;
        this.anio = anio;
        this.valorVehiculo = valorVehiculo;
            
    }
    

    public Automotor(String cedula, String marca, int anio, double valorVehiculo, double valorMatricula) {
        this.cedula = cedula;
        this.marca = marca;
        this.anio = 2024-anio;
        this.valorVehiculo = valorVehiculo;
        this.valorMatricula = ((0.002*valorVehiculo)/100)*anio;
    }
    


    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    public double getValorMatricula() {
        
        return valorMatricula;
    }

    public void setValorMatricula(double valorMatricula) {
        this.valorMatricula = valorMatricula;
    }
    
     public String toString() {
        return "Cedula del Dueño: " + cedula + ", Marca: " + marca + ", Año de Fabricacion: " + anio + ", Valor del Vehiculo: " + valorVehiculo + ", Valor de la Matricula: " + valorMatricula;
    }
}
