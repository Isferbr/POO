/*
* Nome: Ismael Fernandes Brito
* Matrícula: 20202103020266
*/

package quest_02;

import java.util.Scanner;

public class quest_02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double lado, area, dobro;
		
		System.out.printf("Digite o valor do lado do quadrado: ");
		lado = teclado.nextDouble();
		
		area = Math.pow(lado, 2);
		dobro = 2 * area;
		System.out.printf("O dobro da área do quadrado é: %.2f%n", dobro);

		teclado.close();
	}
	
}
