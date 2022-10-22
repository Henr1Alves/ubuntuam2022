import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class MiniLoja {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
String data = "08/10/2022";
		
		//vetores
		String produtos[]={"Anel Búzios", "Anel Esmeralda", "Anel Rubi","Brinco Búzios","Brinco Argola","Colar Búzios","Colar Patua","Colar Corrente ","Pul. Búzios","Pul. Diamantes"};
		String codigo[]= {"GRP01-01","GRP01-02","GRP01-03","GRP01-04","GRP01-05","GRP01-06","GRP01-07","GRP01-08","GRP01-09","GRP01-10"};
		int estoque []= new int[10];
		int carrinho[]= new int[10];
		double valorUni[]= {300,900,640,490,350,520,390,250,450,780};
		char fazerCompra=' ';
		String compras="";
		String auxCodigo="";
		int posicao=0;
		boolean continuarCompra= false; 
		double total=0.00;
		double calculo=0.00;
		char formasPagamento=' ';
		int opcao=0;
		char c ='%';
		double totalParcela=0.00;
		String consumidor="";
		String nome="";
		
		for(int i=0;i<10;i++) {
			estoque[i]=10;
		
			
		}
		//teste - depois apagar
		//estoque[9]=0; 
		
		System.out.println("\t\t\tDMH Joias");
		System.out.println("Não deixe para usar amanhã, a joia que você pode usar hoje!");
		System.out.print("Você deseja fazer compras? S para sim ou N para não: ");
		fazerCompra= leia.next().toUpperCase().charAt(0);
		 if (fazerCompra=='N'){
			continuarCompra=false;
			
			
		}else {
			continuarCompra=true;
		}

		
			//laço pricipal
		
		while(continuarCompra){
			total=0;
			
			//tela de entrada
			
			System.out.println("---------------------------------------------------------");
			System.out.println("Código\t\tProduto\t\tPreço uni\testoque");
			System.out.println("---------------------------------------------------------");
			for(int i=0;i<10;i++) {
				System.out.printf("%s\t%s\t %.2f \t %d %n",codigo[i], produtos[i],+valorUni[i],+estoque[i]);
			}
			System.out.println();
			System.out.print("Digite o código do produto : ");
			auxCodigo = leia.next().toUpperCase();
			
			for(int i=0;i<10;i++){
				if(auxCodigo.equals(codigo[i])){
					posicao = i;
					System.out.println("---------------------------------------------------------");
					System.out.println("Código\t\tProduto\t\tPreço uni\testoque");
					System.out.println("---------------------------------------------------------");
					System.out.printf("%s\t%s\t %.2f \t %d\t %n",codigo[i], produtos[i],+valorUni[i],+estoque[i]);
					break;
				}
				
			}
			if(estoque[posicao]==0) {
				System.out.println("Produto indisponivel");
				
			}else {
				System.out.print("Digite a quantidade que deseja comprar :");
				carrinho[posicao] = leia.nextInt();
				while(carrinho[posicao]==0 || carrinho[posicao] < 0 || carrinho[posicao]>estoque[posicao]){
					if(carrinho[posicao]==0) {
						System.out.println("Você digitou zero!!");
					} 
					else if (carrinho[posicao] < 0){
						System.out.println("Você digitou um número negativo");
						
					}
					else if (carrinho[posicao]>estoque[posicao]){
						System.out.println("Quantidade maior que o estoque! ");
						
					}
										
					System.out.print("Digite a quatidade que deseja comprar :");
					carrinho[posicao] = leia.nextInt();
				}
					
			}
			
			//Carrinho de compras
			
			
			System.out.println("\n\t\t\t***Carrinho de Compras***\n");
			System.out.println("Código\t\tProduto\t\tPreço uni\tEstoque \tComprados\t Total");
				for(int i=0;i<9;i++) {
					
				
     					if(carrinho[i]>0){
						
						System.out.printf("%s\t%s\t %.2f \t %d \t\t %d \t\t %.2f %n",codigo[i], produtos[i],valorUni[i],estoque[i],carrinho[i],valorUni[i]*carrinho[i]);
						calculo = (carrinho[i] * valorUni[i]);
						total = total + calculo;
						
					
					}
					
				
				}
				System.out.printf("Total da Compra: %.2f\n",total);
				System.out.println("Você deseja continuar comprando? S para sim ou N para não");
				fazerCompra= leia.next().toUpperCase().charAt(0);
				if (fazerCompra=='N' || fazerCompra=='n'){
					continuarCompra=false;
					
				//Opções de pagamento
					
					System.out.println("***ESCOLHA A FORMA DE PAGAMENTO***");
					System.out.printf("\nVALOR FINAL                     R$%.2f\n", total);
					System.out.println("-----------------------------------------------------------");
					System.out.printf("1 - A vista    - 10%c de Desconto    - \tR$ %.2f\n",c,  (total * 0.9));
					System.out.printf("2 - No cartão  - 10%c acrescimo      "
							 + "- \tR$ %.2f\n",c, (total * 1.10));
					System.out.printf("3 - Credito 2X - 15%c acrescimo      - \tR$ %.2f\n",c, (total * 1.15));
					System.out.println("4 - Cancelar a compra");
					System.out.print("\nSelecione uma Opção de Pagamento [1-4]: ");
					formasPagamento= leia.next().charAt(0);
					if(formasPagamento!='4') {
						//NOTA FISCAL
						System.out.println("\n                           NOTA FISCAL   ");
						System.out.println("---------------------------------//-----------------------------------");
						System.out.println("Consumidor: ");
						consumidor = leia.next();
						System.out.println("\t\t\tDMH JOIAS \n\nSHOPPING IGUATEMI LOJA 25 \nCNPJ:60.742.060/0001");
						System.out.printf("Imposto 9%c: R$%.2f\n" ,c , (total*0.09));
						System.out.println("-----------------------------------//-----------------------------------");
						System.out.println(data); //data
						System.out.println("-----------------------------------//-----------------------------------");
						if(formasPagamento=='1') {
							//Pagamento a vista			
							
							System.out.println("TOTAL R$ "+(total-(total*0.1)));
						} 
						else if((formasPagamento=='2')) {
							System.out.println("TOTAL R$ (+10%)"+(total * 1.10));
						} 
						else if((formasPagamento=='3')) {
							System.out.println("TOTAL R$ (+15%)"+(total * 1.15));
							System.out.printf("2 Parcelas de R$ %.2f",((total * 1.15)/2));
						}

					}
					
				
				}
				else {
					continuarCompra=true;
				}	
						
						
			System.out.println("Ate breve!");
		}
		}
			
		
		
	}
			



