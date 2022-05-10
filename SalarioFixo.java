package Exercícios14_43;

import java.util.*;

public class SalarioFixo {
	public static void main(String[]args) {
		int salario;
		int vendas ;
		double a = 0;
		double b = 0;
		double c = 0;
		
		Scanner sc = new Scanner (System.in);

		
		System.out.println("Digite o seu salrio: ");
		salario = sc.nextInt();
		
		System.out.println("Digite total de vendas: ");
		vendas = sc.nextInt();
		
		if (vendas> 1500) {
	    a = vendas * 0.05; 
	    b = salario + a;
			System.out.println("Salario total: " + b);
		} else {
			a = vendas * 0.30;
			b = salario + a;
			System.out.println("Salario total:" + b);
			
			
		}
		
	}
	

}
