import java.util.Scanner;

public class TimesVetores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String times[]={"São Paulo","Palmeiras","Corinthians","Santos"};
		int pontos[]= new int [4];
		char auxPonto=' ';
		String auxTime="";
		
		for(int i=1;i<=3;i++){
			System.out.println("Rodada: "+i);
			for(int j=0;j<4;j++) {
				System.out.println(times[j]);
				System.out.print("Ganhou,Empatou ou perdeu [G/E/P]: ");
				auxPonto = leia.next().charAt(0);
				if(auxPonto=='G' || auxPonto=='g'){
					pontos[j]=pontos[j]+3;
				}
				else if(auxPonto=='E' || auxPonto=='e'){
					pontos[j]=pontos[j]+3;
				}
				else{
					pontos[j]=pontos[i]+0;
				}
			}
		}
		//final
		for(int j=0;j<4;j++) {
			System.out.println(times[j]+"-"+pontos[j]);
		}
		leia.nextLine();
		System.out.print("Digite o nome do seu time :");
		auxTime = leia.nextLine();
		for(int j=0;j<4;j++)
		{
				if(auxTime.equals(times[j]))
				{
					System.out.println("Seu time é o " +times[j]+ " com um total de " +pontos[j] +" pontos");
				}
		}
		
		

	}

}
