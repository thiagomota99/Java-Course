package auladozejava;

public class Reptil extends Animal {
    private String corDaEscama;
    
    //Métodos Getters e Sestters!
    public String getCorDaEscama() {
        return corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    //Métodos herdadados da Classe animal

    @Override
    public void locomover() {
        System.out.println("RÉPTIL RASTEJANDO!");
    }

    @Override
    public void alimentar() {
        System.out.println("RÉPTIL SE ALIMENTANDO!");
    }

    @Override
    public void emitirSom() {
        System.out.println("RÉPTIL EMITINDO SOM!");
    }
    
}
