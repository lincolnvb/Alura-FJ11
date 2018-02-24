class Conta{
	
	int numero;
	String titular;
	double saldo;
	double limite;

	boolean saca(double valor) {
		if(valor > 0 && saldo + limite >= valor){
			saldo -= valor;
			return true;
		}
		return false;	
	}
	
	void mostra () {
	System.out.println("///////////////////////////////////");
	System.out.println("Titular: " + titular);
	System.out.println("Saldo: " + saldo);
	System.out.println("///////////////////////////////////");
	}

	void deposita (double valor) {
			saldo += valor;
		}
	
	void transfere (Conta destino, double valor){
		if (saca(valor)) {
			destino.deposita(valor);
		}

	}

}	



	

