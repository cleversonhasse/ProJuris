import br.com.projuris.*;

public class FindArrayMain {

	private static FindArray findArray = new MyFindArray();

	public static void main(String[] args) {

		// Declarações
		int[] array1 = {4,9,3,7,8};
		int[] subArray1 = {3,7};

		int[] array2 = {1,3,5};
		int[] subArray2 = {1};
		
		int[] array3 = {7,8,9};
		int[] subArray3 = {8,9,10};

		int[] array4 = {4,9,3,7,8,3,7,1};
		int[] subArray4 = {3,7};

		// Chamada
		System.out.println("Resultado 1: " + FindArrayMain.findArray.findArray(array1, subArray1));
		System.out.println("Resultado 2: " + FindArrayMain.findArray.findArray(array2, subArray2));
		System.out.println("Resultado 3: " + FindArrayMain.findArray.findArray(array3, subArray3));
		System.out.println("Resultado 4: " + FindArrayMain.findArray.findArray(array4, subArray4));
	}

}
