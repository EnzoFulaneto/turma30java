programa
{
/*
 * Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */
	inteiro evento, hora, minuto, segundo
	funcao inicio()
	{
		escreva ("Quanto tempo durará esse evento (em segundos): ")
		leia (evento)
		
		hora = (evento / 3600)
		minuto = ((evento % 3600) / 60)
		segundo = ((evento % 3600) % 60)

		escreva ("O evento durará\n")
		escreva (hora, " hora(s);\n")
		escreva (minuto, " minutos;\n")
		escreva (segundo, " segundos.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 464; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */