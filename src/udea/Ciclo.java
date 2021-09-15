/**
 *
 */
package udea;

import java.util.Scanner;
/**
 * @author ciroa
 *
 */
public class Ciclo {

	public static void main(String[] args) {
		int nInput;
		long nFactorial;

		Scanner entrada = new Scanner(System.in);
		nFactorial = 1;
		nInput = entrada.nextInt();

		for (int i = nInput; i > 0; i--) {
			nFactorial = nFactorial * i;
		}
		System.out.print(nFactorial);
		entrada.close();
	}

}
