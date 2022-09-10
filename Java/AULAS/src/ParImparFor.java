
import java.util.Scanner;

public class ParImparFor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero;
		
		for(int i=0; i<4; i++) {
			
			System.out.println("Digite um número inteiro positivo:");
			numero = leia.nextInt();
		
			if (numero<0) {
				System.out.println("Número negativo ");
			}
			else if (numero==0) {
				System.out.println("Número neutro ");
			}
			else if (numero%2==1) {
				System.out.println("Este é um número impar");
			}
			else {
				System.out.println("Este é um número par");
			}
		}
	}

}

