package ultraEmojiCombat;

public class Lutador{
	private String nome;
	private String nascionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	private int desistencias;
	
	public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em, int des) {
		this.nome = no;
		this.nascionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
		this.desistencias = des;
	};
	
	
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNascionalidade() {
		return this.nascionalidade;
	}
	public void setNascionalidade(String nascionalidade) {
		this.nascionalidade = nascionalidade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public float getAltura() {
		return this.altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getPeso() {
		return this.peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	
	public String getCategoria() {
		return this.categoria;
	}
	public void setCategoria() {
		if(this.peso < 50.2 ) {
			this.categoria = "Peso Invalido";
		} else if (this.peso <= 56.2) {
			this.categoria = "Peso Pena";
		} else if (this.peso <= 66.2) {
			this.categoria = "Peso Galo";
		} else if (this.peso <= 76.2) {
			this.categoria = "Peso Médio";
		} else if (this.peso <= 86.2) {
			this.categoria = "Meio Pesado";
		} else if (this.peso <= 96.2) {
			this.categoria = "Peso Pesado";
		} else {
			this.categoria = "Peso Invalido";
		}
	}
	
	public int getVitorias() {
		return this.vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	
	public int getDerrotas() {
		return this.derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	
	public int getEmpates() {
		return this.empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	public int getDesistencias() {
		return this.desistencias;
	}
	public void setDesistencias(int desistencias) {
		this.desistencias = desistencias;
	}

	public void ganhar() {
		this.setVitorias(getVitorias() + 1);
	}
	
	public void perder() {
		this.setDerrotas(getDerrotas() + 1);
	}
	
	public void empatar() {
		this.setEmpates(getEmpates() + 1);
	}
	
	public void desistir() {
		this.setDesistencias(getDesistencias() + 1);
		this.setDerrotas(getDerrotas() + 1);
	}

    public void apresentar() {
    	System.out.println("-------------------------------------------------------");
	   System.out.println("CHEGOU A HORA!!, Apresentamos o Lutador : " + getNome());
	   System.out.println("Com o total de " + getVitorias() + " Vitórias.");
	   System.out.println("E " + getDerrotas() + " Derrotas");
	   System.out.println("Vindo de " + getNascionalidade() + "\n");
   }

    public void status() {
    	System.out.println("--------------------------------------------------");
    	System.out.println("Lutador : " + getNome() + " Com " + getIdade() + " Anos.");
    	System.out.println("Nascionalidade " + getNascionalidade() + ".");
    	System.out.println("Peso : " + getPeso() + " | Altura :" +getAltura() + " .");
    	System.out.println("Categoria : " + getCategoria());
    	System.out.println("Vitorias : " + getVitorias() + " | Derrotas : " + getDerrotas() + ".");
    	System.out.println("Empates : " + getEmpates() + " | Desistências : " + getDesistencias() + ".\n");
    }



}