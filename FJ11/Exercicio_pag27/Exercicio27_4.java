class Exercicio27_4 {
	public static void main (String[] args){
		long fatorial = 1;
		for(int n=1; n <= 20; n++){
			fatorial *= n;	
			System.out.println ("O fatorial de: " + n + " é igual a: " + fatorial);			
		}
	}
}
