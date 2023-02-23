/*
* Nome: Ismael Fernandes Brito
* Matrícula: 20202103020266
*/

package quest_10;

import java.util.Scanner;

public class quest_10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, fatorial = 1;
		
		System.out.println("Digite um número: ");
		num = teclado.nextInt();
			
		for (int i = 1; i <= num; i++) {
			fatorial = fatorial * i;
		}
	
		System.out.println(num + "! = " + fatorial);
	
		teclado.close();
	}

}
