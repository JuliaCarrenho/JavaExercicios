package DoWhile_While;

import java.util.*;

public class L03A {
      public static void main (String[]args) {
    	  Scanner sc = new Scanner (System.in);
    	  int n = 0;
    	  int cont = 1;
    
    	  System.out.println("Digite um número: ");
  		 n = sc.nextInt();
    	  
    	  while (cont <= 10 ) {
    		  int mult = n * cont ;
    		  	System.out.println(cont + "X" + n + "=" + mult );
    		  	cont++;
    	  }
          sc.close();
      }
}
