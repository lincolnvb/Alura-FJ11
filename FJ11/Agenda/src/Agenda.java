
public class Agenda {

	public static void main(String[] args) {

		System.out.println("Agenda de contatos");

		Contato contato = new Contato();

		contato.setNome("Lincoln");
		contato.setTelefone("1234-5233");

		System.out.println(contato.imprimeTudao());

	}

}
