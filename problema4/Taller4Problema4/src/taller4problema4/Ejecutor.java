
package taller4problema4;

import EntidadFinanciera.EntidadFinanciera;

public class Ejecutor {

    public static void main(String[] args) {
        double comision = 0;
       EntidadFinanciera obj =new EntidadFinanciera ("Rafaella Palacios", "Banco Pichincha",  20000, comision);
        
  
        EntidadFinanciera obj1 = new EntidadFinanciera ("Esther Mendez","Banco de Loja",25000,comision);
        
        System.out.println("'CHEQUE 1'");
        System.out.println(obj.toString() );
        System.out.println("'CHEQUE 2' " );
        System.out.println(obj1.toString());
    }
     
}
