programa
{
	
	funcao inicio()
	{
	real x=0.0
	real totalSomatorio=0.0
	real media=0.0
	inteiro totalLidos=0

     
     
	enquanto(x>=0)
	{
		escreva(" digite um número inteiro positivo, ou negativo para sair:")
		leia (x)

		se(x>=0)
		{
			totalSomatorio=totalSomatorio+x
			totalLidos++
		}
		
	}	

		media=totalSomatorio/totalLidos
		escreva(" o somatorio destes números é: ", totalSomatorio)
		escreva("\n o total de numeros lidos é : ", totalLidos)
		escreva( "\n a média é:", media)
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 294; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */