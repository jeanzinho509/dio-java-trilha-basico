import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário que insira o número da Agência
        System.out.print("Programa: \"Por favor, digite o número da Agência !\": ");
        String agencia = scanner.nextLine();

        // Solicite ao usuário que insira o número da Conta
        System.out.print("Programa: \"Agora, digite o número da Conta !\": ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        // Solicite ao usuário que insira o nome do cliente
        System.out.print("Programa: \"Digite o nome do cliente !\": ");
        String nomeCliente = scanner.nextLine();

        // Solicite ao usuário que insira o saldo da conta
        System.out.print("Programa: \"Finalmente, digite o saldo da conta !\": ");
        double saldo = scanner.nextDouble();

        // Feche o Scanner, pois não precisamos mais dele
        scanner.close();

        // Exiba a mensagem com os dados inseridos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
