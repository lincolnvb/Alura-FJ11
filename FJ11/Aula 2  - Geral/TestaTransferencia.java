class TestaTransferencia {
	public static void main (String[] args){
		
		Conta origem = new Conta();
		origem.deposita(10000);
		origem.numero = 70;
		origem.titular = "JackieChan";
				
		Conta destino = new Conta();
		destino.deposita (30000);
		destino.titular = "JetLee";
		destino.numero = 100;

		origem.mostra();
		destino.mostra();
		origem.transfere(destino, 500);
		origem.mostra();
		destino.mostra();		
	 	
	}
}
