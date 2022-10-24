package ultraEmojiCombat1;
 public class Luta{
	 public static void main(String[] args) {
		 Lutador l[] = new Lutador[10];
		 l[0] = new Lutador("Pretty Boy", "Brasil", 22, 1.83f, 90.2f, 0, 0, 0, 0);
		 l[1] = new Lutador("Apaixonado", "Estados Unidos", 26, 1.79f, 94.5f, 0, 0, 0, 0);
		 l[2] = new Lutador("Desconfiado", "França", 23, 1.65f, 60.6f, 0, 0, 0, 0);
		 l[3] = new Lutador("Zangado", "Inglaterra", 24, 1.69f, 62.5f, 0, 0, 0 ,0);
		 l[4] = new Lutador("Irritado", "Portugal", 26, 1.64f, 55.4f, 0, 0, 0, 0);
		 l[5] = new Lutador("Pensador", "Espanha", 23, 1.63f, 54.2f, 0, 0, 0, 0);
		 l[6] = new Lutador("Relax", "India", 27, 1.75f, 75.4f, 0, 0, 0 , 0);
		 l[7] = new Lutador("Nerd", "Tailandia", 22, 1.69f, 74.6f, 0, 0, 0, 0);
		 l[8] = new Lutador("Nojento", "China", 29, 1.81f, 84.5F, 0, 0, 0, 0);
		 l[9] = new Lutador("Nervoso", "Japão", 28, 1.83f, 85.9f, 0, 0, 0, 0);
		 
		 
		 Evento UEC01 = new Evento();
		 UEC01.marcarLuta(l[0], l[1]);
		 UEC01.lutar();
		 
		 Evento UEC02 = new Evento();
		 UEC02.marcarLuta(l[2], l[3]);
		 UEC02.lutar();
		 
		 Evento UEC03 = new Evento();
		 UEC03.marcarLuta(l[4], l[5]);
		 UEC03.lutar();
		 
		 Evento UEC04 = new Evento();
		 UEC04.marcarLuta(l[6], l[7]);
		 UEC04.lutar();
		 
		 Evento UEC05 = new Evento();
		 UEC05.marcarLuta(l[8], l[9]);
		 UEC05.lutar();
		 
		 for(int i =0; i <l.length; i++) {
			 l[i].status();
		 }
		 
	 }
 }