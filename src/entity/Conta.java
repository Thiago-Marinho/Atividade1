package entity;

public abstract class Conta {

	private Double Saldo;
	private String nome;
	private Integer conta; 
	
	public Conta() {}

	public Conta(Double saldo, String nome, Integer conta) {		
		this.Saldo=saldo;
		
		this.nome = nome;
		this.conta = conta;
	}

	public Double getSaldo() {
		return Saldo;
	}

	public void setSaldo(Double saldo) {
		Saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}
	
	public void deposito(Double d) {
		setSaldo(d);
	}
	

	public void saque(Double s) {
		
		
	}
	
	
	
	
}
