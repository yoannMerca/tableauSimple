package tabSimple;

public class TestArray1 {

	public static void main(String[] args) {
		/*Créer une classe TestArray1
			• Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
			• Afficher l’ensemble des éléments du tableau grâce à une boucle
			• Afficher l’ensemble des éléments dans l’ordre inverse du tableau
			• Faire une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
			• Faire une boucle qui affiche uniquement les entiers pairs
			• Afficher le plus grand élément du tableau
			• Afficher le plus petit élément du tableau
		 */
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		
		//Afficher l’ensemble des éléments du tableau grâce à une boucle
		System.out.println("l’ensemble des éléments du tableau");
		for(int i =0;i<array.length;i++) {
			System.out.print("["+array[i]+"]");
			//System.out.print("["+(array[(array.length-1)-i])+"]");
		}
		
		System.out.println("");
		System.out.println("l’ensemble des éléments dans l’ordre inverse du tableau");
		
		//Afficher l’ensemble des éléments dans l’ordre inverse du tableau
		for(int i =0;i<array.length;i++) {
		
			System.out.print("["+(array[(array.length-1)-i])+"]");
		}
		
		System.out.println("");
		System.out.println("affiche que les entiers supérieurs à 3");
		//Faire une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
		for(int i =0;i<array.length;i++) {
			if(array[i]>3) {
				System.out.print("["+array[i]+"]");
			}
		}
		
		
		
		//une boucle qui affiche uniquement les entiers pairs
		
		System.out.println("");
		System.out.println("une boucle qui affiche uniquement les entiers pairs");
		for(int i =0;i<array.length;i++) {
			if(array[i]%2==0) {
				System.out.print("["+array[i]+"]");
			}
		}
		
		//Afficher le plus grand élément du tableau
		System.out.println("");
		System.out.println("Afficher le plus grand élément du tableau");
		int max = Integer.MIN_VALUE;
		for(int i =0;i<array.length;i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		System.out.println("le max vaut =>");
		
		//Afficher le plus petit élément du tableau
				System.out.println("");
				System.out.println("Afficher le plus grand élément du tableau");
				int min = Integer.MAX_VALUE;
				for(int i =0;i<array.length;i++) {
					if(array[i]<min) {
						min = array[i];
					}
				}
				System.out.println("le min vaut =>"+min);
	}

}
