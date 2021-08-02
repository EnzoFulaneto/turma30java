programa 
{
//leia um número inteiro e indique se este número é par ou ímpar e se é positivo ou negativo.	

	inteiro numero
	
	funcao inicio()
	{
		escreva("Digite um número inteiro: ")
		leia (numero)

		se (numero == 0){
			escreva ("0 é neutro")
		}
		se (numero < 0){
			escreva ("O número inserido é negativo.")
		}
		senao{
			se (numero % 2 == 0) {
				escreva ("O número ", numero, " é par e positivo.")	
			}
			senao 
				escreva ("O número ", numero," é ímpar e positivo.")
			}
			 
		}
			
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 277; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */