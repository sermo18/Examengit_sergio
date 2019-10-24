import java.util.Scanner;

public class Las15cerillas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()){

		int Cerillasquequedan = sc.nextInt();
		int Cerillasquequitamos = sc.nextInt();
		
			if (Cerillasquequedan >= Cerillasquequitamos) {

				if (Cerillasquequedan - Cerillasquequitamos == 1) {
					System.out.println(Cerillasquequitamos);
				} else if (Cerillasquequedan == Cerillasquequitamos) {
					System.out.println(Cerillasquequitamos - 1);
				} else if (Cerillasquequedan - Cerillasquequitamos > 1) {
					Cerillasquequitamos = 1;
					System.out.println(Cerillasquequitamos);

				} else
						System.out.println("");
					

			}else
				System.out.println("PIERDO");
		}
	}
}
