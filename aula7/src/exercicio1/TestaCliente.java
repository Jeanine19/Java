package exercicio1;


public class TestaCliente {

	public static void main(String[] args) {

		 
			Cliente cliente1 = new Cliente(1, "Maria Alice", "maria.a@mail.com", "1111-1111", "Rua mar, 123");
			cliente1.visualizar();
			
	        Cliente cliente2 = new Cliente(2, "Aparecida", "ciclano@mail.com", "2222-2222", "Rua cachoeira, 456");
	        cliente2.visualizar();
	        
	        PessoaFisica pf1 = new PessoaFisica(3, "Joao", "joao@mail.com", "3333-3333", "Rua lago, 789", "123.456.789-10");
	        
	         pf1.visualizar();
	    
	      
	         
	     }

}

