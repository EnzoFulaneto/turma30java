programa
{
//leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
	
	inteiro anos, meses, dias, totdias
	
	funcao inicio()
	{
		escreva("Quantos dias você tem? ")
		leia (totdias)
		
		anos = (totdias / 365)
		meses = ((totdias % 365) / 30)
		dias = (((totdias % 365) % 30))
		
		escreva("Você está vivo à " +anos," Anos\n")
		escreva (+meses , " Meses\n")
		escreva (+dias ," Dias")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 105; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */