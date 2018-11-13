package array;

import util.Table;

public class Exo4 {

	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int courant = Integer.MIN_VALUE;
		boolean croissantP = true;
		
		int[] tableau = Table.createTable();
		
		for (int i = 0; i < tableau.length; i++){
			if (tableau[i] > max){
				max = tableau[i];
			}
			if (tableau[i] < min){
				min = tableau[i];
			}
			//teste si croissant
			if (tableau[i] < courant){
				croissantP = false;	
			}
			courant = tableau[i];
		}
		
		
		//affichage final
		System.out.println("max => " + max);
		System.out.println("min => " + min);
		System.out.println("croissant => " + croissantP);
		
		Table.displayTable(tableau);
	}
	
	



	

}
