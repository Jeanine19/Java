package exercicio1;

public class PessoaFisica extends Cliente{
	
	private String cpf;
	
	public PessoaFisica(int id, String nome, String email, String telefone, String endereco, String cpf) {
        super(id, nome, email, telefone, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
    	
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public void visualizar() {
        
        System.out.println("CPF: " + cpf);
    }
}
