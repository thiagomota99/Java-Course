package aulaonzejava;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;
    
    //Métodos Getters e Setters da classe!
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    //Demais métodos da classe!
    public void mudarTrabalho(){
        setTrabalhando(!isTrabalhando());
    }
    
    
}
