package sistemavoo;

import java.util.Scanner;

public class SistemaVoo {
    public static void public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean rodaPrograma = true;
        boolean[] assentos = new boolean[100];

        do {
            int classe = entrada.nextInt();

            switch(classe) {
                case 1:
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }while(rodaPrograma);
    }
}
