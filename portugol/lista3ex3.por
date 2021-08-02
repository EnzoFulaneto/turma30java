programa
{
//leitura sucessiva de valores e o somatório, a média e o total de valores lidos. para com neg

	inteiro valor = 0
	inteiro total = 0
	real soma = 0.00
	real media
	funcao inicio()
	{
		enquanto (valor >= 0){
			escreva ("Insira um valor: ")
			leia (valor)
				se (valor >= 0){
					total = total + 1
					soma = soma + valor
					media = (soma / total)	
				}
		}
		escreva ("A somatória dos valores inserido é de ", soma)
		escreva ("\nA média dos valores inseridos é de ", media)
		escreva ("\nO total de valores lidos é de ", total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 147; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */