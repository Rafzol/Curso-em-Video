package organizacao;



public class Organizacao{
	public static void main(String[] args) {
		
		Evento e[] = new Evento[10];
		IngressoPista p[] = new IngressoPista[10];
		IngressoVip v[] = new IngressoVip[10];
		IngressoCamarote c[] = new IngressoCamarote[10];
		
		
		e[0] = new Evento("Lollapaluza", 22, 15, 500);
		v[0] = new IngressoVip("Rafael", "0221002021", 22);
		
		System.out.println(e[0].toString());
	
		System.out.println(v[0].toString());
		
	}
}