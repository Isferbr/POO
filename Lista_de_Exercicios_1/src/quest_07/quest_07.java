/*
* Nome: Ismael Fernandes Brito
* Matrícula: 20202103020266
*/

package quest_07;

import java.util.Scanner;

public class quest_07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char opcao;
		
		System.out.println("Em qual turno você estuda? (m - matutino, v - vespertino ou n - noturno)");
		opcao = teclado.next().charAt(0);
		
		if (opcao == 'm' || opcao == 'M') {
			System.out.println("Bom dia!");
		}
		else if (opcao == 'v' || opcao == 'V') {
			System.out.println("Boa tarde!");
		}
		else if (opcao == 'n' || opcao == 'N') {
			System.out.println("Boa noite!");
		}
		else {
			System.out.println("Valor Inválido!");
		}
		
		teclado.close();
	}

}
