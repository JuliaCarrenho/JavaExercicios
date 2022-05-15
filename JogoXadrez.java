package Exercícios14_43;

import java.util.*;

public class JogoXadrez {
	public static void main (String[]args) {
		
		int h1 = 0;
		int h2 = 0;
		int resul = 0;
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Digite a hora de inicio: ");
		h1 = sc.nextInt();
		
		System.out.println("Digite a hora de termino: ");
		h2 = sc.nextInt();
		
	   resul = h2 - h1;
	   
	   if (resul < 0) {
		   int dia = resul + 24;
		   System.out.println("O jogo teve " + dia + " hora(s) de durção");   
	   } else {
		   System.out.println("O jogo teve " + resul + " hora(s) de duração");
	   }
	    

		
	}

}














