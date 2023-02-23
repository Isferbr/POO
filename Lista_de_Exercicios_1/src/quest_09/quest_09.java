/*
* Nome: Ismael Fernandes Brito
* Matrícula: 20202103020266
*/

package quest_09;

import java.util.Scanner;

public class quest_09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, par = 0, impar = 0, contador = 2;
		
		System.out.println("Número 1: ");
		num = teclado.nextInt();
		
		while (contador <= 10) {
			System.out.println("Número " + contador + ": ");
			num = teclado.nextInt();
			
			if (num % 2 == 0) {
				num = par;
				par = par + 1;
			}
			else {
				num = impar;
				impar = impar + 1;
			}
			
			contador++;
		}
		
		System.out.println("A quantidade de números pares é: " + par);
		System.out.println("A quantidade de números impares é: " + impar);
		teclado.close();

	}

}
