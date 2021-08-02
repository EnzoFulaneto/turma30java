programa
{
//ler a varíavel P.Calcular E(Excesso), M(multa(4 por kilo)).caso não haja excesso,zerar vars
	real P, M, E
	
	funcao inicio()
	{
		escreva("Insira o peso (em Kg) de tomates a ser trazido: ")
		leia (P)
		
		E = P - 50
		M = E * 4

		se (P <= 50){
			escreva ("O valor está de acordo com a lei, logo não há excesso ou multa.")
		}
		senao
			escreva ("O valor excedente foi de ", E,"Kg e a multa cobrada será de R$", M)
			
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */