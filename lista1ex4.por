programa{
	inteiro a, b, c, d, E, f
	real x1, x2, xtot, y1, y2, ytot
	
	funcao inicio (){
		escreva ("Insira o valor de A: ")
		leia (a)
		escreva ("Insira o valor de B: ")
		leia (b)
		escreva ("Insira o valor de C: ")
		leia (c)
		escreva ("Insira o valor de D: ")
		leia (d)
		escreva ("Insira o valor de E: ")
		leia (E)
		escreva ("Insira o valor de F: ")
		leia (f)

		x1 = (c * E) - (b * f) 
		x2 = (a * E) - (b * d)
		xtot = x1 / x2
		y1 = (a * f) - (c * d) 
		y2 = (a * E) - (b * d)
		ytot = y1 / y2
		escreva ("O valor de x é ", +xtot)
		escreva ("\nO valor de y é ", +ytot)

	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 590; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */