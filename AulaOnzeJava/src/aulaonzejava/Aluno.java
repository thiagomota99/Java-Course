package aulaonzejava;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    //Métodos Getters e Setters da classe!
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    //Demais métodos da classe!
    public void cancelarMatricula(){
        System.out.println("Matrícula será cancelada!");
    }
}
