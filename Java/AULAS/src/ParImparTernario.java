import java.util.Scanner;

public class ParImparTernario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int numero;
			
		System.out.println("Digite um número inteiro positivo:");
		numero = leia.nextInt();
		
		System.out.println(numero%2==0 ? "par" : "impar");

	}

}
