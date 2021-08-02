programa
{
// leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
	inteiro anos, meses, dias, totdias
	
	funcao inicio()
	{
		escreva("Quantos anos você tem? ")
		leia (anos)
		escreva ("Quantos meses? ")
		leia (meses)
		escreva ("Quantos dias? ")
		leia (dias)
		
		totdias = (anos * 365) + (meses * 30) + dias

		
		escreva("Você está vivo à " +totdias," dias")
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