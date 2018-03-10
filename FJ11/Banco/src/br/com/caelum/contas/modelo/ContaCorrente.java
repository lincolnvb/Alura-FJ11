package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel{
	
	@Override
	public boolean saca(double valor){
		if(valor < 0){
			throw new IllegalArgumentException("Voce nao pode sacar um valor negatiavo!");
		}
		if(saldo < valor){
			throw new SaldoInsuficienteException(valor);
		}
		this.saldo -= (valor + 0.10);
		return true;
	}
	
	public String getTipo(){
		return "Conta Corrente"; 
	}

	@Override
	public double getValorImposto() {
		return getSaldo() * 0.01;
	}
}
   