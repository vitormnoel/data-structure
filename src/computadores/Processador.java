package computadores;

public class Processador {
	
	private String descricao;
	
	@Override
	public String toString() {
		return descricao;
	}

	public Processador(String d) {
		this.descricao = d;
	}
	
	public void setDescricao(String d) {
		this.descricao = d;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
}
