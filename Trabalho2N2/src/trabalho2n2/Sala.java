package trabalho2n2;

/**
 *
 * @author fbrito
 */
public class Sala {
    private String identificadorSala;
    private int bloco;
    private int numeroSala;
    private String tipoSala;
    private String status;

    public Sala() {
    }
    
    public Sala(String identificadorSala, int bloco, int numeroSala, String tipoSala, String status) {
        this.identificadorSala = identificadorSala;
        this.bloco = bloco;
        this.numeroSala = numeroSala;
        this.tipoSala = tipoSala;
        this.status = status;
    }

    public String getIdentificadorSala() {
        return identificadorSala;
    }

    public void setIdentificadorSala(String identificadorSala) {
        this.identificadorSala = identificadorSala;
    }

    public int getBloco() {
        return bloco;
    }

    public void setBloco(int bloco) {
        this.bloco = bloco;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
