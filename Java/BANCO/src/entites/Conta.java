package entites;
public abstract class Conta {
		//atributos
			private int numero;
			private String cpf;
			private double saldo;
			private boolean ativo;
				
			
				
		//construtor
			public Conta(int numero) {
				this.numero = numero;
			}



			public Conta(int numero, String cpf) {
				super();
				this.numero = numero;
				this.cpf = cpf;
			}



			public Conta(int numero, String cpf, double saldo, boolean ativo) {
				super();
				this.numero = numero;
				this.cpf = cpf;
				this.saldo = saldo;
				this.ativo = ativo;
			}


			// ENCAPSULAMENTO
			
			public int getNumero() {
				return numero;
			}
			

			public void setNumero(int numero) {
				this.numero = numero;
			}



			public String getCpf() {
				return cpf;
			}



			public void setCpf(String cpf) {
				this.cpf = cpf;
			}



			public double getSaldo() {
				return saldo;
			}



			public void setSaldo(double saldo) {
				this.saldo = saldo;
			}



			public boolean isAtivo() {
				return ativo;
			}



			public void setAtivo(boolean ativo) {
				this.ativo = ativo;
			}
			
			
			//METODOS
			public void credito(double valor) {
				if(valor<0) {
					System.out.println("Valor informado negativo!!!");
				}
				else if ( valor == 0) {
					System.out.println("Valor zerado");
				}
				else {
					this.saldo = this.saldo + valor;
				}
			
			}
			
			public void debito (double valor) {
				if(valor<0) {
					System.out.println("Valor digitado é negativo!!!");
				}else if(valor > this.saldo) {
					System.out.println("Saldo indisponivel");
				 }else {
				 	this.saldo = this.saldo - valor;
				}
				
			
			}


}

