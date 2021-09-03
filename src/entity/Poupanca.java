package entity;

public class Poupanca extends Conta{


	public Poupanca(Double saldo, String nome, Integer conta) {
		super(saldo, nome, conta);
	
	}

	@Override
	public void saque(Double s) {
						
		 super.deposito(super.getSaldo()-s);
	}
	
	
}
