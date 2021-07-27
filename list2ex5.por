programa
{
/*
 * Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são
intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
notificados a paralisarem suas atividades.
 */
	real indice
	funcao inicio()
	{
		escreva("Insira o índice de poluição medido: ")
		leia (indice)
		
		se (indice == 0.3){
			escreva ("Notifique as empresas do Primeiro Grupo.")
		}
		senao se (indice == 0.4){
			escreva ("Notifique as empresas do Primeiro e Segundo Grupo.")
		}
		senao se (indice == 0.5){
			escreva ("Notifique as empresas dos três grupos.")
		}
		senao {
			escreva ("O valor inserido como índice não serve aos parâmetros.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */