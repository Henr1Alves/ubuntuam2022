programa
{
	
	funcao inicio()
	{
		cadeia times[4]
		inteiro pontos [4]
		caracter resultado=' '
		
		times[0]="sep"
		times[1]="spfc"
		times[2]="sfc"
		times[3]="sccp"

          para(inteiro y=0; y<2; y++)
          {
			para(inteiro i=0; i<4; i++)
			{
				escreva(times[i], "\n")
				escreva(" Ganhou, Empatou ou Perdeu: ")
				leia(resultado)
	
				se(resultado=='G')
				{
					pontos[i]+=3
				}
				senao se (resultado =='E')
				{
					pontos[i]+=1
				}
				senao
				{
					pontos[i]+=0
				}
			}
	
			escreva("Tabela\n")
			para(inteiro x=0; x<=4; x++)
			{
				escreva (times[x]," -  ", pontos[x], "\n")
			}
		
		
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 213; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */