package edu.kayke.javasintaxes;
//Código referente as aulas de anatomia de classes em Java.

public class AnatomiaClasse3 {

    public static void main(String[] args) {

        String primeiroNome = "Kayke";
        // Declaração de variável do tipo string.

        String segundoNome = "Gonçalves";

        int anoNascimento = 2005;
        // Declaração de variável do tipo inteiro.

        boolean verdadeira = true;
        // Declaração de variável do tipo booleano.

        boolean falsa = false;
        // Declaração de variável do tipo booleano.

        String anoNascimentoTxt = "2005";
        // Declaração de varíavel do tipo string para uso no mbloco "nomeCompletoNascimento".

        String nomeCompletoNascimento = nomeCompletoNascimento(primeiroNome, segundoNome, anoNascimentoTxt);
        // Aqui, uma variável vai receber todo o valor so segundo método descrito abaixo. 

        System.out.print("Variáveis:" + "\nPrimeiro Nome: " + segundoNome + "\nSegundo nome: " + segundoNome + "\nAno de Nascimento: " + anoNascimento + "\nBooleano verdadeiro: " + verdadeira + "\nBooleano falso: " + falsa);
        //Exibe, através do print, as strings e os valores das variáveis. A concatenação acontece com "+".

        System.out.println(".(nomeCompletoNascimento)");
        //Essa linha difere da anterior. Veja, existe o "printIn", pois ela utiliza um método. Por essa razão o código é diferente da linha 26, onde é feito apenas uma exibição simples.

    }

    public static String nomeCompletoNascimento(String primeiroNome, String segundoNome, String anoNascimentoTxt) {
        return primeiroNome.concat(" ").concat(segundoNome).concat(" ").concat(anoNascimentoTxt);
    }
}
