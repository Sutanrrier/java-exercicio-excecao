package br.com.sutanrrier.model;

public class Conta {
	private Integer acc_number;
	private String acc_titular;
	private Double acc_saldo;
	private Double acc_limiteSaque;

	public Conta(Integer acc_number, String acc_titular, Double acc_saldo, Double acc_limiteSaque) {
		this.acc_number = acc_number;
		this.acc_titular = acc_titular;
		this.acc_saldo = acc_saldo;
		this.acc_limiteSaque = acc_limiteSaque;
	}

	public void depositar(Double valor) {
		acc_saldo += valor;
	}

	public void sacar(Double valor) {
		if(valor > acc_limiteSaque) {
			throw new IllegalArgumentException("Valor informado excede o limite de saque!");
		} 
		else if(valor > acc_saldo) {
			throw new IllegalArgumentException("Saldo insuficiente para saque!");
		}
		else {
			acc_saldo -= valor;
		}

	}

	public String toString() {
		return "\nNúmero da Conta: " + acc_number
				+ "\nNome do titular: " + acc_titular
				+ "\nNovo saldo na conta: " + acc_saldo
				+ "\nSeu limite de saque: " + acc_limiteSaque;
	}
}
