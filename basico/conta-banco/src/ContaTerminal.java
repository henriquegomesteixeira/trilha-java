import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do titular da conta: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o número da Agencia:");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    
        scanner.close();
    }
}
