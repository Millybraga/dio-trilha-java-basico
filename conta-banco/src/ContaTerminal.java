import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero = 0;
        String agencia;
        String nomeCliente = "";
        double saldo = 250.99;

        Scanner input = new Scanner(System.in);

        System.out.println("Olá, insira seu nome completo: ");
        nomeCliente = input.nextLine();
        System.out.println("Insira o número da conta: ");
        numero = input.nextInt();
        System.out.println("Informe sua agência: ");
        agencia = input.next();

        System.out.print("Olá, " + nomeCliente + "! Obrigada por criar uma conta em nosso banco. Sua agência é: "
                + agencia + ", conta: " + numero + " e seu saldo de " + saldo + ", já está disponível para saque.");

        input.close();

    }
}
