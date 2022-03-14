import java.util.Arrays;
public class P0436MaiorComGen {
	public static void main(String args[]) {
		Integer aI[] = {-2,4,7,10,8,5,1,-1};
		Double aD[] = {-2.6, 4.4, 7.8, 9.5, 8.6, 5.7, 1.3, -1.9};
		System.out.println("Greatest Integer: " + maior(aI) + " of " + Arrays.toString(aI));
		System.out.println("Greatest Double: " + maior(aD) + " of " + Arrays.toString(aD));
	}
	@SuppressWarnings({"rawtypes", "unchecked"})
	//Método genérico
	public static <T extends Comparable> T maior (T array[]) {
		T maior = array[0];
		for (T elemento: array) {
			if (maior.compareTo(elemento)<0) {
				maior = elemento;
			}			
		}
		return maior;
	}
}