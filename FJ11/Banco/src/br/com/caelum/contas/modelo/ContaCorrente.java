package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta {
	
	@Override
	public boolean saca(double valor){
		this.saldo -= (valor + 0.10);
		return true;
	}
	
	public String getTipo(){
		return "Conta Corrente"; 
	}
}
   