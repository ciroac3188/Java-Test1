package udea;

import java.util.Arrays;

public class E4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
		int[] vectorEntradaOrdenado;

		vectorEntradaOrdenado = ordenamientoPersonalizado(vectorEntrada);
	}

	public static int[] removeItem(int[] vector, int posc) {
		int[] newVector = new int[vector.length - 1];
		int newPosc = 0;
		for (int i = 0;i < vector.length; i++) {
			if (i != posc) {
				newVector[newPosc] = vector[i];
				newPosc++;
			}
		}
		return newVector;
	}

	public static int[] ordenamientoPersonalizado(int[] vector){
		int i, j, posc = 0;
		int medida = (vector.length / 2);
		int higherValue, lowerValue, ultimoValor;

		int[] vectorAscending = Arrays.copyOfRange(vector, 0, medida);
		int[] vectorDescending = Arrays.copyOfRange(vector, medida, vector.length);
		int[] vectorOrdenado = new int[vector.length];

		//Ascending order
		for (i = 0; i < medida; i++) {
			lowerValue = vectorAscending[0];
			System.out.println("lowerValue:" + lowerValue);
			for (j = 0; j < vectorAscending.length; j++) {
				/* System.out.println("j: " + j + ", actual valor:" + actualValor +
						", menor Actual:" + menorActual); */
				if (vectorAscending[j] <= lowerValue) {
					lowerValue = vectorAscending[j];
					posc = j;
				}

			}
			System.out.println("lowerValue:" + lowerValue + ",posc:" + posc);
			vectorOrdenado[i] = lowerValue;
			vectorAscending = removeItem(vectorAscending, posc);
			//System.out.println("vector ordenado:" + Arrays.toString(vectorOrdenado));
			System.out.println("vector ascendente:" + Arrays.toString(vectorAscending));
		}
		//Descending order
		for (i = medida; i < vector.length; i++) {
			higherValue = vectorDescending[0];
			System.out.println("higherValue:" + higherValue);
			for (j = 0; j < vectorDescending.length; j++) {
				/* System.out.println("j: " + j + ", actual valor:" + actualValor +
						", menor Actual:" + menorActual); */
				if (vectorDescending[j] >= higherValue) {
					higherValue = vectorDescending[j];
					posc = j;
				}

			}
			System.out.println("higherValue:" + higherValue + ",posc:" + posc);
			vectorOrdenado[i] = higherValue;
			vectorDescending = removeItem(vectorDescending, posc);
			//System.out.println("vector ordenado:" + Arrays.toString(vectorOrdenado));
			System.out.println("vector descendente:" + Arrays.toString(vectorDescending));
		}
		System.out.println("vector ordenado:" + Arrays.toString(vectorOrdenado));
        return vectorOrdenado;
    }
}
