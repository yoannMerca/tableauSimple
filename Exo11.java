package array;

//import java.util.stream.IntStream;
import util.Table;

public class Exo11 {
	public static void main(String[] args) {
		
		int[] tab = Table.createTable();
		
		for(int i=0; i<tab.length;i++) {
			System.out.println("Saisir une valeur");
		}
		//methode pour faire plus 1 sans changer les valeurs du tableau
		//IntStream.of(tab).map(x -> x + 1).forEach(System.out::println);
		
		Table.displayTable(tab);

	}
}
