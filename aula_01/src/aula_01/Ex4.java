package aula_01;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, diferenca;
		
		System.out.println("Primeiro numero ? ");
		n1= leia.nextFloat();
		System.out.println("Segundo numero ? ");
		n2= leia.nextFloat();
		System.out.println("Terceiro numero ? ");
		n3= leia.nextFloat();
		System.out.println("Quarto numero ? ");
		n4= leia.nextFloat();
		
		diferenca = (n1 * n2)- (n3 * n4);
		System.out.println("Difença é ? " + diferenca);
		
		leia.close();
	}

}