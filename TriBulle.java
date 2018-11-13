package tabSimple;

import util.Table;

public class TriBulle {
	public static void main(String[] args) {
		
		//cree tableau une dimension de taille demande a l utilisateur et avec des valeurs random
		int[] tab = Table.createTableRandomValue();
		
		boolean tri = false;
		int temp;
		
		
		while(tri == false){
			tri = true;
			for(int i = 0; i<tab.length - 1;i++) {
				if(tab[i]>tab[i+1]) {
					temp = tab[i];
					tab[i] =tab[i+1] ;
					tab[i+1] = temp;
					tri = false;
				}
			}
			
		}
		//affiche tableau une dimension
		Table.displayTable(tab);
	}
}
