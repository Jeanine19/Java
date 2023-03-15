package aula_01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float salario, abono, novoSalario;
	//variavel
		System.out.println("Digite seu salário:");
	    salario = entrada.nextFloat ();
	    System.out.println("Digite seu abono salarial: ");
	    abono= entrada.nextFloat();
	    
	    novoSalario = salario+ abono;
	    
	    System.out.println("Novo Salário:" + novoSalario);
	    
	    entrada.close();
	}
	

}
