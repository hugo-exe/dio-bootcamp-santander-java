import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scn = new Scanner(System.in);
        int numero;
        String agencia;
        String NomeCliente;
        double saldo;

        //Exibir as mensagens para o nosso usuário
        System.out.println("Digite o número da conta: ");
        numero = scn.nextInt();
        System.out.println("Digite o número da Agência: ");
        agencia = scn.next();
        System.out.println("Digite o seu nome, cliente: ");
        NomeCliente = scn.next();
        System.out.println("Digite o saldo inicial da sua conta: ");
        saldo = scn.nextDouble();

        // Obter pela scanner os valores digitados no terminal
        System.out.println(numero);
        System.out.println(agencia);
        System.out.println(NomeCliente);
        System.out.println(saldo);

        //Exibir a mensagem conta criada
        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
