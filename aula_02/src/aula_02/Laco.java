package aula_02;

import java.util.Scanner;

public class Laco {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int nA, nB, nC;
		
		System.out.println("Escreva o Numero de A:");
		nA = leia.nextInt();
		System.out.println("Escreva o Numero de B:");
		nB = leia.nextInt();
		System.out.println("Escreva o Numero de C:");
		nC = leia.nextInt();
		if ((nA + nB) > nC) {
			System.out.println("A soma do A + B é maior que C ");
		}
		else if ((nA + nB) < nC) {
			System.out.println("A soma do A + B é menor que C ");
	}	
	
		else if ((nA + nB) == nC) {
		System.out.println("A soma do A + B é igual C ");
	}
	}
}
	


