import entities.Conta;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite a agência: ");
        String agencia = sc.next();

        System.out.println("Digite o número da conta: ");
        Integer conta = sc.nextInt();

        System.out.println("Digite seu saldo: ");
        Double saldo = sc.nextDouble();

        Conta conta1 = new Conta(conta, agencia, nome, saldo);

        System.out.println(conta1.toString());
    }
}