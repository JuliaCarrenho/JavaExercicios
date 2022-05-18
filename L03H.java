package desenvolvaAlgoritimo;

import java.util.*;

public class L03H {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		
		int graus = 10;
		
		System.out.println("Celsius em Fahrenheit");
		while (graus <= 100) {
			int grausF = ((9*graus) + 160)/5;
			System.out.println(graus + "°C = " + grausF + "°F");
			graus += 10;
	}
	}
}
