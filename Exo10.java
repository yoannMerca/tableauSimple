package array;



import java.util.Scanner;
import java.util.stream.IntStream;

public class Exo10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir la taille du tab");
		int taille = sc.nextInt();
		int[] tab = new int[taille];
		int noteSupMoy = 0;
		double moyenne = 0;
		
		
		//boucle pour remplir le tab et faire la somme des notes
		
		for (int i=0; i<tab.length;i++) {
			System.out.println("Saisir une valeur");
			tab[i]= sc.nextInt();
			moyenne += tab[i];
		}
		
		//calcul de la moyenne 
		moyenne= moyenne/taille;
		
		for (int i=0; i<tab.length;i++) {
			
			if(tab[i]> moyenne) {
				noteSupMoy++;
			}
		}
		//affiche tableau
		System.out.println("le nombre de notes sup à la moyenne = "+ noteSupMoy +" (la moyenne vaut = "+moyenne+")");
		sc.close();
	}
	
}
