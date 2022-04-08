
public class Livro {
	private String titulo;
	private String autor;
	private String categoria;
	private int anoPublicacao;
	private int posicaoEstante;
	private int posicaoPrateleira;
	private boolean disponivel;
	
	// métodos exibir, emprestar e devolver
	public String exibirInfo() {
		String mensagem;
		mensagem = "Livro: "+titulo+"\n" 
					+"Autor: "+autor+"\n"
					+"Ano de Publicação: "+anoPublicacao+"\n"
					+"Categoria: "+categoria+"\n"
					+"Estante: "+posicaoEstante+"\n"
					+"Prateleira: "+posicaoPrateleira+"\n"
					+"Situação: " + ((disponivel)?"EMPRESTADO":"DISPONIVEL")+"\n"
					+"------------------------------"; // usando ternario
		return mensagem;
	}
	public void emprestar() {
		disponivel = false;
	}
	public void devolver() {
		disponivel = true;
	}
	
	// getters e setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public int getPosicaoEstante() {
		return posicaoEstante;
	}
	public void setPosicaoEstante(int posicaoEstante) {
		this.posicaoEstante = posicaoEstante;
	}
	public int getPosicaoPrateleira() {
		return posicaoPrateleira;
	}
	public void setPosicaoPrateleira(int posicaoPrateleira) {
		this.posicaoPrateleira = posicaoPrateleira;
	}
	
	// devido ao uso do boolean
	public boolean isDisponivel() {
		return disponivel;
	}
}
