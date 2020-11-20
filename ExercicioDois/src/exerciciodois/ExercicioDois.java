
package exerciciodois;


public class ExercicioDois {

    public static void main(String[] args) {
        //Criando instância da classe Garrafa
        Garrafa garrafa = new Garrafa();
        garrafa.cor = "amarela";
        garrafa.marca = "Hostnet";
        garrafa.litros = 1;
        garrafa.tampada = true;
        garrafa.vazia = false;
        
        garrafa.destampar();
        garrafa.encher();
        garrafa.status();
        
        
        //Crinado instância da classe Aula
        Aula aula = new Aula();
        aula.materia = "Matemática";
        aula.professor = "Maria";
        aula.tempoDeDuracao = 200;
        aula.quantidadeDeAlunos = 40;
        
        aula.status();
        aula.iniciarAula();
        aula.intervalo();
        aula.finalizarAula();
    }
}
