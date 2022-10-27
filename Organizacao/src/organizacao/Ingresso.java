package organizacao;
public class Ingresso extends Pessoa{
	private float valor;
	private int qtdVendidos;
	private Evento eventoRelacionado;
	private String tipo;
	
	public void mostrarResumo() {
		System.out.println("Cliente " + this.getNome());
		System.out.println("CPF " +	this.getCpf());
		System.out.println("Evento " + this.eventoRelacionado.toString());
	};
	
	
	public void valorIngresso() {
		this.setValor(getValor() + 15.50f);
	}
	

	
	public int getQtdVendidos() {
		return this.qtdVendidos;
	}
	public void setQtdVendidos(int qtdVendidos) {
		this.qtdVendidos = qtdVendidos;
	}
	
	public float getValor() {
		return this.valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public Evento getEventoRelacionado() {
		return this.eventoRelacionado;
	}
	public void setEventoRelacionado(Evento eventoRelacionado) {
		this.eventoRelacionado = eventoRelacionado;
	}

	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	};
	
	public Ingresso(String nome, String cpf, int idade) {
		super(nome, cpf, idade);
	}

	public String toString() {
		return " Cliente " + this.getNome() + "\n Valor " + this.getValor()
				+ "\n Quantidade de Ingresos Vendidos " + this.getQtdVendidos();
	}

}