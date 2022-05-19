package apostilaManzono;

import java.util.*;

public class L05D {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		
		int sm = 0;
		 
		for(int ct = 1; ct <= 500; ct++) {
		if (ct % 2 == 0) {
			sm += ct;
		}
		}
	
	 System.out.println("O somatório dos números pares de 1 á 500 é:" + sm + ".");
	}
	
}
