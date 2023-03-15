package aula_01;
 import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, media;
		
		System.out.println("Primeira nota? ");
		nota1= leia.nextFloat();
		System.out.println("Segunda nota? ");
		nota2= leia.nextFloat();
		System.out.println("Terceira nota? ");
		nota3= leia.nextFloat();
		System.out.println("Quarta nota? ");
		nota4= leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("A Média é ? " + media);
		
		leia.close();
	
	}

}
