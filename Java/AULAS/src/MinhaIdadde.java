import java.util.Scanner;

public class MinhaIdadde {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int anoNascimento,idade;
		
		System.out.print("Digite seu nome:");
		nome = leia.next();
		System.out.print("Digite o ano de nascimento:");
		anoNascimento = leia.nextInt();
		
		idade=2022 - anoNascimento;
		System.out.println("oi "+nome+" sua idade é "+idade+" anos");
	}

}
