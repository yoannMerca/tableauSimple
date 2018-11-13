package tabSimple;
import util.Table;
public class Exo8 {

	public static void main(String[] args) {
			 
		int nonMultiple = 0;
		int multiple = 0;
		//methode pour creer un tab a une dimension
		int[] tab = Table.createTable();
		
		//boucle pour calculer les multiples  de 3 
			
		for(int i=0; i<tab.length;i++) {
			if(tab[i]%3 == 0){
				multiple ++;
			}else {
				nonMultiple++;
			}
		}
		System.out.println("nombre de multiple de 3 => "+multiple+" nombre de non multilple => "+ nonMultiple);
	}

}
