programa 
{
	inteiro cf, pd, imp, cc
	
	funcao inicio()
	{
		escreva ("Qual o custo de fábrica? ")
		leia (cf)
		//percentagem do distribuidor seja de 28% e os impostos de 45%
		pd = cf * 0.28
		imp = cf * 0.45
		cc = cf + pd + imp
		escreva ("O custo do consumidor foi de " +cc)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 201; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */