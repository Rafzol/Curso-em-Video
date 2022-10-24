package atividade1;

public class Biblioteca{
	public static void main(String[] args){
	
		Pessoa[] p = new Pessoa[3];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Rafael", 22, "Ma");
		p[1] = new Pessoa("Victória", 25, "Fe");
		p[2] = new Pessoa("Andressa", 30, "Fe");
		
		l[0] = new Livro("Algoritimos", "Unicesumar", 300, 0, p[0]);
		l[1] = new Livro("Programação 1", "Uninter", 400, 0, p[1]);
		l[2] = new Livro("Governaça de Ti", "Fagep", 500, 0, p[2]);
		
		System.out.println(l[0].detalhes());
		System.out.println(l[1].detalhes());
		System.out.println(l[2].detalhes());
	}
}