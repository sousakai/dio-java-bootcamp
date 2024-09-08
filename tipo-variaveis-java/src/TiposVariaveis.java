public class TiposVariaveis {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333;
        long cpf = 98765432109L; // SE iniciar em 0, existe a possibilidade de mudar para outro tipo.
        float pi = 3.14F; // Variáveis do tipo float DEVEM ser encerradas com "F".
        double salario = 1275.3;

        // Exemplo de casting:
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // Exemplo de CONSTANTES:
        final int exemplo_Constante = 10;
        // Constantes NÃO podem ter seu valor alterado! Por convenção, constantes devem
        // ser escritas em CAPSLOCK (Caixa Alta).
    }
}
