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
    
    
    public void pagarMensalidade(){
        System.out.println("O aluno " + getNome() + " está pagando a mensalidade!");
    }
    //Demais métodos da classe!
    public void cancelarMatricula(){
        System.out.println("Matrícula será cancelada do aluno " + getNome());
    }
}
