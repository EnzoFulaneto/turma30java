programa
{
/*
 * Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
 */
	real base, altura, area
	funcao inicio()
	{
		escreva("Insira o valor da base do triângulo: ")
		leia (base)
		escreva ("Insira o valor da altura do triângulo: ")
		leia (altura)
		
		area = (base * altura) / 2

		se (base > 0 e altura > 0) {
			escreva ("A área desse triângulo é ", area)
		}
		senao {
			escreva ("Os valores informados devem ser positivos.")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 230; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */