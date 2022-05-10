package Exercícios14_43;
 
import java.util.*;

public class QntEstoque {

	 public static void main (String[]args) {
		 int qntAtual, qntMax, qntMin, qntMed;
		 
		Scanner sc = new Scanner (System.in);		 
		
		System.out.println("Digite a quantidade atual de estoque: ");
		qntAtual = sc.nextInt();
		
		System.out.println("Digite a quantidade maxima de estoque: ");
		qntMax = sc.nextInt();
		
		System.out.println("Digite a quantidade minima de estoque: ");
		qntMin = sc.nextInt();
		 
		 qntMed = (qntMax + qntMin)/2;
		
		if (qntAtual >= qntMed) {
			System.out.println("Não efetuar compra");
		} else {
			System.out.println("Efetuar compra");
