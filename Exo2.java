package tabSimple;

import java.util.Scanner;

public class Exo2 {

	public static void main(String[] args) {
		
	// fait sisir la taille du tableau a l utilisateur
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir la table du tableau");
		int taille = sc.nextInt();			
		int[]tab = new int[taille];
		int moyenneTotale =0;
		int sommeTotale = 0;
			
		//fait saisir des notes a l utilisateur et en fait la somme
			for (int i = 0; i < tab.length; i++) {
				System.out.println("veuillez saisir une note");
				
				tab[i] = sc.nextInt();
				
				sommeTotale += tab[i];
			}
			//calcul de la moyenne des notes contenu dans le tableau
			 moyenneTotale = sommeTotale/tab.length;
			 
			 //affichage des somme et moyenne
			 System.out.println("la moyenne est de " + moyenneTotale);
			 System.out.println("la somme est de " + sommeTotale);
			 sc.close();
			 
		}
	

}
