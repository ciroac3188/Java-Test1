package udea;

class E2{
    public static int sumaPares(int[] vector){
        int s = 0;
        int valor = 0;

    	for (int element : vector) {
    		System.out.println(element);
    		valor = element;
    		if (((valor%2) == 0) && valor > 0 ) {
    			s = s + valor;
    		}
    	}

        return s;
    }

    public static void main(String[] args) {
    	int[] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};
    	int resultado;

    	System.out.println("longitud:" + vectorEntrada.length);
    	resultado = sumaPares(vectorEntrada);
    	System.out.println("Valor:" + resultado);
    }
}