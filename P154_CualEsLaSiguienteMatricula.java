import java.util.Scanner;

public class P154_CualEsLaSiguienteMatricula {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String matricula = "";
		String[] separado;
		int numeroMatricula = 0;
		String LetrasMAtricula = "";

		while (!(numeroMatricula == 9999 && LetrasMAtricula.equals("ZZZ"))) {

			matricula = sc.nextLine();
			separado = matricula.split(" ");
			numeroMatricula = Integer.valueOf(separado[0]);
			LetrasMAtricula = separado[1];

			if (numeroMatricula == 9999 && LetrasMAtricula.equals("ZZZ")) {

			} else {
				matriculaSiguiente(numeroMatricula, LetrasMAtricula);

			}
		}
	}

	private static void matriculaSiguiente(int numeroMatricula, String letrasMAtricula) {
		char p0 = letrasMAtricula.charAt(0);
		char p1 = letrasMAtricula.charAt(1);
		char p2 = letrasMAtricula.charAt(2);
		String siguienteMatricula = "";
		int[] NoValidas = { 65, 69, 73, 79, 85 };

		if (numeroMatricula != 9999) {
			numeroMatricula++;

		} else if (numeroMatricula == 9999) {
			numeroMatricula = -1;
			if (p2 != 90) {
				p2++;

			} else if (p2 == 90 && p1 != 90) {
				p2 = 'B';
				p1++;
			} else if (p2 == 90 && p1 == 90) {
				p0++;
				p2 = 'B';
				p1 = 'B';
			}
			if (p2 == 65 || p2 == 69 || p2 == 73 || p2 == 79 || p2 == 85) {
				p2++;
			}
			if (p1 == 65 || p1 == 69 || p1 == 73 || p1 == 79 || p1 == 85) {
				p1++;
			}
			if (p0 == 65 || p0 == 69 || p0 == 73 || p0 == 79 || p0 == 85) {
				p0++;
			}
		}

		if (numeroMatricula == -1) {
			System.out.printf("%s %s%s%s%n", "0000", (p0 + ""), (p1 + ""), (p2 + ""));

			// siguienteMatricula = "0000 " + p0 + p1 + p2;

		} else {
			System.out.printf("%04d %s%s%s%n", numeroMatricula, (p0 + ""), (p1 + ""), (p2 + ""));
			siguienteMatricula = numeroMatricula + " " + p0 + p1 + p2;

		}

	}
//ESTO NO ESTAVA ANTES
}
