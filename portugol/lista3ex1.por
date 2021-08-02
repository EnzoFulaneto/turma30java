programa
{
//ENTRADA - Dados sobre o salário e número de filhos.
//SAÍDA - Média do salário da população; média do número de filhos; maior salário
//e percentual de pessoas com salário até R$100,00.
	inteiro salario, filhos
	real totalSalario = 0.0
	real mediaSalario = 0.0
	real totalFilhos = 0.0
	real mediaFilhos = 0.0
	real maiorSalario = 0.0 , totalSalario100 = 0.0
	real porCento 
	funcao inicio()
	{
		para (inteiro entrada = 1; entrada <= 5; entrada ++){
			escreva("Digite seu salário: R$")
			leia (salario)
			totalSalario = totalSalario + salario
			se (salario > maiorSalario){
				maiorSalario = salario
			}
			se (salario > 100){
				totalSalario100 ++
			}
			escreva ("Digite quantos filhos você tem: ")
			leia (filhos)
			totalFilhos = totalFilhos + filhos
			limpa()
			}

			mediaSalario = totalSalario / 5
			mediaFilhos = totalFilhos / 5
			porCento = (totalSalario100 * 20) / 100
			
//SAÍDA - Média do salário da população; média do número de filhos; maior salário
//e percentual de pessoas com salário até R$100,00.

			escreva ("\nA média salarial da população é de R$", mediaSalario)
			escreva ("\nA média de filhos da população é de ", mediaFilhos)
			escreva ("\nO maior salário dentre os inseridos é de R$", maiorSalario)
			escreva ("\n", porCento,"% das pessoas recebem um salário abaixo dos R$100")
			
			
			
				
			
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 644; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */