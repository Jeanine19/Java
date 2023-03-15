package aula_01;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Salário bruto: ");
		salarioBruto= leia.nextFloat();
		System.out.println("Adicional noturno: ");
		adicionalNoturno= leia.nextFloat();
		System.out.println("Horas Extras: ");
		horasExtras= leia.nextFloat();
		System.out.println("Descontos: ");
		descontos= leia.nextFloat();
		
		salarioLiquido = (salarioBruto + adicionalNoturno + (horasExtras * 5)- descontos);
		System.out.println("Salário líquido: " + salarioLiquido);
		
		leia.close();
	}

}
