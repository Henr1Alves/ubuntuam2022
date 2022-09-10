
package javacasa;
import java.util.Scanner;
public class ConversãoGraus {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int fahrenait=0;
		int celsius;
		String nome;

		System.out.println("Digite seu nome:");
		nome = leia.next();
		
		System.out.println("Qual a temperatura em graus celsius?");
		celsius = leia.nextInt();
		
		fahrenait=(celsius*9/5)+32;
		System.out.print("oi " +nome+"a temperatura em garus fahrenait é:"+fahrenait);
		
	}

}
