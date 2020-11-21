package auladozejava;

public class Mamifero extends Animal {
    private String corPelo;
    
    //Métodos Getters e Setters!    
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
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
    
    @Override
    public void locomover() {
        System.out.println("MAMÍFERO CORRENDO!");
    }

    @Override
    public void alimentar() {
        System.out.println("MAMÍFERO SE ALIMENTANDO!");
    }

    @Override
    public void emitirSom() {
        System.out.println("MAMÍFERO EMITINDO SOM!");
    }
    
    
}
