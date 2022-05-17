package desenvolvaAlgoritimo;

import java.util.*;


public class L03F {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 int base = 0;
		 int expo = 1;
		 int cont = 0;
	     int potenc = 1;
		 
       System.out.println("Escolha o valor da base: ");
        base = sc.nextInt();
       
       System.out.println("Escolha o valor do expoente: ");
        expo = sc.nextInt();
       
       
       while (cont< expo) {
    	   potenc = potenc * base;
    	   cont++;
       }
       System.out.println("O resultado da base " + base + " elevada ao expoente " + " =" + potenc);
       
       
	}

}
