package tabSimple;

public class Exo7 {

	public static void main(String[] args) {
		/*Tableau Suite(7) en Entier
		Variable i en Entier
		Début
		suite[0] ← 1
		suite[1] ← 1
		Pour i ← 2 à 6 avec Pas de 1
		suite[i] ← Suite[i-1] + Suite[i-2]
		FinPour
		Pour i ← 0 à 6 avec Pas de 1
		Ecrire Suite[i]
		FinPour
		Fin
		*/
		
		int[] suite = new int[7];
		
		suite[0] = 1;
		suite[1] = 1;
		
		for(int i=2; i<6;i++) {
			suite[i] = suite[i-1] + suite[i-2];
		}
		for(int i=0; i<6;i++) {
			System.out.print(suite[i]+"|");
		}
		
		
		
		
	}

}
