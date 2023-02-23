package sistemabanco;
/**
 * @author Ismael Fernandes
 */

public class ContaMultipla {
    // Atributos
    private String nome;
    private String cpf;
    private int numero;
    private int agencia;
    private double saldo;

    // Construtor
    /**
     * Construtor para criar uma conta a partir do nome e cpf de pessoa 
     * @param nome nome do titular
     * @param cpf cpf do titular
     * @param numero numero da conta
     * @param agencia agencia do titular
     */
    public ContaMultipla(String nome, String cpf, int numero, int agencia, double saldo) {
        this.nome = nome;
        this.cpf = cpf; 
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }    
    // Métodos
    /**
     * Recupera o nome do titular da conta.
     * @return o nome do titular da conta.
     */
    public String getNome(){
        return this.nome;
    }
    /**
     * Recupera o CPF do titular da conta.
     * @return o CPF do titular da conta.
     */
    public String getCPF(){
        return this.cpf;
    }
    /**
     * Recupera o Numero do titular da conta.
     * @return o Numero do titular da conta.
     */
    public int getNumero(){
        return this.numero;
    }
    /**
     * Recupera a Agencia do titular da conta.
     * @return  a Agencia do titular da conta.
     */
    public int getAgencia(){
        return this.agencia;
    }
    /**
     * Recupera o saldo da conta.
     * @return o saldo da conta.
     */
    public void getSaldo(){
        System.out.println("-----------------------------------------");
        System.out.println("------------- Saldo Atual ---------------");
        System.out.println("-----------------------------------------");
        System.out.println("Seu saldo atual é: " +this.saldo);
        System.out.println("-----------------------------------------");
    }
    /**
     * Efetua um depósito em uma conta.
     * @param valor O valor a ser depositado.
     */
    public void depositar(double valor){
        //
        System.out.println("---------- Realizando Depósito ---------");
        System.out.println("Saldo antes do depósito: " +this.saldo);
        //Crédito na conta
        this.saldo += valor;
        System.out.println("Saldo depois do depósito: " +this.saldo);
        System.out.println("----------- Fim do Depósito ------------");
    }
    /**
     * Efetua o saque na conta.
     * @param valor valor do saque
     * @return Sucesso ou não da operação.
     */
    public void sacar(double valor){
        System.out.println("----------------------------------------");
        System.out.println("----------- Realizando Saque -----------");
        System.out.println("----------------------------------------");
        System.out.println("Saldo antes do saque: " +this.saldo);
        if(this.saldo - valor >= 0){
            this.saldo -= valor;
            System.out.println("Saldo depois do saque: " +this.saldo);
        }
        else{
            System.out.println("Saldo Insuficiente!");
        }
        System.out.println("------------- Fim do Saque -------------");
    }
    /**
     * Acessa os dados da conta e gera um extrato.
     * @return Sting com os dados bancários.
     */
    public void extratoBancario(){
        System.out.println("----------------------------------------");
        System.out.println("---------- Extrato Bancário ------------");
        System.out.println("----------------------------------------");
        System.out.println("Agência: " +this.agencia);
        System.out.println("Conta: " +this.numero);
        System.out.println("Titular: " +this.nome);
        System.out.println("Saldo: R$ " +this.saldo);
        System.out.println("----------------------------------------");
    }

    public void transferir(ContaMultipla contaDestino, double valor) {
        System.out.println("----------------------------------------");
        System.out.println("------- Realizando Transferência -------");
        System.out.println("----------------------------------------");
        System.out.println("Saldo antes origem: " +this.saldo);
        System.out.println("Saldo depois destino: " +contaDestino.saldo);
        if(valor <= this.saldo){
            this.saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Saldo depois origem: " +this.saldo);
            System.out.println("Saldo depois destino: " +contaDestino.saldo);
        }
        else{
            System.out.println("Saldo Insuficiente!");
        }
        System.out.println("--------- Fim da Transferência ---------");
    }
}

