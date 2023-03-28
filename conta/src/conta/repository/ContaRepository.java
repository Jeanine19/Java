package conta.repository;

public interface ContaRepository {

	// crud de conta
	public void procurarPorNumero(int numero);
	public void listarTodas();
	public void cadastrar();
	public void atualizar();
	public void deletar();
	
	// metodos bancarios
	public void sacar(int numero, float valor);
	public void depositar (int numero, float valor);
	public void transferir(int numeroOrigem, int numerDestino, float valor );
}
