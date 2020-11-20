package auladoisjava;


public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    public Caneta(){
        tampar();
        this.cor = "Azul";
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public void status(){
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    
    public void destampar(){
        this.tampada = false;
    }
    
    
}
