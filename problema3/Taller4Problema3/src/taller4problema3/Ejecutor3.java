
package taller4problema3;

import AutoMotor.Automotor;

public class Ejecutor3 {

    public static void main(String[] args) {
        double valorMatricula=0;
        
        Automotor obj =new Automotor ("1106012434", "BMW", 2014, 20000, valorMatricula);
        
  
        Automotor obj1 = new Automotor ("1104872559","AUDI",2008,25000,valorMatricula);
        
        System.out.println("CARACTERISTICAS");
        System.out.println(obj );
        System.out.println("CARACTERISTICAS " );
        System.out.println(obj1 );
        
    }
    
}
