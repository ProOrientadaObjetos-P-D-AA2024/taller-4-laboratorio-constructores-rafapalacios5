
package Taller4Problema;

import taller4problema1.Universidad;

public class ejecutorUniversidad {
    public static void main(String[] args) {
        double nombre;
        double califMateria1;
        double califMateria2;
        double califMateria3;
        double promedio = 0;
        Universidad AlumnoUno=new Universidad("Rafaella", 8, 7.5, 9,promedio);
        System.out.println("Alumno 1");
        System.out.println(AlumnoUno.toString());
        
        Universidad AlumnoDos=new Universidad("Esther Mendez", 9, 6.5, 7,promedio);
        System.out.println("Alumno 2");
        System.out.println(AlumnoDos.toString());
    }
    
}
