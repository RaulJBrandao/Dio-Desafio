 import java.util.Scanner;
 public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        float saldo = 237.48F;

        System.out.print("Por favor, insira o número de sua agência: ");
        agencia = scanner.next();
        System.out.print("Por favor, insira o seu nome: ");
        nomeCliente = scanner.next();
        System.out.print("Por favor, insira o numero da conta: ");
        numero = scanner.nextInt();
        
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta número "+numero+" e seu saldo de "+saldo+" já está disponível para saque.");
    }
}