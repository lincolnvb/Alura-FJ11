class Conta{
	
	int numero;
	String titular;
	double saldo;
	double limite;

	void saca(double valor) {
	saldo = saldo - valor;
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
	

}
