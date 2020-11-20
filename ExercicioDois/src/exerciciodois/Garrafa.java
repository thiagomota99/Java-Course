
package exerciciodois;


public class Garrafa {
    String cor;
    String marca;
    int litros;
    boolean vazia;
    boolean tampada;
    
    public void status(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Litros: " + this.litros);
        System.out.println("Vazia: " + this.vazia);
        System.out.println("Tampada: " + this.tampada);
    }
    
    public void encher(){
        if (this.tampada == false){
            if (this.vazia){
                System.out.println("Enchendo a garrafa...");
            }
            else {
                System.out.println("Garrafa cheia!");
            }
        }
        else {
            System.out.println("Garrafa está tampada!");
        }
        
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
        
}


