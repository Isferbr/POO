/*
* Nome: Ismael Fernandes Brito
* Matrícula: 20202103020266
*/

package quest_08;

import java.util.Scanner;

public class quest_08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float num, maior;
		int contador = 2;
		
		System.out.println("Número 1: ");
		num = teclado.nextFloat();
		
		maior = num;
		
		while (contador <= 10) {
			System.out.println("Número " + contador + ": ");
			num = teclado.nextFloat();
			
			if (num > maior) {
				maior = num;
			}
			
			contador++;
		}
		
		System.out.println("O maior número digitado é: " + maior);
		teclado.close();
	}

}
