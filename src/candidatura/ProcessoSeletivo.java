package candidatura;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("*** Processo Seletivo ***");
        // analisarCandidato(1900.0);
        // analisarCandidato(2200.0);
        // analisarCandidato(2000.0);
        selecionarCandidato();
        
        

    }

    static void selecionarCandidato(){
        List<String> candidatosAceitos = new ArrayList<String>();
        String[] candidatos = {"Felipe", "Márcia","Júlia","Paulo","Augusto","Mônica","Fabrício","Daniela","Mirela","Jorge"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O Candidato "+ candidato+ ", solicitou o salário de R$ "+ salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O Candidato "+candidato+", foi selecionad(a) para a vaga");
                candidatosSelecionados++;
                candidatosAceitos.add(candidato);
            } 
            candidatoAtual++;
        }

        System.out.println("Usando ForEach");
        System.out.println("Os candidatos selecionados foram:");
        for (String candidatoAceito : candidatosAceitos) {
           System.out.println(candidatoAceito);
        }
        System.out.println("--------------");
        System.out.println("Usando For");
        System.out.println("Os candidatos selecionados foram:");
        for (int i = 0; i < candidatosAceitos.size(); i++) {
           System.out.println("O candidato de índice: "+(i+1)+" é o candidato:"+ candidatosAceitos.get(i));
        }
        
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o Candidato");
        } else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
            
        }
    }
}
