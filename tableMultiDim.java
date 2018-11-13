package tabSimple;

import util.Table;

public class tableMultiDim {

	public static void main(String[] args) {
		int[][] tab = new int[2][8];
		
		int test = 0;
		for(int i =0; i<tab.length;i++) {
			for(int j =0; j<tab[i].length;j++) {
					tab[i][j] = test;
					test++;
			}
		}
//		for(int i =0; i<tab.length;i++) {
//			for(int j =0; j<tab[i].length;j++) {
//					tab[i][j] =0;
//			}
//		}
		//affiche un tableau a une dimension
		Table.displayTableMulti(tab);
	}

}
