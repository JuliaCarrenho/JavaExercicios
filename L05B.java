package apostilaManzono;


import java.util.*;

public class L05B {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		 int t = 0;
		 int n = 0;
		 
		 System.out.println("Digite um número: ");
		 n = sc.nextInt();
		 
		 for (int c = 1; c <= 10; c++) {
			 t = c * n;
			 System.out.println(c + "X " + n + "= " + t);
		 }
	     
	
	}

}
