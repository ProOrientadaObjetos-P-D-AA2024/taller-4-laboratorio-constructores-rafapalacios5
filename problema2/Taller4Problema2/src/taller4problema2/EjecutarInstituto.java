
package taller4problema2;

import Instituto.Instituto;

public class EjecutarInstituto {

    public static void main(String[] args) {
        String nombre, apellido, cedula;
        double sueldoBasico, sueldoTotal=0;
        Instituto profesor1 = new Instituto("Juan", "Garcia", "1103364732",460);
        profesor1.CalcularSueldoTotal();
        System.out.println("Profesor1");
        System.out.println(profesor1.toString());

        //OBJETO 2
        Instituto profesor2 = new Instituto("Andrea", "Perez", "1103746362",450, sueldoTotal);
        System.out.println("Profesor2");
        System.out.println(profesor2.toString());
        
    } 
    
    
}
