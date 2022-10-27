package organizacao;
public class Pessoa{
	protected String nome;
	protected String cpf;
	protected int idade;
	
	public Pessoa(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String toString() {
		return "Pessoa : " + this.getNome() + "| Cpf : " + this.getCpf() + "| Idade  : " 
	+ this.getIdade() + ".";
	}
}