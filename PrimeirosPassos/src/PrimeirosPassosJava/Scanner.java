package PrimeirosPassosJava;



public class Scanner {
	
	public static void main (String [] args) {
		
		// new Scanner - Instancia um objeto da classe (Cria um objeto da classe)
		// System.in- ele ler as informações do teclado, digitada do teclado
		// Scanner - é um objeto da classe Scanner
		
		java.util.Scanner ObjetoNome = new java.util.Scanner(System.in);
		
		System.out.println("Digite um nome: ");
		
		// .nextLine (do tipo String - texto)- ler o que o usuario digita e armaneza na variavel nome 
		String nome = ObjetoNome.nextLine();
		
		//--------------------------------------------------
		
		java.util.Scanner ObjetoIdade = new java.util.Scanner(System.in);
		
		System.out.println("Digite uma idade: ");
		
		// .nexInt (do tipo int - inteiro/numero)- ler o que o usuario digita e armaneza na variavel idade 
		int idade = ObjetoIdade.nextInt();
		
		System.out.println("Nome digitado: " + nome);
		System.out.println("Idade digitada: " + idade + " anos");
		
		
		/*java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		int numeroInteiro = scanner.nextInt();
		byte numeroByte = scanner.nextByte(); // aceita 1 digito
		long numeroLongo = scanner.nextLong();// aceita números longos
		boolean numeroBooleanos = scanner.nextBoolean();// true or false
		float numeroFloat = scanner.nextFloat(); // número com casas decimais 
		double numeroDouble = scanner.nextDouble(); // aceita casas decimais */
		
		}
	}