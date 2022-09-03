import java.util.Scanner;

public class Terceiro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeroInteiro = 0;
		double numeroReal = 0.0;
		char caracter = ' ';
		String cadeiaCaracter = " ";
		
		
		System.out.print("digite um numero inteiro: ");
		numeroInteiro = leia.nextInt();
		System.out.print("digite um numero real: ");
		numeroReal = leia.nextDouble();
		System.out.print("digite um caracter: ");
		caracter = leia.next().charAt(0);
		System.out.print("digite uma  String: ");
		cadeiaCaracter = leia.next();
		
		
		System.out.println("O numero inteiro digitado foi: "+ numeroInteiro);
		System.out.println("O numero real digitado foi: "+ numeroReal);
		System.out.println("O caracter digitado foi: "+ caracter);
		System.out.println("A String digitada foi:"+cadeiaCaracter);
		
	}

}
