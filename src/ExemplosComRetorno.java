
public class ExemplosComRetorno {

	public static void main(String[] args) {

		String nome = concatenar("Kleber", "Brito");
		int tamanho = tamanhoNomeCompleto("Kleber","Brito");
		System.out.println("Nome:" + nome);
		System.out.println("Quantidade:" + tamanho);
	}
	

	public static String concatenar(String nome, String sobrenome) {

		return nome + " " + sobrenome;

	}
	
	public static int tamanhoNomeCompleto(String nome, String sobrenome) {
		
		String nomeCompleto = concatenar(nome,sobrenome);
		
		return nomeCompleto.length();
		
	}
	
	
	

}
