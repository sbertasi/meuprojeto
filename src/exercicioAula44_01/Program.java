package exercicioAula44_01;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectangle width and height:");
		Rectangle.width = sc.nextDouble();
		Rectangle.height = sc.nextDouble();
		System.out.println("AREA = " + Rectangle.area());
		System.out.println("PERIMETER = " + Rectangle.perimeter());
		System.out.println("DIAGONAL = " + Rectangle.diagonal());
		sc.close();
	} 

}
