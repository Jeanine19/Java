package cliente.model;

public class ClienteTesta {

	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	private int id;

	public ClienteTesta(String nome, String endereco, String telefone, String email, int id) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.id = id;
    }

	


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public void visualizar() {

		System.out.println("**");
		System.out.println("                 DADOS DO CLIENTE                ");
		System.out.println("**");
		System.out.println("Nome do cliente: " + this.nome);
		System.out.println("Endereço do cliente:: " + this.endereco);
		System.out.println("Telefone do cliente: " + this.telefone);
		System.out.println("Email do cliente: " + this.email);
		System.out.println("ID: " + this.id);

	}
}
