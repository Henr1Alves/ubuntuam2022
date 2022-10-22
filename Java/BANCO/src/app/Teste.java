package app;

import java.util.Locale;
import java.util.Scanner;

import entites.Conta;
import entites.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		ContaPoupanca cp1 = new ContaPoupanca(10,1);
		
		char tipo=' ';
		double valor = 0.0;
		char op;
		System.out.println("Movimentação Bancaria");
		for(int x=1; x<=10; x++) {
			System.out.println("Movimento :"+x);
			System.out.println("[D]ébito ou [C]redito :");
			tipo = leia.next().toUpperCase().charAt(0);
			System.out.println("Qual Valor R$ :");
			valor = leia.nextDouble();
			
		}
	
	}

}
