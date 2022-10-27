package organizacao;
public class Evento{
	private String nome;
	private int hora, min;
	private int qtdVendidos;
	private int capacidade;
	
	public Evento(String nome, int hora, int min, int capacidade) {
		this.nome = nome;
		this.hora = hora;
		this.min = min;
		this.capacidade = capacidade;
	}
	
	public void venderIngresso(){
		if(this.qtdVendidos < this.capacidade) {
			this.setQtdVendidos(getQtdVendidos() + 1);
		} else {
			System.out.println("Produto indisponivel");
		}
	}
	
	public void ingressosVendidos(){
		this.getQtdVendidos();
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getHora() {
		return this.hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public int getMin() {
		return this.min;
	}
	public void setMin(int min) {
		this.min = min;
	}

	public int getQtdVendidos() {
		return this.qtdVendidos;
	}
	public void setQtdVendidos(int qtdVendidos) {
		this.qtdVendidos = qtdVendidos;
	}

	public int getCapacidade() {
		return this.capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String toString() {
		return " Evento : " + this.getNome() + ".\n Hora : " + this.getHora() + ":" + this.getMin() 
				+ ".\n Ingressos Vendidos : " + this.getQtdVendidos() 
				+ ".\n Capacidade maxima : " + this.getCapacidade() + " Pessoas.";
	}
}