public class Operadores2 {
    public static void main(String[] args) {
        /*
         * OPERADOR TERNÁRIO (?)
         * O operador ternário é uma estrutura de decisão, como "if" e "else", mas
         * resumida/abreviada em uma linha.
         * A estrutura é: <expressão> ? <caso seja "true"> : <caso seja verdadeiro>
         * Veja abaixo:
         */
        int numero1 = 5;
        int numero2 = 2;

        String numeroUm_Dois = numero1 == numero2 ? "Mesmo número! (TRUE)" : "Número diferente! (FALSE)";
        // Essa operação "numero1 == numero2", na estrutura, SEMPRE deve ser um valor
        // booleano (true/verdadeiro ou false/falso).

        System.out.println(numeroUm_Dois);

        // VALORES BOOLEANOS + OPERADORES

        int valorUm = 3;
        int valorDois = 5;

        boolean igualDiferente = valorUm == valorDois;
        System.out.println(igualDiferente);
        // Verifica, em uma variável do tipo booleano, se o valorUm é igual ao
        // valorDois.

        igualDiferente = valorDois != valorUm;
        System.out.println(igualDiferente);
        // Verifica, em uma variável do tipo booleano, se o valorUm é diferente (!=) do
        // valorDois.

        // IF e ELSE
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2 == true) {
            System.out.println("As duas condições são verdadeiras.");
            // Verifica se ambas as condições são do valor "true", através do operador "&&"
            // (and).

        } else if (condicao1 || condicao2 == true) {
            System.out.println("Uma das condições é verdadeira.");
            // Verifica se uma condição ou a outra é do valor "true", através do operador
            // "||" (ou).

        } else {
            System.out.println("Nenhuma condição é verdadeira.");
        }
    }
}