package entities;

public class conta {
	
	private String nome;
	private Double saldo;
	
	public conta() {
		
	}
	
	public conta(String nome, Double saldo) {

		this.nome = nome;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void deposito(String nome) {
		setNome(this.nome);
		setSaldo(0.0);
	}
	
	public void deposito(Double valor) {
		setSaldo(this.saldo + valor);
	}
	public void saque(Double valor) {
		setSaldo(this.saldo - valor - 5.00);
	}

	
}
