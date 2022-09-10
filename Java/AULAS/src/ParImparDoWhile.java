import java.util.Scanner;

public class ParImparDoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

			int numero;
			
			do {
				System.out.print("Escolha um número maior que zero: ");
				numero = leia.nextInt();
				
				if(numero<1) {
					System.out.println("Número inválido!");
				}
				
			}
			while(numero<1);
			
			if (numero%2==1) {
				System.out.println("Este é um número impar");
			}
			else {
				System.out.println("Este é um número par");
			}
	}
	
}



