package desafio.dio;

public abstract class Conteudo {

	public static final double XP_PADRAO= 10.0;
	protected String titulo;
	protected String descricao;
	
	public abstract double calcularxp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
