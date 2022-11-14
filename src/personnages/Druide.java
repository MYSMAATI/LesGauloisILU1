package personnages;

import java.util.Random;

public class Druide {
	private String nom; 
	private int effetPotionMin; 
	private int effetPotionMax; 
	private int effetPotion;
	public Druide(String nom, int effetPotionMin, int effetPotionMax) { 
		this.nom = nom; 
		this.effetPotionMin = effetPotionMin; 
		this.effetPotionMax = effetPotionMax; 
		this.effetPotion = 1;
		parler("Bonjour,  je  suis  le  druide  "  +  nom  +  "  et  ma  potion  peut  aller une force "
				+ effetPotionMin + " à " 
				+ effetPotionMax + "."); 
	} 
	
	public String getNom() { 
		return nom; 
	} 
	
	public void parler(String texte) { 
		System.out.println(prendreParole() + "« " + texte + "»"); 
	} 
	
	private String prendreParole() { 
		return "Le druide " + nom + " : "; 
	} 
	
	public void preparerPotion() {
		Random valeur = new Random();
		int resultat = valeur.nextInt(10);
		if (resultat > 7){
			Panoramix.parler("J'ai  préparé une super potion de force ");
		}else{
			Panoramix.parler("Je  n'ai  pas  trouvé  tous  les  ingrédients,  ma  potion  est seulement de force");
		}
	}
	
	public static void main(String[] args) {
		Druide Panoramix = new Druide("Panoramix", 5, 10);
		effetPotion = preparerPotion();
		
	}
} 