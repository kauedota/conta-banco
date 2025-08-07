import java.util.Scanner; // Importa a classe Scanner para ler dados do terminal

public class ContaTerminal {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler entrada do usuário via terminal
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis para armazenar os dados da conta
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicita e lê o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt(); // Lê número inteiro
        scanner.nextLine(); // Consome a quebra de linha deixada pelo nextInt

        // Solicita e lê o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine(); // Lê texto (ex: 067-8)

        // Solicita e lê o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = scanner.nextLine(); // Lê texto (ex: MARIO ANDRADE)

        // Solicita e lê o saldo da conta
        System.out.println("Por favor, digite o saldo da conta:");
        saldo = scanner.nextDouble(); // Lê número decimal

        // Exibe a mensagem formatada com os dados informados
        System.out.println("Olá " + nomeCliente + 
            ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
            ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close(); // Fecha o Scanner para liberar recursos
    }
}
