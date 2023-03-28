package exercicio1;

public class PessoaJuridica extends Cliente {

	 private String cnpj;

	    public PessoaJuridica(int id, String nome, String email, String telefone, String endereco, String cnpj) {
	        super(id, nome, email, telefone, endereco);
	        this.cnpj = cnpj;
	   
	    }




		public String getCnpj() {
	        return cnpj;
	    }

	    public void setCnpj(String cnpj) {
	        this.cnpj = cnpj;
	    }

	  
	    public void visualizar() {
	        
	        System.out.println("CNPJ: " + cnpj);
	    }
}
