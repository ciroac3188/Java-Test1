/**
 *
 */
package udea;

/**
 * @author ciroa
 *
 */
public class ClaseArreglos {

	public static void main(String[] args) {

		//Se declara y crea el array
        int[] numeros = new int[9];
        //Se asignan valores a (inicializan) los elementos del array
        numeros[0] = 10;
        numeros[1] = 5;
        numeros[2] = 8;
        numeros[3] = 0;
        numeros[4] = -26;
        numeros[5] = 100;
        numeros[6] = 3000;
        numeros[7] = -7;
        numeros[8] = 5;
        //Se acceden los elementos del array
        for (int element : numeros) {
            System.out.println(element);
        }
        System.out.println(numeros[3] + numeros[7]);
        System.out.println(numeros[6] / numeros[5]);
        //Se cambian los valores de algunos elementos del array
        numeros[7] = -14;
        numeros[3] = numeros[2] * numeros[1];
        //Se imprimen acceden los nuevos valores
        System.out.println(numeros[7]);
        System.out.println(numeros[3]);

        ClaseArreglos prueba = new ClaseArreglos();
        prueba.matrices();

	}

	public void matrices() {

		int[][] coordenadas = new int[5][10];

		System.out.println(coordenadas.length);
		for (int[] element : coordenadas) {
			System.out.println(element.length);
		}

	}

}
