package auladoisjava;


public class AulaDoisJava {


    public static void main(String[] args) {
        
        //Instanciando objeto da classe Caneta
        Caneta c1 = new Caneta();
        c1.setModelo("Bic");
        c1.setPonta(0.5f);
        //c1.status();
        
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Ponta: " + c1.getPonta());
    }
    
}
