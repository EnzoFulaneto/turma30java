programa
{
//efetue a soma dos números ímpares que são múltiplos de três e que se encontram entre 1 e 500.
//ex 2 - para
	inteiro soma = 0
	funcao inicio()
	{
		para (inteiro x = 1; x <= 500; x= x + 1){
			se (x % 2 == 1 e x % 3 == 0){
				soma = soma + x
			}
		}
		escreva ("A soma dos números ímpares múltiplos de 3, entre 1 e 500, resultou em ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 368; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */