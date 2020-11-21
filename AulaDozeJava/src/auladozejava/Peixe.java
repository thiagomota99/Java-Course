package auladozejava;

public class Peixe extends Animal {
    private String corDaEscama;
    
    //Métodos Getters e Setters!
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
    
    
    //Métodos herdados da Classe Animal!
    @Override
    public void locomover() {
        System.out.println("PEIXE NADANDO!");
    }

    @Override
    public void alimentar() {
        System.out.println("PEIXE SE ALIMENTANDO");
    }

    @Override
    public void emitirSom() {
        System.out.println("PEIXE NÃO EMITE SOM!");
    }
    
    //Métodos da classe Peixe!
    public void soltarBolha(){
        System.out.println("PEIXE FAZENDO BOLHA");
    }
    
}
