programa
{
	real primeiro, segundo, terceiro, quarto, quadradoPrimeiro, quadradoSegundo, quadradoTerceiro, quadradoQuarto
	
	funcao inicio()
	{
		escreva("Insira o primeiro número: ")
		leia (primeiro)
		escreva("Insira o segundo número: ")
		leia (segundo)
		escreva("Insira o terceiro número: ")
		leia (terceiro)
		escreva("Insira o quarto número: ")
		leia (quarto)

		quadradoPrimeiro = (primeiro) * (primeiro)
		quadradoSegundo = (segundo) * (segundo)
		quadradoTerceiro = (terceiro) * (terceiro)
		quadradoQuarto = (quarto) * (quarto)

		se (quadradoTerceiro >= 1000){
			escreva ("O quadrado de ", terceiro," vale ", quadradoTerceiro,".")
		}
		senao {
			escreva ("O quadrado de ", primeiro," vale ", quadradoPrimeiro,".")
			escreva ("\nO quadrado de ", segundo," vale ", quadradoSegundo,".")
			escreva ("\nO quadrado de ", terceiro," vale", quadradoTerceiro,".")
			escreva ("\nO quadrado de ", quarto," vale ", quadradoQuarto,".")
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 374; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */