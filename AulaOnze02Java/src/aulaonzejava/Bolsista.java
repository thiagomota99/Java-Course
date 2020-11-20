package aulaonzejava;
public class Bolsista extends Aluno {
    private float bolsa;
    
    //Métodos especiais: Getters e Setters!
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    //Demais métodos!
    public void renovarBolsa(){
        System.out.println("Renovando bolsa!");
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("O aluno " + getNome() + " é bolsita! Pagamento facilitado.");
    }
}
