class Fluxo {
	public static void main (String[] args) {
	boolean condicao = (32 > 45 & 10 > 30 | 8==8);
	int limite = 1;

	/*	if(condicao) {
			System.out.println("É maior");	
		}else {
	 		System.out.println("É menor");
		}
	
		while (limite <= 10) {
			System.out.println("Rodando " + limite );
			limite++;			
		}

		for (int i = 0; i < 10; i++){
			System.out.println("Rodando " + i);		
		}
		

		System.out.println(i); 
		} } 

		for (int i=0; i<10; i++){
			for (int j=0; j<19; j++){
				System.out.println("["+i+","+j+"]");
			}
		}*/

		for (int i=0; i <= 100; i++){


			if(i % 2==1) continue;

			System.out.println(i);

			if(i >= 50) break;
		}	
}
}

