package array;

import java.util.Scanner;

public class Exo2 {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir la table du tableau");
		int taille = sc.nextInt();			
		int[]tab = new int[taille];
		int moyenneTotale =0;
		int sommeTotale = 0;
			
			
			for (int i = 0; i < tab.length; i++) {
				System.out.println("veuillez saisir une note");
				
				tab[i] = sc.nextInt();
				
				sommeTotale += tab[i];
			}
			 moyenneTotale = sommeTotale/tab.length;
			 System.out.println("la moyenne est de " + moyenneTotale);
			 System.out.println("la somme est de " + sommeTotale);
			 sc.close();
			 
		}
	

}
