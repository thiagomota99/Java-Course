package exerciciofinajava;


public class Gafanhoto extends Pessoa {
    private String login;
    private int totalVideosAssistidos;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        setLogin(login);
        setTotalVideosAssistidos(0);
    }
    
    //Métodos Getters e Setters da classe!
    public String getLogin(){
        return login;
        
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalVideosAssistidos() {
        return totalVideosAssistidos;
    }

    
    public void setTotalVideosAssistidos(int totalVideosAssistidos) {
        this.totalVideosAssistidos = totalVideosAssistidos;
    }
        
    //Métodos da Classe Pessoa!
    @Override
    public void ganharExp() {
         
    }

    @Override
    public String toString() {
        return "Gafanhoto{"+ super.toString() + "login=" + login + ", totalVideosAssistidos=" + totalVideosAssistidos + '}';
    }
    
    
    //Demais métodos!
    public void assitiuMaisUm() {
        setTotalVideosAssistidos(getTotalVideosAssistidos() + 1);
    }


}
