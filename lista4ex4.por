programa
{
	inclua biblioteca Util
	inteiro somaDiag = 0
	inteiro soma = 0
	funcao inicio()
	{
		const inteiro linha = 3
		const inteiro coluna = 3
		inteiro matriz [linha][coluna]
		
		para (inteiro l = 0; l < linha; l++){
			para (inteiro c = 0; c < coluna; c++){
				matriz[l][c] = Util.sorteia(0, 9)
				escreva (matriz[l][c], " ")
				se (l == c){
					somaDiag += matriz[l][c]
				}
			}
			escreva ("\n")
		}

		para (inteiro l = 0; l < linha; l++){
			para (inteiro c = 0; c < coluna; c++){
			}

			para (l = 0; l < linha; l++){
				para (inteiro c = 0; c < coluna; c++){
				soma = soma + matriz[l][c]
			}
		}
			escreva ("A soma dos valores da matriz resulta em ", soma)
			escreva ("\nA soma dos valores da diagonal principal é de ", somaDiag)
		}

		
		}
	
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 701; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */