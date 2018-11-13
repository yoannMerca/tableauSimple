package array;

import java.util.Scanner;

public class Exo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir la taille du tab");
		int taille = sc.nextInt();
		int[] tab = new int[taille];
		int[] tab2 = new int[taille];
		
		//boucle pour remplir le tab
		
		for (int i=0; i<tab.length;i++) {
			System.out.println("Saisir une valeur");
			tab[i]= sc.nextInt();
			tab2[(taille-1) - i] =  tab[i];
			
		}
		// pour afficher les valeurs des deux tableaux
		for (int i=0; i<tab.length;i++) {
			System.out.println(tab[i]+" | " +tab2[i]);
				
		}
		sc.close();

	}

}
