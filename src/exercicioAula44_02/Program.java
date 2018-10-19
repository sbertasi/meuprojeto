package exercicioAula44_02;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

/*
 * Fazer um programa para ler os dados de um funcionário (nome, 
 * salário bruto e imposto). Em seguida, mostrar os dados do 
 * funcionário (nome e salário líquido). Em seguida, aumentar o 
 * salário do funcionário com base em uma porcentagem dada 
 * (somente o salário bruto é afetado pela porcentagem) e mostrar 
 * novamente os dados do funcionário. Use a classe projetada abaixo.
 * 
 */
public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Name:");
		Employee.Name = sc.nextLine();
		System.out.print("Gross Salary:");
		Employee.GrossSalary = sc.nextDouble();
		System.out.print("Tax:");
		Employee.Tax = sc.nextDouble();
		
		System.out.printf("Employee: %s", Employee.Name);
		System.out.printf(", $ %.2f \n", Employee.NetSalary());
		System.out.print("Which percentage to increase salary?");
		Employee.IncreaseSalary(sc.nextDouble());
		System.out.printf("Updated data: %s", Employee.Name);
		System.out.printf(", $ %.2f", (Employee.GrossSalary - Employee.Tax));
		sc.close();
	}

}
