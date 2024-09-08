public class Operadores {
    public static void main(String[] args) {
        double soma = 10.5 + 15.7;
        // O operador "+", quando usado em meio a strings, CONCATENA o texto.
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        // A função módulo serve para enviar o resto da divisão. Exemplo: 10 % 3 = 1.
        double resultado = (10 * 7) + (20 / 4);

        String exemploConcat = "Concatenação" + " Java";
        System.out.println(exemploConcat);

        int numero = 5;
        numero = -numero;
        System.out.println(numero);
        // Convertendo o número para valor negativo.

        numero = numero * -1;
        // Convertendo o valor negativo para positivo. Ao usar "+" para a conversão, o
        // efeito não é o esperado, pois o "+" vai agir como operador de soma.
        // Multiplicando por -1, porém, o número se converte para positivo.

        System.out.println(numero);

        // Exemplo de incremento e decremento de variáveis:

        int exNumero = 3;
        System.out.println(exNumero--);
        // O operador "--" diminui o valor de um. Na prática: exNumero = exNumero - 1. O
        // comando "--" foi estabelecido APÓS o println, portanto, ele exibe o valor e
        // só depois decrementa o valor de um da variável.

        System.out.println(exNumero);
        // Com o valor de 1 decrementado dentro da função println anterior, o valor de
        // exNumero passa a ser 2.

    }
}
