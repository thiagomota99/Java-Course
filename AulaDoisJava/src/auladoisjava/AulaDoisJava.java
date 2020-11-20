package auladoisjava;


public class AulaDoisJava {


    public static void main(String[] args) {
        
        //Instanciando objeto da classe Caneta
        Caneta c1 = new Caneta();
        
        //Definindo valores aos atributos do objeto da classe Caneta.
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
    
}
