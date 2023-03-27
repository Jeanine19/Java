package aula7;


import cliente.model.ClienteTesta;
public class Cliente {

	public Cliente(String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ClienteTesta c1 = new ClienteTesta("João Vitor", "Rua do Ferro", "(11)9.1111-2222", "joaoitagv@gmail.com", "000.111.222-33");
        Cliente c2 = new Cliente("Sabrina", "Rua do Niquel", "(11)9.3333-4444", "sabrinasas@gmail.com", "444.555.666-77");

        c1.visualizar();
        c2.visualizar();
	}

	private void visualizar() {
		// TODO Auto-generated method stub
		
	}

}
