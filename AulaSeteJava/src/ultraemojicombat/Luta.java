package ultraemojicombat;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    
    //Métodos da classe Luta.
    public void marcarLuta(Lutador desafiante, Lutador desafiado){
        if((desafiante.getCategoria() == desafiado.getCategoria()) && (desafiante != desafiado)){
            this.setAprovada(true);
            this.setDesafiante(desafiante);
            this.setDesafiado(desafiado);
        }
        else {
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
    }
    
    public void lutar(){
        if(isAprovada()){
           System.out.println("##DESAFIADO##");
           getDesafiado().apresentar();
           System.out.println("##DESAFIANTE##");
           getDesafiante().apresentar();
           Random aleatorio = new Random();
           int vencedor = aleatorio.nextInt(3); //0, 1, 2           
           System.out.println("========RESULTADO DA LUTA========");
           switch(vencedor){
               case 0: //Empate!
                   System.out.println("EMPATE!");
                   getDesafiado().empatarLuta();
                   getDesafiante().empatarLuta();
                   break;
                   
               case 1: //Desafiado Ganhou!
                   System.out.println("O desafiado " + getDesafiado().getNome() + " ganhou!");
                   getDesafiado().ganharLuta();
                   getDesafiante().perderLuta();
                   break;
               
               case 2: //Desafiante Ganhou!
                   System.out.println("O desafiante " + getDesafiante().getNome() + " ganhou!");
                   getDesafiante().ganharLuta();
                   getDesafiado().perderLuta();
                   break;
           }
                System.out.println("=================================");           
        }
        else {
            System.out.println("A luta não pode acontecer!");
        }
        
    }
    
    //Métodos Getters e Setters!
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desfiado) {
        this.desafiado = desfiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
