package EquilibrandoSaldo;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EquilibrandoSaldo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Lê o saldo atual da conta
        System.out.print("Digite o saldo atual: ");
        StringTokenizer st = new StringTokenizer(br.readLine());
        double saldoAtual = Double.parseDouble(st.nextToken());

        // Lê o valor do depósito
        System.out.print("Digite o valor do depósito: ");
        st = new StringTokenizer(br.readLine());
        double valorDeposito = Double.parseDouble(st.nextToken());

        // Lê o valor da retirada
        System.out.print("Digite o valor da retirada: ");
        st = new StringTokenizer(br.readLine());
        double valorRetirada = Double.parseDouble(st.nextToken());

        // Calcula o saldo atualizado
        saldoAtual = saldoAtual + valorDeposito - valorRetirada;

        // Exibe o saldo atualizado com uma casa decimal
        System.out.println("Saldo atualizado na conta: " + String.format("%.1f", saldoAtual));
    }
}

