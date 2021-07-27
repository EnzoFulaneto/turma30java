programa
{
/*
 * Faça um programa que pegue um número do teclado e calcule a soma de todos os
números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
1+2+3+4+5+6+7=28.
 */
	inteiro numero
	inteiro cont = 0
	inteiro tot = 0
	funcao inicio()
	{
		escreva ("Insira um número qualquer: ")
		leia (numero)
		faca {
			cont ++
			tot += cont
			se (cont < numero){
				escreva (cont, " + ")
			}
			senao {
				escreva (cont, " = ")
			}
		}
		enquanto (cont < numero)
		escreva (tot)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 356; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */