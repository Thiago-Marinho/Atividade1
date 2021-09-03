package entity;

public class Corrente extends Conta {

	
	public Corrente() {	
		super();
	}
	
	public Corrente(Double saldo, String nome, Integer conta) {
		super(saldo, nome, conta);
		
	}

	@Override
	public void saque(Double s) {
				
		
		super.deposito(super.getSaldo()-s-5);		
		
	}

	

}
