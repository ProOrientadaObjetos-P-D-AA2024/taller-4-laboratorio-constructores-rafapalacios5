
package Taller4Problema;

import taller4problema1.Universidad;

public class ejecutorUniversidad {
    public static void main(String[] args) {
        double promedio = 0;
        Universidad AlumnoUno=new Universidad("Rafaella", 8, 7.5, 9,promedio);
        System.out.println(AlumnoUno);
        
        double promedio2 = 0;
        Universidad AlumnoDos=new Universidad("Esther Mendez", 9, 6.5, 7,promedio2);
        System.out.println(AlumnoDos);
    }
    
}
