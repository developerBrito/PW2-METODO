
public class Exercicio {
	
	public static void main(String[] args) {
		int somado = somar(2,3);
		int next = proximo(1);
		int vaidobrar = dobro(10);
		
		System.out.println("A soma �: " + somado);
		System.out.println("O pr�ximo n�mero �: " + next);
		System.out.println("O dobro �: " + vaidobrar);
	}
	
	public static int somar(int n1,int n2) {
		
		return n1+n2;
		
	}
	
	public static int proximo(int n1) {
		
		return n1+1;
		
	}
	
	public static int dobro(int n1) {
		
		return n1*2;
		
	}

}
