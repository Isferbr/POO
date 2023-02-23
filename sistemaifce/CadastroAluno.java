package sistemaifce;

public class CadastroAluno {
    // Atributos
    private int matricula;
    private String nome;
    private double peso1, peso2;
    private double nota1, nota2, nota3, nota4;
    private double mediaEtapa1, mediaEtapa2, mediaFinal;

    // Construtor
    public CadastroAluno(String nome, int matricula, double nota1, double nota2, double nota3, double nota4) {
        this.matricula = matricula;
        this.nome = nome;
        this.peso1 = 2.0;
        this.peso2 = 3.0;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.mediaEtapa1 = mediaEtapa1;
        this.mediaEtapa2 = mediaEtapa2;
        this.mediaFinal = mediaFinal;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPeso1() {
        return this.peso1;
    }

    public double getPeso2() {
        return this.peso2;
    }

    public double getNota1() {
        return this.nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    public double getNota3() {
        return this.nota3;
    }

    public double getNota4() {
        return this.nota4;
    }

    public double getMediaEtapa1() {
        return this.mediaEtapa1;
    }

    public double getMediaEtapa2() {
        return this.mediaEtapa2;
    }

    public double getMediaFinal() {
        return this.mediaFinal;
    }

    public void calculaMediaPorEtapa(int codigo) {
        System.out.println("------------------------------");
        System.out.println("------- Média por Etapa ------");
        System.out.println("------------------------------");
        switch(codigo) {
            case 1:
                this.mediaEtapa1 = (peso1*nota1 + peso2*nota2)/ (peso1 + peso2);
                System.out.println("Sua média na etapa 1 é: " +this.mediaEtapa1);
                break;
            case 2:
                this.mediaEtapa1 = (peso1*nota3 + peso2*nota4)/ (peso1 + peso2);
                System.out.println("Sua média na etapa 2 é: " +this.mediaEtapa1);
                break;
        }
    }

    public void calculaMediaFinal() {
        System.out.println("------------------------------");
        System.out.println("--------- Média Final --------");
        System.out.println("------------------------------");
        this.mediaFinal = (mediaEtapa1 + mediaEtapa2)/ 2;
        System.out.println("Sua média final é: " +this.mediaFinal);
    }

    public void calculaResultadoFinal() {
        System.out.println("------------------------------");
        System.out.println("---------- Situação ----------");
        System.out.println("------------------------------");
        if(mediaFinal >= 7.0) {
            String situacao = "Aprovado!";
            System.out.println("Você está " +situacao);
        }
        else if(mediaFinal < 4.0) {
            String situacao = "Avaliação Final!";
            System.out.println("Você está " +situacao);
        }
        else {
            String situacao = "Reprovado!";
            System.out.println("Você está " +situacao);
        }
    }

    public void apresentaResultado() {
        System.out.println("------------------------------");
        System.out.println("------- Resultado Final ------");
        System.out.println("------------------------------");
        System.out.println("Aluno: " + this.nome);
        System.out.println("Matrícula: " +this.matricula);
        System.out.println("Media na Etapa 1: " +this.mediaEtapa1);
        System.out.println("Media na Etapa 2: " +this.mediaEtapa2);
        System.out.println("Média Final: " +this.mediaFinal);
        
    }
}
