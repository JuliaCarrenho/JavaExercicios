package desenvolvaAlgoritimo;

import java.util.*;

public class L03A {
        public static void main (String[] arg) {
    	  
    	 int m = 0;
    	 int cont = 1;
    	 int calc = 0;
    	 
    	 Scanner sc = new Scanner (System.in);
    	 
    	 System.out.println("Digite um número: ");
    	 m = sc.nextInt();
    	 
    	 while (cont <= 10) {
    	 calc = cont * m ;
         System.out.println(cont + "x" + m + "=" + calc);
         cont++;
    	 }
    	 
    	 
    	 
    		 
    	  
      }
}
