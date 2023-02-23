/*
* Nome: Ismael Fernandes Brito
* Matrícula: 20202103020266
*/

package quest_01;

import java.util.Scanner;

public class quest_01 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double raio, area;
		
		System.out.printf("Digite o valor do raio do círculo: ");
		raio = teclado.nextDouble();
		
		area = Math.PI * Math.pow(raio, 2);
		System.out.printf("A área do círculo é: %.2f%n", area);
		
		teclado.close();
	}
}
