
package exerciciodois;


public class Aula {
   String materia;
   String professor;
   float tempoDeDuracao;
   int quantidadeDeAlunos;
   
   public void status(){
        System.out.println("Materia: " + this.materia);
        System.out.println("Professor: " + this.professor);
        System.out.println("Tempo De Duracao: " + this.tempoDeDuracao);
        System.out.println("Quantidade De Alunos: " + this.quantidadeDeAlunos);
    }
   
   public void iniciarAula(){
       System.out.println("Iniciando a aula...");
   }
   
   public void finalizarAula(){
       System.out.println("Finalizando a aula...");
   }
   
   public void intervalo(){
       System.out.println("Hora do intervalo!");
   }
}
