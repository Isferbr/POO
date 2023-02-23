package sistemaifce;

import java.util.Scanner;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int matricula;
        String nome;
        double nota1, nota2, nota3, nota4;

        System.out.print("Digite o seu nome: ");
        nome = entrada.nextLine();
        System.out.print("Digite o número da sua matrícula: ");
        matricula = entrada.nextInt();
        System.out.print("Digite a nota 1 da etapa 1: ");
        nota1 = entrada.nextDouble();
        System.out.print("Digite a nota 2 da etapa 1: ");
        nota2 = entrada.nextDouble();
        System.out.print("Digite a nota 1 da etapa 2: ");
        nota3 = entrada.nextDouble();
        System.out.print("Digite a nota 2 da etapa 2: ");
        nota4 = entrada.nextDouble();

        CadastroAluno aluno = new CadastroAluno(nome, matricula, nota1, nota2, nota3, nota4);

        int opcao;

        do {
            System.out.println("------------------------------------");
            System.out.println("--- Bem vindo ao Sistema do IFCE ---");
            System.out.println("------------------------------------");
            System.out.println("Opcao 1. Calcula a média por etapa");
            System.out.println("Opcao 2. Calcula a média final");
            System.out.println("Opcao 3. Calcula o resultado final");
            System.out.println("Opcao 4. Apresenta o resultado");
            System.out.println("Opcao 5. Sair");
            System.out.print("Digite sua opcao: ");
            opcao = entrada.nextInt();

            switch(opcao) {
                case 1:
                    System.out.print("Digite 1 para a média da etapa 1 ou 2 para a média da etapa 2: ");
                    int codigo = entrada.nextInt();
                    aluno.calculaMediaPorEtapa(codigo);
                    break;
                case 2:
                    aluno.calculaMediaFinal();
                    break;
                case 3:
                    aluno.calculaResultadoFinal();
                    break;
                case 4:
                    aluno.apresentaResultado();
                    break;
            }
        }while(opcao != 5);
    }
}
