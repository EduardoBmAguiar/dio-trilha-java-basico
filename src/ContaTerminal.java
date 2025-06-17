import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeDoCliente;
        double saldo;

        System.out.println("--------------------------------------------- \n" +
                           "    Criação de conta no banco Benjamin \n" +
                           "--------------------------------------------- \n \n");

        System.out.print("Por favor, digite o número da AGÊNCIA! : ");
        agencia = sc.nextLine();

        System.out.print("Por favor, digite o número da CONTA! : ");
        numero = sc.nextInt();

        System.out.print("Por favor, digite o nome do CLIENTE! : ");
        sc.nextLine();
        nomeDoCliente = sc.nextLine();

        System.out.print("Por favor, digite o valor do DEPÓSITO! : ");
        saldo = sc.nextDouble();

        System.out.printf("\n \nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque. \n \n", nomeDoCliente, agencia, numero, saldo);

        sc.close();
    }
}