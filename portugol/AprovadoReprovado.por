programa
{
	
	funcao inicio()
	{
		cadeia mat[4] = {"MAT-001","MAT-002","MAT-003","MAT-004"}
		cadeia aluno[4] = {"Paulo", "Maria", "Carla", "Marcos"}
		inteiro anoNasc [4] = {2000,2002,1999,2004}
		inteiro nota[4] 
		caracter genero[4]= {'M','F','F','M'}
		cadeia auxPesq = " "

		para (inteiro i=0;i<4; i++){ 
			escreva("Matricula: ", mat[i], "Nome:  ", aluno[i],"\n")
			escreva("Digite nota do Aluno: ")
			leia(nota[i])
			
		}
		escreva("Boletim\n")
		para(inteiro i=0; i<4; i++){
			escreva(mat[i], " ", aluno[i]," ", (2022-anoNasc[i])," ",nota[i]," ")
			se(nota[i]<=5){
				se(genero[i]=='F'){
					escreva("Reprovada")
				}
				senao{
					escreva("Reprovado")
				}
				
			}
			senao {
				se(genero[i]=='F'){
					escreva("Aprovada")
				}
				senao{
					escreva("Aprovado")
				}
			}
			escreva("\n")
		}
		escreva("Pesquisa :")
		leia(auxPesq)
		
		para(inteiro i=0;i<4; i++){
		
			se(auxPesq==mat[i]){
				escreva(mat[i], " ", aluno[i]," ", (2022-anoNasc[i])," ",nota[i]," ")
			se(nota[i]<=5){
				se(genero[i]=='F'){
					escreva("Reprovada")
				}
				senao{
					escreva("Reprovado")
				}
				
			}
			senao {
				se(genero[i]=='F'){
					escreva("Aprovada")
				}
				senao{
					escreva("Aprovado")
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
 * @POSICAO-CURSOR = 924; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */