package apostilaManzono;

import java.util.*;

public class L05E {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		int impar = 0;
		
		
		for(int ct = 1; ct <=20; ct++) {
			if (ct% 2 ==1) {
				impar = ct ;
				System.out.println(impar);
			}
		}
	}

}
