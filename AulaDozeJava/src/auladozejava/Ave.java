package auladozejava;


public class Ave extends Animal {
    private String corDaPena;
    
    //Métodos Getters e Setters!
    public String getCorDaPena() {
        return corDaPena;
    }

    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
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
    
    
    //Métodos da classe Animal

    @Override
    public void locomover() {
        System.out.println("AVE LOCOMOVENDO!");
    }

    @Override
    public void alimentar() {
        System.out.println("AVE ALIMENTANDO-SE!");
    }

    @Override
    public void emitirSom() {
        System.out.println("AVE EMITINDO SOM!");
    }
    
    //Métodos da classe Ave
    public void fazerNinho(){
        System.out.println("AVE FAZENDO NINHO!");
    }
}
