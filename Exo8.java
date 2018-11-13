package array;
import util.Table;
public class Exo8 {

	public static void main(String[] args) {
			 
		int nonMult = 0;
		int mult = 0;
		int[] tab = Table.createTable();
		
		//boucle pour calculer les mults  de 3 
			
		for(int i=0; i<tab.length;i++) {
			if(tab[i]%3 == 0){
				mult ++;
			}else {
				nonMult++;
			}
		}
		System.out.println("nombre de multiple de 3 = "+mult+" nombre de non multilple = "+ nonMult);
	}

}
