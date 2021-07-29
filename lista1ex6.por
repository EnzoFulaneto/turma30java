programa
{
	inclua biblioteca Matematica --> mat
	inteiro x1, x2, y1, y2
	real d
	funcao inicio()
	{
		escreva("Insira x1: ")
		leia (x1)
		escreva("Insira x2: ")
		leia (x2)
		escreva("Insira y1: ")
		leia (y1)
		escreva ("Insira y2: ")
		leia (y2)
		d = mat.raiz (((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)), 2)

		escreva ("A distãncia d é ", d)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 357; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */