package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCnadidatos();
    }

    static void selecaoCnadidatos(){
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
