package br.com.caelum.contas.modelo;

/**
 * 
 * @author Lincoln Viana
 *
 *
 */

public abstract class Conta {

	private String titular;
	private int numero;
	private String agencia;
	protected double saldo;
	private String dataAbertura;
	private double limite;

	public abstract String getTipo();

	public String getTitular (){
		return titular;
	}

	public void setTitular(String titular){
		this.titular = titular;
	}


	public int getNumero(){
		return numero;
	}

	public void setNumero (int numero){
		this.numero = numero;
	}	

	public String getAgencia(){
		return agencia;
	}	

	public void setAgencia(String agencia){
		this.agencia = agencia;
	}

	public double getSaldo(){
		return saldo;
	}

	public String getDataAbertura(){
		return dataAbertura;	
	} 

	public void setDataAbertura(String dataAbertura){
		this.dataAbertura = dataAbertura;
	}

	public double getLimite(){
		return limite;
	}		

	public void setLimite(double limite){
		this.limite = limite;
	}

	public Conta(){
		limite = 1000;
	}

	public Conta(String titular){
		this.titular = titular;
	}


	String recuperaDadosImpressao () {	
		System.out.println("===========================");		
		String dados = "Titular: " + this.titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nRendimento mensal: " + this.calculaRendimento();
		System.out.println(dados);
		System.out.println("===========================");		
		return dados;
	}

	/**
	 * 
	 * @param valor Valor a ser sacado da conta
	 * @return True se sacou
	 */
	public boolean saca(double valor) {
		if(valor > 0 && saldo + limite >= valor){
			saldo -= valor;
			return true;
		}
		return false;	
	}

	public void deposita (double valor) {
		if(valor < 0){
			throw new IllegalArgumentException("Voce tentou inserir um valor negativo!");
		}else{
			this.saldo += valor;
		}
	}

	public void transfere (Conta destino, double valor){
		if (saca(valor)) {
			destino.deposita(valor);
		}

	}

	double calculaRendimento(){
		return saldo * 0.1;
	}

	public void transfere(double valor, Conta conta){
		this.saca(valor);
		conta.deposita(valor);

	}


}	





