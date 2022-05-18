package desenvolvaAlgoritimo;

import java.util.*;

public class L03G {
	public static void  main (String[]args) {
		
		int cont = 0;
		int n1 = 0;
		int n2 = 0;
		int n3;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Sequencia de Fibonacci");
		
		while (cont <= 15) {
			n3 = n2 + n1;
			n1 =n2;
			n2 = n3;
			System.out.println(n3 + "...");
		cont++;
		}
		
		
	}

}
