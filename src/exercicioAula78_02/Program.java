package exercicioAula78_02;

import java.util.Scanner;

/*
 * Fazer um programa para ler dois n�meros inteiros M e N, e 
 * depois ler uma matriz de M linhas por N colunas contendo 
 * n�meros inteiros, podendo haver repeti��es. Em seguida, ler 
 * um n�mero inteiro X que pertence � matriz. Para cada ocorr�ncia 
 * de X, mostrar os valores � esquerda, acima, � direita e abaixo 
 * de X, quando houver, conforme exemplo.
 */
public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m,n;
		m=sc.nextInt();
		n=sc.nextInt();
		int[][] matr = new int[m][n];
		
		for (int i=0; i<matr.length; i++) {
			for(int j=0; j<matr[i].length;j++) {
				matr[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		for (int i=0; i<matr.length; i++) {
			for(int j=0; j<matr[i].length;j++) {
				if (matr[i][j] == x) {
					System.out.printf("Position (%d,%d) = %d\n", i, j, x);
					if (j > 0) {
						System.out.println("Left: " + matr[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matr[i-1][j]);
					}
					if (j < matr[i].length-1) {
						System.out.println("Right: " + matr[i][j+1]);
					}
					if (i < matr.length-1) {
						System.out.println("Down: " + matr[i+1][j]);
					}
				}
			}
		}	
		sc.close();
	}
}