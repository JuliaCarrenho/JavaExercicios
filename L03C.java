package DoWhile_While;

import java.util.*;

public class L03C {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int cont = 0;
		int pares = 0;
		
		while (cont <= 500) {
			if (cont % 2 == 0) { 
				pares += cont; 
			}
			cont++;
		}
		System.out.println(pares);
	}
}
