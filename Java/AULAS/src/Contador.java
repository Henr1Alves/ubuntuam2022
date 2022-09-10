import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int contador=0;
		int total=0;
		int numero;
		
		System.out.print("Digite um número:");
		numero = leia.nextInt();
		
		do{
			contador++;
			total=total+contador;
			System.out.print(contador);
			if(contador<numero) {
				System.out.print("+");
			}
					
		}
		while(contador<numero);
			System.out.print("="+total);
				
				


	}

}
