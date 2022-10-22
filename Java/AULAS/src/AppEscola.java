

public class AppEscola {

	public static void main(String[] args) {
		
		String matricula[]= {"UB01","UB02","UB03"};
		double nota []=new double[3];
		String nome[]={"MARCOS","PAULO","MARIA"};
		boolean aprovado[]= {false,true,true};
		
		
		nota[0]=5.5;
		nota[1]=6;
		nota[2]=10;
		
		System.out.println("MAT\tNOME\tNOTA\tSITUAÇÃO");
		for(int i=0;i<3;i++) {
		System.out.printf("%S\t%S\t%.2f\t%S\n",matricula[i],nome[i],nota[i],aprovado[i]);
		}
	}

}
