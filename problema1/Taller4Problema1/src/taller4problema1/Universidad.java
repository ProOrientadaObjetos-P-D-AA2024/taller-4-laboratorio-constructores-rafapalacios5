
package taller4problema1;
public class Universidad {

    private String nombreEstudiante;
    private double califMateria1;
    private double califMateria2;
    private double califMateria3; 
    private double promedioCalificaciones;
    
    public Universidad(String nombreEstudiante, double califMateria1, double califMateria2, double califMateria3) {
        this.nombreEstudiante = nombreEstudiante;
        this.califMateria1 = califMateria1;
        this.califMateria2 = califMateria2;
        this.califMateria3 = califMateria3;
    }

    public Universidad(String nombreEstudiante, double califMateria1, double califMateria2, double califMateria3,double promedioCalificaciones) {
        this.nombreEstudiante = nombreEstudiante;
        this.califMateria1 = califMateria1;
        this.califMateria2 = califMateria2;
        this.califMateria3 = califMateria3;
        this.promedioCalificaciones=(califMateria1+califMateria2+califMateria3)/3 ;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public double getCalifMateria1() {
        return califMateria1;
    }

    public void setCalifMateria1(double califMateria1) {
        this.califMateria1 = califMateria1;
    }

    public double getCalifMateria2() {
        return califMateria2;
    }

    public void setCalifMateria2(double califMateria2) {
        this.califMateria2 = califMateria2;
    }

    public double getCalifMateria3() {
        return califMateria3;
    }

    public void setCalifMateria3(double califMateria3) {
        this.califMateria3 = califMateria3;
    }

    public void promedioCalificaciones() {
        promedioCalificaciones=(califMateria1+califMateria2+califMateria3)/3 ;
    }
    
    public double getPromedioCalificaciones() {
        return promedioCalificaciones;
    }
    
    public String toString() {
        return  "La Estudiante " + nombreEstudiante + " Con las siguentes calificaciones " + califMateria1 +", "+ califMateria2 + ", "+califMateria3 +". su promedio es " + promedioCalificaciones +"";
    }

    
    
    
    
    
    
}
