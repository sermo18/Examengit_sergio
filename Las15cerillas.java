import java.util.Scanner;

public class Las15cerillas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int Cerillasquequedan = sc.nextInt();
		int Cerillasquequitamos = sc.nextInt();
		int cuantasquitar = 0;
		if (Cerillasquequedan >= 1 && Cerillasquequedan <= 10000 && Cerillasquequitamos >= 1
				&& Cerillasquequitamos <= 10) {

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
