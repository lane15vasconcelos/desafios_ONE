package aplicacao_simples;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome, conta;
		double valor, saldoAtual, saldoInicial = 2500.00;
		
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.println("Digite o tipo de conta: ");
		conta = sc.nextLine();
		

		String mensagem = String.format("------------------------------\n"
				+ "Dados iniciais do cliente: \n"
				+ "Nome: %s\n"
				+ "Tipo de conta: %s\n"
				+ "Saldo inicial: %.2f\n"
				+ "------------------------------\n", nome, conta, saldoInicial);
		
		System.out.println(mensagem);
		
		
		saldoAtual = saldoInicial;
		int opcao;
		
		do {
			System.out.println("\n------------------------------\n" 
					+ "\nOperações:\n"
					+ "1- Consultar saldo\n"
					+ "2- Receber valor\n"
					+ "3- Transferir valor\n"
					+ "4- Sair\n"
					+ "Digite a opção desejada: ");
					
			opcao = sc.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.print(String.format("\nSaldo Atual: %.2f\n", saldoAtual));		
			break;
			
			case 2:
				System.out.print("\nDigite o valor do depósito: ");
				valor = sc.nextDouble();
				
				if(valor <= 0) {
					System.out.println("\nValor inválido para depósito.");
				}else {
					saldoAtual += valor;
				}
				
				System.out.println(String.format("\nSaldo Atualizado: %.2f\n", saldoAtual));
				
			break;
			
			case 3:
				System.out.println("\nDigite o valor da transferência: ");
				valor = sc.nextDouble();
				sc.nextLine();
				if(valor <= 0 || valor > saldoAtual) {
					System.out.println("\nSaldo insuficiente para transferência.");
				}else {
					saldoAtual -= valor;	
				}
				
				
				System.out.println(String.format("\nSaldo Atualizado: %.2f\n", saldoAtual));	
			break;
			
			case 4:
				System.out.println("\nOperação finalizada.");
			break;
			
			default:
				System.out.println("\nOpção inválida.");
			}
			
				
		}while(opcao != 4);
		
		
		
 sc.close();
	}

}
