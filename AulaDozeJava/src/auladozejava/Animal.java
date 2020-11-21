package auladozejava;

public abstract class Animal {
    protected String nome;
    protected float peso;
    protected int membros;
    protected int idade;
    
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    
}
