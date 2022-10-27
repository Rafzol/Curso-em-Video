package organizacao;
public class IngressoVip extends Ingresso{
	
	public IngressoVip(String nome, String cpf, int idade) {
		super(nome, cpf, idade);
		
	}

	@Override
	public void valorIngresso() {
		this.setValor(getValor() * 0.3f);
		this.setTipo("Ingresso Vip");
	}
	
	public void imprimirValor() {
		System.out.println("Ingresso " + this.getTipo() + " Valor " + this.getValor());
	}
}