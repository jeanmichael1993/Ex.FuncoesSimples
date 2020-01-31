import java.util.Scanner;
import java.util.Locale;

public class Ex06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int gli, tri, col;

		System.out.println("Digite o resultado de glicose");
		gli = sc.nextInt();
		System.out.println("Digite o resultado de triglicerídios");
		tri = sc.nextInt();
		System.out.println("Digite o resultado de Colesterol");
		col = sc.nextInt();

		resultadoExames(gli, tri, col);

		sc.close();

	}

	public static void resultadoExames(int gli, int tri, int col) {

		if (gli <= 100) {

			System.out.println("Glicose: Normal");

		}

		else if (gli > 100 && gli <= 140) {

			System.out.println("Glicose: Evelado");

		} else {

			System.out.println("Glicose: Diabetes");

		}

		if (tri <= 200) {

			System.out.println("Triglicerídios: Desejável");

		}

		else {

			System.out.println("Triglicerídios: Aumentado");

		}

		if (col <= 200) {

			System.out.println("Colesterol: Desejável");

		}

		else if (col > 200 && col <= 240) {
			System.out.println("Colesterol: Limiar");
		}

		else {

			System.out.println("Colesterol: Elevado");

		}

	}

}
