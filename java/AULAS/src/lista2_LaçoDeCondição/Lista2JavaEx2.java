package lista2_LaçoDeCondição;

import java.util.Scanner;

public class Lista2JavaEx2 {
//Faça um programa que entre com três números e coloque em ordem crescente.
	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	int n1, n2, n3;
	
	
	System.out.println("Insira o primeiro valor: ");
	n1 = leia.nextInt();
	System.out.println("Insira o segundo valor: ");
	n2 = leia.nextInt();
	System.out.println("Insira o terceiro valor: ");
	n3 = leia.nextInt();
	
	if (n1 > n2 && n1 > n3) {
		if(n2 > n3) {
			System.out.println(n3+"\n"+n2+"\n"+n1);
		}
		else {
			System.out.println(n2+"\n"+n3+"\n"+n1);
		}}
	else if (n2 > n1 && n2 > n3) {
		if (n1 > n3) {
			System.out.println(n3+"\n"+n1+"\n"+n2);
		}
		else {
			System.out.println(n1+"\n"+n3+"\n"+n2);
		}}
	else {
		if (n1 > n2) {
			System.out.println(n2+"\n"+n1+"\n"+n3);
		}
		else {
			System.out.println(n1+"\n"+n2+"\n"+n3);
		}
	}
	}
	
	}
	

