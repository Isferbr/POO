/*
* Nome: Ismael Fernandes Brito
* Matrícula: 20202103020266
*/

package quest_03;

import java.util.Scanner;

public class quest_03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1, n2;
		double n3, produto, soma, potencia;
				
		System.out.printf("Digite o primeiro número inteiro: ");
		n1 = teclado.nextInt();
		System.out.printf("Digite o segundo número inteiro: ");
		n2 = teclado.nextInt();
		System.out.printf("Digite um número real: ");
		n3 = teclado.nextDouble();
		
		produto = 2 * n1 + n2/2;
		System.out.printf("O produto do dobro do primeiro com a metade do segundo é: %.2f%n\n", produto);
		soma = 3 * n1 + n3;
		System.out.printf("A soma do triplo do primeiro com o terceiro é: %.2f%n\n", soma);
		potencia = Math.pow(n3, 3);
		System.out.printf("O terceiro elevado ao cubo é: %.2f%n\n", potencia);
		
		teclado.close();
	}

}
