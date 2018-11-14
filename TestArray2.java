package tabSimple;

public class TestArray2 {

	public static void main(String[] args) {
		/*• Créer une classe TestArray2
			• Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
			• Quelle est la moyenne des éléments du tableau ?
			• Quel est l’index dans le tableau de l’entier 15 ?
			• Ecrire un algorithme pour trouver le nombre d’entiers en doublon dans le tableau
		*/

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		//Quelle est la moyenne des éléments du tableau
		System.out.println("Quelle est la moyenne des éléments du tableau");
		int moyenne = 0;
		for(int i =0;i<array.length;i++) {
			moyenne += array[i];
		}
		System.out.println("la moyenne vaut=>"+moyenne/array.length);
		
		//Quel est l’index dans le tableau de l’entier 15
		System.out.println("");
		System.out.println("Quel est l’index dans le tableau de l’entier 15");
		boolean testDu15 = false;
		int index = -1;
		while(!testDu15) {
			index++;
			if(array[index]==15) {
				testDu15 = true;
			}
		}
		System.out.println("l’index dans le tableau de 15 est =>"+index);
		
		//Ecrire un algorithme pour trouver le nombre d’entiers en doublon dans le tableau
		System.out.println("");
		System.out.println("Ecrire un algorithme pour trouver le nombre d’entiers en doublon dans le tableau");
		
		int nbrTotalDoublon = 0;
		int nbrATester;
		for(int i =0;i<array.length;i++) {
			nbrATester = array[i];
			for(int j =i+1;j<array.length;j++) {
				if(nbrATester == array[j]) {
					nbrTotalDoublon++;
				}
			}
		}
		System.out.println("le nombre d’entiers en doublon dans le tableau est =>"+nbrTotalDoublon);
		
	}

}
