package tabSimple;

import util.Table;

public class Exo9 {

	public static void main(String[] args) {
		/*Ecrivez un algorithme permettant, toujours sur le même principe, à l’utilisateur de saisir un nombre
		déterminé de valeurs.
		Le programme, une fois la saisie terminée, renvoie la plus grande valeur en précisant quelle position
		elle occupe dans le tableau.
		On prendra soin d’effectuer la saisie dans un premier temps, et la recherche de la plus grande valeur
		du tableau dans un second temps.*/
		
		//cree tableau une dimension avec saisi de la taille et des valeurs
		int[] tab = Table.createTable();
		int position = -1;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<tab.length;i++) {
			if(tab[i]>max) {
				position = i;
				max = tab[i];
			}
		}
		System.out.println("la valeur la plus grande du tableau est:"+ max +" est elle se trouve en position :"+position);
	}

}
