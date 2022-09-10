import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int número;
		
		System.out.print("Digite um número inteiro positivo:");
		número = leia.nextInt();
		
		if (número<0){
			System.out.println("Você digitou um número negativo");
		}
		else if (número==0) {
			System.out.println("Você digitou zero, é um número neutro");
		}
		else if ((número%2)==0) {
			System.out.println("Você digitou um número par");
		}
		else {
			System.out.print("Você digitou um número impar");
		}
		
	}

}
