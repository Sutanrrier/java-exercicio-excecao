package br.com.sutanrrier.main;

import java.util.Locale;
import java.util.Scanner;

import br.com.sutanrrier.model.Conta;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite abaixo as informações para registro da conta!");
		System.out.print("Digite o número da conta: ");
		Integer acc_number = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o nome do titular da conta: ");
		String acc_titular = sc.nextLine();
		System.out.print("Digite um valor de deposito inicial: ");
		Double acc_saldo = sc.nextDouble();
		System.out.print("Digite o limite de saque para conta: ");
		Double acc_limiteSaque = sc.nextDouble();
		
		Conta conta = new Conta(acc_number, acc_titular, acc_saldo, acc_limiteSaque);
		
		try {
			System.out.print("\nInfome agora uma valor para saque: ");
			Double valor_saque = sc.nextDouble();
			conta.sacar(valor_saque);
			
			System.out.println(conta);
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("\nFim do Programa!");
		}
		
		sc.close();
	}
	
}