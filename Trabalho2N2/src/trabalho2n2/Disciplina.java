package trabalho2n2;

/**
 *
 * @author fbrito
 */
public class Disciplina {
    private String nomeDisciplina;
    private String codigoDisciplina;
    private String curso;
    private int cargaHorariaSemanal;
    private String professor;
    private char turno;
    private String diaSemana;
    private String horarios;
    private String identificadorSala;

    public Disciplina() {
    }
    
    public Disciplina(String nomeDisciplina, String codigoDisciplina, String curso, int cargaHorariaSemanal, String professor, char turno, String diaSemana, String horarios, String identificadorSala) {
        this.nomeDisciplina = nomeDisciplina;
        this.codigoDisciplina = codigoDisciplina;
        this.curso = curso;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
        this.professor = professor;
        this.turno = turno;
        this.diaSemana = diaSemana;
        this.horarios = horarios;
        this.identificadorSala = identificadorSala;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(String codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    public void setCargaHorariaSemanal(int cargaHorariaSemanal) {
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public String getIdentificadorSala() {
        return identificadorSala;
    }

    public void setIdentificadorSala(String identificadorSala) {
        this.identificadorSala = identificadorSala;
    }
    
    
}
