package Desafios.CondicionalmenteRico;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    try (// Entrada de dados
    Scanner scanner = new Scanner(System.in)) {
      int saldoTotal = scanner.nextInt();
      int valorSaque = scanner.nextInt();

      // Verificar se o saldo é suficiente para o saque
      if (saldoTotal >= valorSaque) {
          // Se o saldo for suficiente, realizar o saque e atualizar o saldo
          saldoTotal -= valorSaque;
          System.out.println("Saque realizado com sucesso. Novo saldo: " + saldoTotal);
      } else {
          // Se o saldo for insuficiente, exibir mensagem de erro
          System.out.println("Saldo insuficiente. Saque nao realizado!");
      }
    }
  }
}
