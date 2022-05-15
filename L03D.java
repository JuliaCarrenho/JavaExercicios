package DoWhile_While;

public class L03D {

public static void main(String[] args) {
		
		int cont = 0;
		int impares = 0;
		
		while (cont <= 20) {
			if (cont % 2 == 1) {
				impares = cont;
				System.out.println(impares);
			}
			cont++;
		}
	}
}
