// Primeira Classe//


package objeto;

public class Classe01 {
	int bateria;
	String modelo;
	String cor;
	String marca;
	
	void status() {
		System.out.println("A bateria de seu Smartwatch está em: " + this.bateria + "%");
		System.out.println("O modelo do seu Smartwatch é: " + this.modelo);
		System.out.println("A cor dele é: " + this.cor);
		System.out.println("A marca de seu Smartwatch é: " + this.marca);
    }
    public static void carregado() {

    }
    public static void aferindoAPressao() {
    	
    }
	public static void  atendendoLigacao() {
		System.out.println("ATENDENDO LIGAÇÃO");
		
	}
    public static void desligado() {
    	
    }
    }

//Segunda Classe //

package objeto;

public class Classe02 {
	public static void main(String[] args) {
		Classe01 Smartwatch = new Classe01();
		
		Smartwatch.bateria = 10;
		Smartwatch.modelo = "X8";
		Smartwatch.cor = "Rose";
		Smartwatch.marca = "Iwo";
		Smartwatch.status();
		Smartwatch.atendendoLigacao();
		
		
	}

}
