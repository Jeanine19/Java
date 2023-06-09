package exercicios03;

import java.time.LocalDate;

public class Console extends Produto {

	
	private int tipo;

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Console(int id, String nome, int versao, String produtora, LocalDate dataLancamento, float preco, int tipo) {
		super(id, nome, versao, produtora, dataLancamento, preco);
		this.tipo = tipo;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("Console:" + this.tipo);
}
	
}
