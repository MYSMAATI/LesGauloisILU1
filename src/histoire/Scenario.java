package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Druide panoramix = new Druide("Panoramix", 5, 10);
		Romain minus = new Romain ("Minus", 6);
		Gaulois asterix = new Gaulois ("Asterix", 8, 1);
		Gaulois obelix = new Gaulois("Ob�lix", 9, 9);
		panoramix.parler("Bonjour, je suis le druide Panoramix et ma potion peut aller d'une force 5 � 10");
		obelix.parler("Par B�l�nos, ce n'est pas juste !");
		asterix.parler("Bonjour � tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}

}
;
