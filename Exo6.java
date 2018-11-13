package tabSimple;

public class Exo6 {

	public static void main(String[] args) {
		
		/*Que produit l’algorithme suivant ?
		Tableau nombre(7) en Entier
		Variables i, k en Entier
		Début
		nombre[0] ← 1
		Pour k ← 1 à 5 Pas de 1
		nombre[k] ← nombre[k-1] + 2
		FinPour
		Pour i ← 0 à 6 Pas de 1
		Ecrire nombre[i]
		FinPour
		Fin*/
		
		int[] tab = new int[7];
		tab[0] =0;
		
		for(int k =1;k<5;k++) {
			tab[k] = tab[k-1] +2;
		}
		for(int i =0;i<tab.length;i++) {
			System.out.print(tab[i]+"|"); 
		}

	}

}
