package tabSimple;

import util.Table;

public class TriSelection {
	public static void main(String[] args) {
		//cree tableau une dimension avec saisi de la taille et des valeurs
		int[] tab = Table.createTable();
		int temp;
		int indice;

		//trie tableau par ordre croissant
		for(int i = 0 ; i < tab.length - 1 ; i++) {
	         indice = i;
	         for(int j = i+1 ; j < tab.length; j++)
	              if(tab[j] < tab[indice])
	                  indice = j;
	         if(indice != i){
	             temp = tab[i];
	             tab[i] = tab[indice];
	             tab[indice] = temp;
	         }
	     }
	
		Table.displayTable(tab);
	}
}
