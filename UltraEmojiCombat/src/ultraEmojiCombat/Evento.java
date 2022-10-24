package ultraEmojiCombat;

import java.util.Random;
public class Evento {
	
	private Lutador desafiante;
	private Lutador desafiado;
	private int rounds;
	private boolean aprovado;
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.aprovado = true;
			this.desafiado = l1;
			this.desafiante = l2 ;
		} else {
			this.aprovado =false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar() {
		if(this.getAprovado()) {
			System.out.println("---------------------------");
			System.out.println("###### DESAFIADO ######");
			this.getDesafiado().apresentar();
			System.out.println("###### DESAFIANTE #####");
			this.getDesafiante().apresentar();
			Random ale = new Random();
			int vencedor = ale.nextInt(3);
			switch(vencedor) {
			case 0:
				System.out.println("EMPATOU");
				this.getDesafiado().empatar();
				this.getDesafiante().empatar();
			break;
			case 1:
				System.out.println("Vitoria de : " + this.getDesafiado().getNome());
				this.getDesafiado().ganhar();
				this.getDesafiante().perder();
			break;
			case 2:
				System.out.println("Vitora de : " + this.getDesafiante().getNome());
				this.getDesafiado().perder();
				this.getDesafiante().ganhar();
			break;
			default:;
			}
		} else {
			System.out.println("Não teremos evento hoje");
		}
	}
	
	public Lutador getDesafiado() {
		return this.desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	
	public Lutador getDesafiante() {
		return this.desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds(){
		return this.rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	
	public boolean getAprovado() {
		return this.aprovado;
	}
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
}