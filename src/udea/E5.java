package udea;
import java.util.Arrays;

public class E5 {

	public static void main(String[] args) {
		int[] v1 = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
		int[] v2 = {0, -2, 1, 9, 4, 78, 12, 11, 90, 13};
		int[] resultado = new int[v2.length];

		resultado = sumaVectorial(v1, v2);
		System.out.println(Arrays.toString(resultado));
	}

	public static int[] sumaVectorial(int[] v1, int[] v2){
        int[] s = new int[v2.length];

        for (int i = 0; i < s.length; i++) {
        	s[i] = v1[i] + v2[i];
        }

        return s;
    }

}
