package aulaonzejava;

public class AulaOnzeJava {
    public static void main(String[] args) {
        //Criando objetos da classes
        Visitante v1 = new Visitante();
        v1.setIdade(20);
        v1.setNome("João");
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        
        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Pedro");
        b1.setMatricula(2222);
        b1.pagarMensalidade();
    }
    
}
