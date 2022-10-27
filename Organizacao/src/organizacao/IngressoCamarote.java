package organizacao;
public class IngressoCamarote extends Ingresso{
	
	public IngressoCamarote(String nome, String cpf, int idade) {
		super(nome, cpf, idade);
		
	}

	@Override
	public void valorIngresso() {
		this.setValor(getValor() * 0.6f);
		this.setTipo("Ingresso Camarote");
	}

	public void imprimirValor() {
		System.out.println("Ingresso " + this.getTipo() + " Valor " + this.getValor());
	}
}