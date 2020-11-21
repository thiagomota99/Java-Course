package auladozejava;


public class AulaDozeJava {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil   r = new Reptil();
        Peixe    p = new Peixe();
        Ave      a = new Ave();
        
        m.setNome("Cachorro");
        m.setIdade(2);
        m.setMembros(4);
        m.setPeso(5.0f);
        m.setCorPelo("Caramelo");
        
        m.alimentar();
        m.locomover();
        m.emitirSom();
        System.out.println("===============================");

        r.setNome("Cobra");
        r.setIdade(2);
        r.setMembros(0);
        r.setPeso(2.0f);
        r.setCorDaEscama("Preta");
        
        r.alimentar();
        r.locomover();
        r.emitirSom();
        System.out.println("===============================");

        p.setNome("Baiacu");
        p.setIdade(2);
        p.setMembros(0);
        p.setPeso(5.0f);
        p.setCorDaEscama("Caramelo");
          
        p.alimentar();
        p.locomover();
        p.emitirSom();
        p.soltarBolha();
        System.out.println("===============================");
        
        
        a.setNome("PicaPau");
        a.setIdade(2);
        a.setMembros(2);
        a.setPeso(1.0f);
        a.setCorDaPena("Caramelo");
        
        a.alimentar();
        a.locomover();
        a.emitirSom();
        a.fazerNinho();
        
        
        
        System.out.println("Classe: Canguru, Cachorro, Cobra, Tartaruga, GoldFish e Arara");
        Mamifero m1 = new Mamifero();
        Cachorro c1 = new Cachorro();
        Canguru can1 = new Canguru();
        
        
        m1.setNome("Cachorro - Mamífero");
        m1.setIdade(2);
        m1.setMembros(4);
        m1.setPeso(5.0f);
        m1.setCorPelo("Caramelo");
        m1.alimentar();
        m1.locomover();
        m1.emitirSom();
        System.out.println("======================================");
        
        can1.setNome("Canguru Australiano");
        can1.setIdade(2);
        can1.setMembros(4);
        can1.setPeso(5.0f);
        can1.setCorPelo("Caramelo");
        can1.alimentar();
        can1.locomover();
        can1.emitirSom();
        
        
        
    }
    
}
