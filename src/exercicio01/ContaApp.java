package exercicio01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ContaApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ContaCorrente contaCorrente = new ContaCorrente();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		double valor = 0;
        int numeroDaConta = 0;

		int opcao = 0;

        System.out.println("Seja bem vindo ao melhor banco já feito pelo console do Java!");

        System.out.println("Vamos entrar sua conta!");

        System.out.println("Qual é o seu nome");
        contaCorrente.setNomeCliente(sc.next());

        System.out.println("Qual é o número da agência?");
        contaCorrente.setNumeroDaAgencia(sc.nextInt());

        System.out.println("Qual é o número da sua conta?");
        contaCorrente.setNumeroDaAgencia(sc.nextInt());

        System.out.println("Qual é a sua data de nascimento? Ex: 20-10-2007\n");
        contaCorrente.setDataNascimento(LocalDate.parse(sc.next(), formatter));

        System.out.println("Qual é o saldo da sua conta?");
        contaCorrente.setSaldoDaConta(sc.nextDouble());

		do {
			System.out.println("""
					Digite 1 para ver o saldo da conta. - 1.
					Digite 2 para sacar - 2.
					Digite 3 para depositar - 3
					Digite 4 para transferir - 4
					Digite 5 para cancelar a conta - 5
					Digite 0 para sair - 0
					""");
			opcao = sc.nextInt();

			switch (opcao) {
				case 1:
                    System.out.println(contaCorrente.getSaldoDaConta());
					break;
                case 2:
					System.out.println("Quanto você deseja sacar?");
					valor = sc.nextDouble();
                    System.out.println(contaCorrente.sacar(valor));
					break;
				case 3:
					System.out.println("Quanto você deseja depositar?");
					valor = sc.nextDouble();
                    System.out.println(contaCorrente.depositar(valor));
                    break;
				case 4:
                    System.out.println("Digite o número da conta que você deseja transferir:");
                    numeroDaConta = sc.nextInt();

                    System.out.println("Quanto você deseja transferir?");
                    valor = sc.nextDouble();

                    System.out.println(contaCorrente.transferir(valor, numeroDaConta));
                    break;
                case 5:
                    System.out.println(contaCorrente.cancelarConta());
                    break;
                case 0:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Por favor, digite um número válido");
                    break;
			}
		} while (opcao != 0 || opcao != 5);

		sc.close();
	}
}
