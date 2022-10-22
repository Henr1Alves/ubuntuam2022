package entites;

import java.util.Locale;
import java.util.Scanner;

public class ContaPoupanca extends Conta {

	
	
	//ATRIBUTOS
	private  int diaAniversarioPoupanca;
	
	//CONSTRUTORES
	public ContaPoupanca(int numero, String cpf, int diaAniversarioPoupanca) {
		super(numero, cpf);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
		
	}
	public ContaPoupanca(int numero, int diaAniversarioPoupanca) {
		super(numero);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}
	public ContaPoupanca(int numero, String cpf, double saldo, boolean ativo, int diaAniversarioPoupanca) {
		super(numero, cpf, saldo, ativo);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}
	// ENCAPSULAMENTO
	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}

	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

	//METODO
	public void correccao(int dia) {
		if(dia<0) {
			System.out.println("Valor negativo.Informe um dia valido!");
		}
		else if(dia==0) {
			System.out.println("Valor zerado.Informe um dia valido!");
		}
		else if(dia>31) {
			System.out.println("O limite de dias é de 1 a 31!!");
		}
		else {
			if(dia == this.diaAniversarioPoupanca) {
				super.credito(super.getSaldo()*0.005);
				System.out.println("Correção monetário executada.");
			}
		}
	}
	
	
}
