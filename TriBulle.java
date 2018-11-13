package array;

import util.Table;

public class TriBulle {
	public static void main(String[] args) {
		
		
		int[] tab = Table.creatTable();
		
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
		Table.displayTable(tab);
	}
}
