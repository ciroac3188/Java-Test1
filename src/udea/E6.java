package udea;

public class E6 {

	public static void main(String[] args) {
		char[] vector = {' ','P', 'r','o',' ', 'g', 'r','a',' ','m','a', 'r'};

		System.out.println(join(vector));
	}

    public static String join(char[] vector){
        String vectorConcatenado = "";

        for (char element : vector) {
        	vectorConcatenado = vectorConcatenado + element;
        }

        return vectorConcatenado;
    }
}
