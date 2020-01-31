import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double g = sc.nextInt();

		classificarGlicose(g);

		sc.close();
	}

	/**
	 * Imprime na tela a classificação da glicose recebida, de acordo com a seguinte
	 * tabela de referência: (1) Até 100mg/dl = Normal; (2) Maior que 100 até
	 * 140mg/dl = Elevado; (3) Maior que 140mg/dl = Diabetes
	 * 
	 * @param g Medida de glicose em mg/dl
	 */
	public static void classificarGlicose(double g) {

		if (g <= 100) {

			System.out.println("Normal");
		} else if (g > 100 && g <= 140) {

			System.out.println("Elevado");

		} else {

			System.out.println("Diabetes");

		}

	}

}
