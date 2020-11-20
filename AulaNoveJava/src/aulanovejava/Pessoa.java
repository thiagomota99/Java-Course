package aulanovejava;
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    //Método construtor vazio da classe!
    public Pessoa() {
        
    }
    
    //Método construor padrão da classe!
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    //Métodos especiais: Getters e Setters!
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    //Demais métodos da classe!
    public void fazerAniversario(){
        setIdade(getIdade() + 1);
    }
}
