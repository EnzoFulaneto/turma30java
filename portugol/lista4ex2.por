programa
{
	inclua biblioteca Util
	
//média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.	
	inteiro somaDado = 0, media, maior = 0, maiorRep = 1
	funcao inicio()
	{
		inteiro dado[10]
		para (inteiro x = 0; x < 10; x ++){
			dado[x] = Util.sorteia(1, 6)
			se (dado[x] == maior){
				maiorRep ++
			}
			se (dado[x] > maior){
				maior = dado[x]
			}
			somaDado += dado[x]
		}

		para (inteiro x = 0; x < 10; x ++){
			escreva (dado[x], "\n")
		}
		media = somaDado / 10
		escreva ("A média entre os lançamentos foi de ", media)
		escreva ("\nO maior valor lançado foi de ", maior)
		escreva (" e ela aparece ", maiorRep," vez(es).")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 408; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */