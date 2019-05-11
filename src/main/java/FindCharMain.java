import br.com.projuris.*;
import br.com.projuris.FindCharachter;

public class FindCharMain {

	private static FindCharachter findCharachter = new MyFindChar();

	public static void main(String[] args) {
		System.out.println("Resultado 1: " + FindCharMain.findCharachter.findChar("stress"));
		System.out.println("Resultado 2: " + FindCharMain.findCharachter.findChar("reembolsar"));
	}

}
