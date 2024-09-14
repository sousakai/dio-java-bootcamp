import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o número da sua conta bancária:");
        int conta = scanner.nextInt();

        System.out.println("Digite a sua agência:");
        int agencia = scanner.nextInt();

        System.out.println("Digite o seu saldo bancário:");
        float saldo = scanner.nextFloat();

        System.out.println("Olá, " + nome + "! Obrigado por consultar o terminal.\nA sua conta bancária " + conta
                + ", da agência " + agencia + " possui um saldo de: \nR$ " + saldo);
    }
}
