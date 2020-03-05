
public class Exemplos {
	public static void main(String[] args) {

		ehMaiorIdade(19);
		ehMaiorIdade(16);
		ehMaiorIdade(30);
		classificar(-5);

	}

	public static void ehMaiorIdade(int idade) {

		if (idade >= 18) {

			System.out.println("MAIOR DE IDADE");

		} else {

			System.out.println("MENOR DE IDADE");

		}
	}

	public static void classificar(int num) {

		if (num > 0) {

			System.out.println("ESSE NÚMERO É POSITIVO");

		} else {
			if (num < 0) {

				System.out.println("ESSE NÚMERO É NEGATIVO");

			} else {

				System.out.println("ESSE NÚMERO É 0");

			}

		}

	}

}
