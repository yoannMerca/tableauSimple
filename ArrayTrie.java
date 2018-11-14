package tabSimple;

import java.util.Arrays;

public class ArrayTrie {

	public static void main(String[] args) {
		/*• Créer une classe TestArrayTri
			• Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
			• Utiliser la classe Arrays pour trier le tableau
		*/
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		//Utiliser la classe Arrays pour trier le tableau
		System.out.println(" le tableau non trie");
		for(int i =0;i<array.length;i++) {
			System.out.print("["+array[i]+"]");
		}
		
		//trie par ordre croissant
		Arrays.sort(array);
		System.out.println("");
		System.out.println(" le tableau trie");
		for(int i =0;i<array.length;i++) {
			System.out.print("["+array[i]+"]");
		}
	}

}
