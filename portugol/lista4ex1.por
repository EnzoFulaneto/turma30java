programa
{
//crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva.Encontre após a maior pontuação.
	inteiro maiorPontos = 0
	funcao inicio()
	{
		inteiro pontos[5]
		para (inteiro x = 0; x < 5; x++){
			escreva ("Insira sua pontuação nesta atividade: ")
			leia (pontos[x])
			se (pontos[x] > maiorPontos){
				maiorPontos = pontos[x]
			}
		}

		para (inteiro x = 0; x < 4; x++){
			escreva (pontos[x], " ")
		}
		escreva ("\n")
		escreva ("A maior pontuação atingida nesta atividade foi ", maiorPontos)
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 226; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */