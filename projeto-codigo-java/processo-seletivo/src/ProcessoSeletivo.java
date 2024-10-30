import java.util.concurrent.ThreadLocalRandom;

//TODO: CASE 3 E CASE 4!

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela",
                "Daniela", "Jorge" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioPretendido = valorPretendido();
        double salarioBase = 2000;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioPretendido > salarioBase) {
            System.out.println("Ligue para o candidato com contra-proposta.");
        } else if (salarioPretendido == salarioBase) {
            System.out.println("Ligue para o candidato.");
        } else {
            System.out.println("Agurade o resultado dos demais candidatos.");
        }

    }
}
