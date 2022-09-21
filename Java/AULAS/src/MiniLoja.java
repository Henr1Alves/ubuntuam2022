import java.util.Scanner;

public class MiniLoja {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		//vetores
		String produtos[]={"Anel Búzios", "Anel Esmeralda", "Anel Rubi","Brinco Búzios","Brinco Argola","Colar Búzios","Colar Patua","Colar Corrente ","Pul. Búzios","Pul. Diamantes"};
		String codigo[]= {"GRP01-01","GRP01-02","GRP01-03","GRP01-04","GRP01-05","GRP01-06","GRP01-07","GRP01-08","GRP01-09","GRP01-10"};
		int estoque []= new int[10];
		int carrinho[]= new int[10];
		String valoruni[]= {"R$ 300,00","R$ 900,00","R$ 640,00","R$ 490,00","R$ 350,00","R$ 520,00","R$ 390,00","R$ 250,00","R$ 450,00","R$ 780,00"};
		char fazerCompra=' ';
		String compras="";
		String auxCodigo="";
		int posicao=0;
		
		
		for(int i=0;i<10;i++) {
			estoque[i]=10;
		}
		//teste - depois apagar
		//estoque[9]=0; 
		
		System.out.println("\t\t\tDMH Joias");
		System.out.println("Não deixe para usar amanhã, a joia que você pode usar hoje!");
		
		//laço pricipal
		do {
			System.out.print("Você deseja fazer compras? S para sim ou N para não");
			fazerCompra= leia.next().toUpperCase().charAt(0);
			if (fazerCompra=='N'){
				break;
				
			}
			//tela de entrada
			System.out.println("---------------------------------------------------------");
			System.out.println("Código\t\tProduto\t\tPreço uni\testoque");
			System.out.println("---------------------------------------------------------");
			for(int i=0;i<10;i++) {
				System.out.println(codigo[i]+"\t"+produtos[i]+"\t"+valoruni[i]+"\t"+estoque[i]);
			}
			System.out.println();
			System.out.print("Digite o código do produto : ");
			auxCodigo = leia.next();
			
			for(int i=0;i<10;i++){
				if(auxCodigo.equals(codigo[i])){
					posicao = i;
					System.out.println("---------------------------------------------------------");
					System.out.println("Código\t\tProduto\t\tPreço uni\testoque");
					System.out.println("---------------------------------------------------------");
					System.out.println(codigo[i]+"\t"+produtos[i]+"\t"+valoruni[i]+"\t"+estoque[i]);
				}
				
			}
			if(estoque[posicao]==0) {
				System.out.println("Produto indisponivel");
				
			}else {
				System.out.print("Digite a quatidade que deseja comprar :");
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
					
					;		
					System.out.print("Digite a quatidade que deseja comprar :");
				carrinho[posicao] = leia.nextInt();
				}
					
			}

			System.out.println("Carrinho de Compras");
				for(int i=0;i<10;i++) {
					if(auxCodigo.equals(codigo[i])){
						posicao = i;
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println("Código\t\tProduto\t\tPreço uni\tEstoque\tQuantidade Comprada");
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println(codigo[i]+"\t"+produtos[i]+"\t"+valoruni[i]+" \t "+estoque[i]+" \t "+carrinho[posicao]);
					}
				
				}
			
			
								
		}while (fazerCompra=='S');
			
			System.out.println("Ate breve!");
			
			
		
		
	}
	

}