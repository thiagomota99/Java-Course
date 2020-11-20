
package aulacincojava;

import java.util.Scanner;


public class AulaCincoJava {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Conta contaJubileu = new Conta(0,false);
        Conta contaCreuza = new Conta(0,false);
        System.out.println("========= BANCO THG ==========");       
        System.out.print("Digite seu nome: ");
        contaJubileu.setDono(ler.nextLine());;
        System.out.println("Será Conta poupança ou corrente?(1/2)");
        contaJubileu.setTipo(ler.nextInt());
        contaJubileu.abrirConta();
        System.out.print("DEPOSITAR: ");
        contaJubileu.depositar(ler.nextDouble());
        
        
        System.out.println("========= BANCO THG ==========");       
        System.out.print("Digite seu nome: ");
        contaCreuza.setDono(ler.next());
        System.out.println("Será Conta poupança ou corrente?(1/2)");
        contaCreuza.setTipo(ler.nextInt());
        contaCreuza.abrirConta();
        System.out.print("DEPOSITAR: ");
        contaCreuza.depositar(ler.nextDouble());
        System.out.print("SACAR: ");
        contaCreuza.sacar(ler.nextDouble());
    }
    
}
