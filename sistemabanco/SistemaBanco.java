package sistemabanco;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Ismael Fernandes
 */
public class SistemaBanco {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nome;
        String cpf;
        int agencia;
        int numero;
        double saldo;
        double valor;
        ArrayList<ContaMultipla> listaConta = new ArrayList();
        ContaMultipla conta, conta2;

        int opcao;

        do {
            System.out.println("----------------------------------------");
            System.out.println("------ Bem Vindos a nossa Agência ------");
            System.out.println("----------------------------------------");
            System.out.println("Opção 1. Criar Conta");
            System.out.println("Opção 2. Extrato Bancário");
            System.out.println("Opção 3. Depósito");
            System.out.println("Opção 4. Saque");
            System.out.println("Opção 5. Transferência");
            System.out.println("Opção 6. Saldo");
            System.out.println("Opção 7. Sair");
            System.out.print("Digite sua opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            switch(opcao){
                case 1:
                    System.out.print("Digite o nome do titular: ");
                    nome = entrada.nextLine();
                    System.out.print("Digite o seu cpf: ");
                    cpf = entrada.nextLine();
                    System.out.print("Digite o número da sua agência: ");
                    agencia = entrada.nextInt();
                    System.out.print("Digite o número da sua conta: ");
                    numero = entrada.nextInt();
                    System.out.print("Digite o seu saldo: ");
                    saldo = entrada.nextDouble();
                    conta = new ContaMultipla(nome, cpf, numero, agencia, saldo);
                    listaConta.add(conta);
                    break;
                case 2:
                    System.out.print("Digite o número da conta: ");
                    numero = entrada.nextInt();
                    conta = listaConta.get(numero-1);
                    conta.extratoBancario();
                    break;
                case 3:
                    System.out.print("Digite o número da conta: ");
                    numero = entrada.nextInt();
                    conta = listaConta.get(numero-1);
                    System.out.print("Digite o valor do depósito: ");
                    valor = entrada.nextDouble();
                    conta.depositar(valor);
                    break;
                case 4:
                    System.out.print("Digite o número da conta: ");
                    numero = entrada.nextInt();
                    conta = listaConta.get(numero-1);
                    System.out.print("Digite o valor do saque: ");
                    valor = entrada.nextDouble();
                    conta.sacar(valor);
                    break;
                case 5:
                    System.out.print("Digite o número da conta de origem: ");
                    numero = entrada.nextInt();
                    conta = listaConta.get(numero-1);
                    System.out.print("Digite o número da conta de destino: ");
                    numero = entrada.nextInt();
                    conta2 = listaConta.get(numero-1);
                    System.out.print("Digite o valor da transferência: ");
                    valor = entrada.nextDouble();
                    conta.transferir(conta2, valor);
                    break;
                case 6:
                    System.out.print("Digite o número da conta: ");
                    numero = entrada.nextInt();
                    conta = listaConta.get(numero-1);
                    conta.getSaldo();
                    break;
                default:
                    if(opcao != 7) {
                        System.out.println("Opção Inválida!");
                    }
            }
        }while(opcao != 7);
    }
}