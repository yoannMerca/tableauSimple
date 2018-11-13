package array;

public class Exo5 {

	public static void main(String[] args) {
		/* Tableau nombre(10) en Entier
		Variable i en Entier
		Début
		Pour i ← 0 à 9 Pas de 1
		nombre[i] ← i * i
		FinPour
		Pour i ← 0 à 9 Pas de 1
		Ecrire nombre[i]
		FinPour
		Fin*/
		
		int[] tab = new int[10];
		
		
		//version non simplifié
		for(int i =0; i<tab.length;i++) {
			tab[i] = i*i;
		}
		for(int i =0; i<tab.length;i++) {
			System.out.print(tab[i]+"|");;
		}
		
		System.out.println("");
		
		//version plus simple
		for(int i =0; i<tab.length;i++) {
			tab[i] = i*i;
			System.out.print(tab[i]+"|");;
		}
		
		
		
	}

}
