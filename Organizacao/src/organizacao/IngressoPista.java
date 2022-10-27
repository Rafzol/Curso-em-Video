package organizacao;
public class IngressoPista extends Ingresso{
	
	public IngressoPista(String nome, String cpf, int idade) {
		super(nome, cpf, idade);
	}

	@Override
	public void valorIngresso() {
		this.setValor(15.50f);
		this.setTipo("Ingresso Pista");
	}

	public void imprimirValor() {
		System.out.println("Ingresso " + this.getTipo() + " Valor " + this.getValor());
	}
	
	@Override
	public String toString() {
		return "Cliente " + this.getNome() + "\n Valor " + this.getValor() 
				+ "\n Quantidade de Ingresos Vendidos " + this.getQtdVendidos();
	}
}