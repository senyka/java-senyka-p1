import java.util.Scanner;

public class Runner {
	public static void main (String [] arg) {
		Scanner reader = new Scanner (System.in);
		try {
			Calculator calc = new Calculator ();
			String exit = "No";
			while (!exit.equals ("Yes")) {
				System.out.println ("Vvedite pervoe znachenie : ");
				String first = reader.next ();
				System.out.println ("Vvedite vtoroe znachenie : ");
				String second = reader.next ();
				calc.add (Integer.valueOf (first), Integer.valueOf (second));
				System.out.println ("Resultat : " + calc.getResult());
				calc.cleanResult ();
				System.out.println ("Exit : Yes/No ");
				exit = reader.next ();
			}
		} finally {
				reader.close ();
		}
	}
}