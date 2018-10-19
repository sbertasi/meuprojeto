package exercicioAula67_01;

import java.util.Locale;
import java.util.Scanner;

import entities.quartos;

/*
How many rooms will be rented? 3
Rent #1:
Name: Maria Green
Email: maria@gmail.com
Room: 5
Rent #2:
Name: Marco Antonio
Email: marco@gmail.com
Room: 1
Rent #3:
Name: Alex Brown
Email: alex@gmail.com
Room: 8
Busy rooms:
1: Marco Antonio, marco@gmail.com
5: Maria Green, maria@gmail.com
8: Alex Brown, alex@gmail.com
 */
public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
/*
 * A dona de um pensionato possui dez quartos para alugar para 
 * estudantes,sendo esses quartos identificados pelos números 
 * 0 a 9.
 */	
		quartos[] vect = new quartos[10];
		
		System.out.print("How many rooms will be rented?");
		int num = sc.nextInt();	
/*
 * Fazer um programa que inicie com todos os dez quartos 
 * vazios, e depois  leia uma quantidade N representando o número 
 * de estudantes que vão alugar quartos (N pode ser de 1 a 10). 		
 */
		
/*
 * Em seguida, registre o aluguel dos N estudantes. Para cada 
 * registro de aluguel, informar o nome e email do estudante, bem 
 * como qual dos quartos ele escolheu (de 0 a 9). Suponha que seja 
 * escolhido um quarto vago.		
 */
		for (int ix = 0; ix < num; ix++) {
			sc.nextLine();
			System.out.print("Name: ");
			String estudante = sc.nextLine();
			System.out.print("Email: ");
			String endereço = sc.nextLine();
			System.out.print("Room: ");
			int escolha = sc.nextInt();
			vect[escolha-1] = new quartos(estudante, endereço, escolha);
		}
		
/*
 * Ao final, seu programa deve imprimir
 * um relatório de todas ocupações do pensionato, por ordem de 
 * quarto,conforme exemplo.
 */
		System.out.println("Busy rooms:");
		for (int ix = 0; ix < vect.length; ix++) {
			if (vect[ix] != null) {
				System.out.println(
						vect[ix].getN_quarto() 
						+ ": "
						+ vect[ix].getNome()
						+ ", "
						+ vect[ix].getE_mail());
			}
			
		}
		sc.close();
	}

}
