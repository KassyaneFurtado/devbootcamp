// TODO: Conhecer e importar a classe Scanner
// Exibir as mensagens para o nosso usuário
// Obter pela scanner os valores digitados no terminal
// Exibir a mensagem de conta criada

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Cliente novoCliente = new Cliente();
 
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println ("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println ("Digite seu sobrenome:");
        String sobrenome = scanner.nextLine();

        double saldo = 0.00;

        scanner.close();


        novoCliente.criarConta();
        int agencia = novoCliente.exibirAgencia();
        

        System.out.println ("Olá"+ " " + nome + " " + sobrenome +",obrigado por criar uma conta em nosso banco, sua agência é" + agencia + " " + "seu saldo atual é de R$" + saldo);


        }
}

    