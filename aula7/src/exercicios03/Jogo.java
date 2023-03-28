package exercicios03;

import java.time.LocalDate;

public class Jogo extends Produto{

	private int categoria;

	public Jogo(int id, String nome, int versao, String produtora, LocalDate dataLancamento, float preco,
			int categoria) {
		super(id, nome, versao, produtora, dataLancamento, preco);
		this.categoria = categoria;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("Console:" + this.categoria);
}
	
	
}
