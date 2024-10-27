public class ExemploForArray {
    public static void main(String args[]) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // FORMA 1

        for (int x = 0; x < alunos.length; x++) {
            System.err.println("O aluno no índice x = " + x + " é " + alunos[x]);
        }

        // FORMA 2
        for (String aluno : alunos) {
            System.out.println("O nome do aluno é " + aluno);
        }
    }
}
