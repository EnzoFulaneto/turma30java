programa
{
//10/hora e 20/hora excedente. excede a partir de 50h. ler vars N e C, imprimir vars ST e E
	inteiro N, C, ST, E, SN, SE
	
	funcao inicio()
	{
		escreva("Insira quantas horas você trabalhou: ")
		leia (N)
		E = (N - 50) 
		SE = (E * 20)
		SN = N * 10 
		
		se (N <= 50){
			escreva ("Seu salário total foi de R$", SN," e você não teve horas excedentes.")
		}
		senao {
			ST = SE + 500
			escreva ("Seu salário total foi de R$", ST," inclusos R$", SE," de excedentes")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 439; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */