package tabSimple;

import java.util.ArrayList;
import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {
		/*
		 *	La suite de Fibonacci est une suite qui commence par 0 et 1 et dans laquelle le nombre de
			rang N est égal à la somme des nombres de rangs N-1 et N-2
			• Créer une classe TestFibonacci
			• Demander à l’utilisateur de choisir un rang N
			• Ecrire un algorithme qui calcule et affiche le nombre de rang N
		 */

		
		ArrayList<Integer> tab = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Choisir un rang N");
		int nbr  = sc.nextInt();
		
		tab.add(0);
		tab.add(1);
		for(int i=2;i<nbr;i++) {
			tab.add(i,(tab.get(i-1) + tab.get(i-2)));
			
		}
		for(int i=0;i<nbr;i++) {
			
			System.out.print(tab.get(i)+"--");
		}
		sc.close();
	}

}
