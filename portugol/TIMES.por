programa
{
	
	funcao inicio()
	{
		cadeia times[4]={"PALMEIRAS","SANTOS","SÃO PAULO", "CORINTHIANS"}
		inteiro pontos[4]
		caracter auxPonto=' '
		cadeia auxTime=" "
		para(inteiro x=1; x<=3; x++){
			escreva("Rodada : ",x,"\n")
			para(inteiro i=0; i<4; i++){
				escreva(times[i],"\n")
				escreva("Ganhou, Empatou ou Perdeu [G/E/P] : ")
				leia(auxPonto)
				se(auxPonto=='G' ou auxPonto =='g'){
					pontos[i]=pontos[i]+3	
				}
				senao se (auxPonto=='E' ou auxPonto=='e'){
					pontos[i]=pontos[i]+1	
				} 
				senao {
					pontos[i]=pontos[i]+0	
				}
			}
		}
		//final
		para(inteiro i=0; i<4; i++){
			escreva(times[i]," - ",pontos[i],"\n")
			
		}
		escreva("digite o nome do seu time : ")
		leia(auxTime)
		para(inteiro i=0; i<4; i++){
			se(auxTime==times[i]){
				escreva("Seu time é o ",times[i]," pontos ",pontos[i])
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 854; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */