package udea;

public class E3 {

	public static double mean(int[] vector){
        double promedio = 0;
        double valor = 0;
        int i;

    	for (i = 0; i < vector.length; i++) {
    		System.out.println(vector[i]);
    		valor = vector[i];
   			promedio = promedio + valor;
    	}
        promedio = promedio / i;
        return promedio;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double resultado;
		int[] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};

		resultado = mean(vectorEntrada);
		System.out.println(resultado);

	}

}
