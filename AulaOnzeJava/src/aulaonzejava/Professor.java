package aulaonzejava;

public class Professor extends Pessoa{
    private String especialidade;
    private double salario;
    
    //Métodos Getters e Setters da classe!
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //Demais métodos da classe!
    public void receberAumento(double aumentoSalarial){
        setSalario(getSalario() + aumentoSalarial);
    }
}
