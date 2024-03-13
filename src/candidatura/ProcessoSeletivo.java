package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            System.out.println("Discando...");
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            }else {
                System.out.println("Contato realizado com sucesso!");
            }
        } while (continuarTentando && tentativasRealizadas <= 3);
        if (atendeu) {
            System.out.println("Consegimos contato com o "+ candidato+ " na " + tentativasRealizadas + " tentativa");
        }else {
            System.out.println("Não conseguimos contato com o "+ candidato+ " numero máximo de tentativas excedido!");
        }
    }

    // metodo auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;  //retorna true com probabilidade de 1 para três tentativas
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        System.out.println("Candidatos selecionados pelo indice do elemento");
        for(int i=0; i< candidatos.length; i++){
            System.out.println("O candidato de nº " + (i+1) +" "+ candidatos[i]);
        }
        System.out.println("forma abreviada - for each");

        for (String candidato : candidatos) {
            System.out.println("O Candidato selecionado foi: " + candidato+" !");
        }
    }
    static void selecaoCandidatos(){
       String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};

       int candidatosSelecionados = 0;
       int candidatoAtual = 0;
       double salarioBase = 2000.00;

       while (candidatosSelecionados <  5 && candidatoAtual < candidatos.length) {
        String candidato = candidatos[candidatoAtual];
        double salarioPretendido = valorPretendido();
        System.out.println("O candidato" + candidato + " Solicitou este salário" + salarioPretendido);


        if (salarioBase > salarioPretendido) {
            System.out.println("O candidato "+candidato+ " foi selecionado para a vaga!");
            candidatosSelecionados++;
        }
        candidatoAtual++;
       }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00; //Salário Base do Cargo
        if (salarioBase > salarioPretendido){
            System.out.printf("Ligar opara o candidato \n");
        }else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando resultado demais candidatos");
        }
    }
}
