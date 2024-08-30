import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) throws Exception{
        Scanner sAccountNumber = new Scanner(System.in);
        Scanner sAgency = new Scanner(System.in);
        Scanner sNameClient = new Scanner(System.in);
        double balance = 200.0;

        System.out.println("Digite o numero da sua conta: ");
        int accountNumber = sAccountNumber.nextInt();

        System.out.println("Digite o numero da agencia: ");
        String agency = sAgency.nextLine();

        System.out.println("Digite seu nome: ");
        String nameClient = sNameClient.nextLine();

        System.out.println("Olá " + nameClient + ", obrigado por criar uma conta " +
                "em nosso banco, sua agência é " + agency +", conta " + accountNumber +" " +
                "e seu saldo R$" + balance +" já está disponível para saque.");

    }
}
