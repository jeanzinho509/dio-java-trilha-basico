package EquilibrandoSaldo;

import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        // Calcula o saldo atualizado
        double novoSaldo = saldoAtual + valorDeposito - valorRetirada;

        // Imprime o novo saldo com uma casa decimal
        System.out.printf("Saldo atualizado na conta: %.1f%n", novoSaldo);
    }
}
