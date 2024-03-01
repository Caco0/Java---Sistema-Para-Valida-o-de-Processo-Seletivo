package candidatura;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(1900.00);
        analisarCandidato(2200.00);
        analisarCandidato(2000.00);


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
