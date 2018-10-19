package course;

import java.util.Locale;
import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name");
		String nome = sc.nextLine();
		System.out.println(nome);
		
		System.out.println("How many bedrooms are in your house?");
		Integer i1 = sc.nextInt();
		System.out.println(i1);
		
		System.out.println("Enter product price");
		Double preco = sc.nextDouble();
		System.out.println(preco);
		
		System.out.println("Enter your last name, age and height (same line)");
		String lnome = sc.next();
		Integer idade = sc.nextInt();
		Double altura = sc.nextDouble();
		System.out.print(lnome);
		System.out.print(" ");
		System.out.print(idade);
		System.out.print(" ");
		System.out.println(altura);
		
		
		
		
		
		
		
		
		

	}

}
