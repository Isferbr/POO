/*
* Nome: Ismael Fernandes Brito
* Matrícula: 20202103020266
*/

package quest_05;

import java.util.Scanner;

public class quest_05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double n1, n2, media = 0;
		
		System.out.printf("Digite a nota 1: ");
		n1 = teclado.nextDouble();
		System.out.printf("Digite a nota 2: ");
		n2 = teclado.nextDouble();
		
		media = (n1 + n2)/2;
		
		if (media == 10) {
			System.out.printf("Aprovado com Distinção");
		} else if (media >= 7) {
			System.out.print("Aprovado");
		} else {
			System.out.print("Reprovado");
		}
		
		teclado.close();
	}

}
