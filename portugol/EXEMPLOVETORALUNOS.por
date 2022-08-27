programa
{
	
	funcao inicio()
	{
		cadeia matricula[4]
		inteiro ano [4]
		caracter genero[4]
		cadeia nome [4]
		inteiro idade=0
		real nota[4]
		cadeia mat=" "
			
		
		matricula[0]="MAT-1"
		matricula[1]="MAT-2"
		matricula[2]="MAT-3"
		matricula[3]="MAT-4"

          ano[0]= 2000 
		ano[1]= 2002 
		ano[2]= 1999 
		ano[3]= 2004 

		genero[0]='F'
		genero[1]='M'
		genero[2]='M'
		genero[3]='F'
	
          nome[0]="MARIA"  
		nome[1]="MARCOS"
		nome[2]="PAULO"  
		nome[3]= "CARLA"
		
		para(inteiro i=0; i<4; i++)
		{
			escreva(matricula[i],":",nome[i],"\n")

			escreva("Digite a nota: ")
			leia(nota[i])		

		}
		escreva("MAT\tNOME\tIDADE\tNOTA\tSITUACAO\n")
		para(inteiro i=0; i<4; i++)
		{
			escreva(matricula[i],"\t",nome[i],"\t",(2022-ano[i]),"\t",nota[i],"\t")
			se(nota[i]<=5)
			{
				se(genero[i]=='F' ou genero[i]=='f')
				{
					escreva("REPROVADA")	
				}
				senao{
				escreva("REPROVADO")
				}
				
			}
			senao
			{
			
				se(genero[i]=='F' ou genero[i]=='f')
				{
					escreva("APROVADA")	
				}
				senao{
					escreva("APROVADO")
				}
			}
			escreva("\n")
		}
		escreva("\n")
		escreva("Digite a matricula: ")
		leia(mat)
		escreva("MAT\tNOME\tIDADE\tNOTA\tSITUACAO\n")
		para(inteiro i=0; i<4; i++)
		{
			se(mat==matricula[i]){
				escreva(matricula[i],"\t",nome[i],"\t",(2022-ano[i]),"\t",nota[i],"\t")
				se(nota[i]<=5)
			{
				se(genero[i]=='F' ou genero[i]=='f')
				{
					escreva("REPROVADA")	
				}
				senao{
				escreva("REPROVADO")
				}
				
			}
			senao
			{
			
				se(genero[i]=='F' ou genero[i]=='f')
				{
					escreva("APROVADA")	
				}
				senao{
					escreva("APROVADO")
				}
			}
			escreva("\n")	
			}
		
		}
	}
}				
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1666; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */