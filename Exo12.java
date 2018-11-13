package array;

import util.Table;

public class Exo12 {

	public static void main(String[] args) {
		
		int[] tab1 = Table.createTable();
		int[] tab2 = Table.createTable(tab1.length);
		int[] tab3 = new int[tab1.length];
		
		
		//fait la somme des valeurs des deux tab
		for(int i =0; i< tab1.length;i++) {
			tab3[i] = tab2[i] + tab1[i];
		}
		
		
		//affiche tableau 3
		Table.displayTable(tab3);
	}

}
