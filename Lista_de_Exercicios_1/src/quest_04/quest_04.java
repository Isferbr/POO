/*
* Nome: Ismael Fernandes Brito
* Matrícula: 20202103020266
*/

package quest_04;

import java.util.Scanner;

public class quest_04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char letra;
		
		System.out.printf("Digite a letra do seu sexo: ");
		letra = teclado.next().charAt(0);
		
		if (letra == 'f' || letra == 'F') {
			System.out.println("F - Feminino");
		}
		else if (letra == 'm' || letra == 'M') {
			System.out.println("M - Masculino");
		}
		else {
			System.out.println("Sexo Inválido");
		}
		
		teclado.close();
	}

}
