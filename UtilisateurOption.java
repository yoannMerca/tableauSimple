package tabSimple;

import java.util.ArrayList;
import java.util.Scanner;

public class UtilisateurOption {

	public static void main(String[] args) {
		/*
		 * Faire un programme avec le menu suivant :
			1. Ajouter un nombre
			2. Afficher les nombres existants.
			Description :
			Demander à l’utilisateur de choisir une option dans le menu.
			Si l’utilisateur sélectionne l’option 1, le programme demande un nombre à l’utilisateur puis
			l’ajoute à un tableau.
			Si l’utilisateur sélectionne l’option 2, le programme affiche le contenu du tableau.
			Si le tableau est plein, écrire un algorithme pour agrandir le tableau.
		 */
		ArrayList<Integer> tab = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int option = -1;
		int valeur ;
		
		boolean fin = false;
		
		while(!fin) {
			System.out.println("choisir option 1 (ajouter un nbr) option 2 (affiche le tab) option 3 (fin du programme)");
			option  = sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("Entrez le valeur à ajouter");
				valeur = sc.nextInt();
				tab.add(valeur);
			break;
			case 2:
				if(!tab.isEmpty()) {
					for(int i=0;i<tab.size();i++) {
						System.out.print("["+tab.get(i)+"]");
					}
					System.out.println("");
				}else {
					System.out.println("tableau vide");
				}		
			break;
			case 3:
			default:
					fin = true;
			break;
			}
		}
		
			
		sc.close();
		
		
	}

}
