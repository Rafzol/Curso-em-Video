package atividade1;
public class Livro implements  Publicação{
	private String titulo;
	private String autor;
	private int totPages;
	private int pageAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public String detalhes() {
		return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", total de paginas=" + totPages + ", aberto=" + aberto + 
				", leitor " + leitor.getNome() + "}";
	}
	
	public Livro(String titulo, String autor, int totPages, int pageAtual, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPages = totPages;
		this.leitor = leitor;
		this.aberto = false;
		this.pageAtual = 0;
	}

	@Override
	public void abrir() {
		this.aberto = true;
	}

	@Override
	public void fechar() {
		this.aberto = false;
	}

	@Override
	public void folhear(int p) {
		this.pageAtual = p;
	}

	@Override
	public void avancarPage() {
		this.pageAtual++;
	}

	@Override
	public void voltarPage() {
		this.pageAtual--;
	}
}