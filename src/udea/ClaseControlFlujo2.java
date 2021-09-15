/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udea;

/**
 *
 * @author ciroa
 */
public class ClaseControlFlujo2 {

    public static void main(String[] args) {
        int numero = 3;
        int i = 0;
        while (i <= 10) {
            System.out.println(numero + " * " + i + " = " + numero*i);
            i = i+1;
        }

        i = 10;
        do {
            System.out.println(i);
            i--;
        } while (i > 0);

        for (i = 1; i < 11; i++) {
            System.out.printf("La cuenta va en: %d%n", i);
        }

        for (i = 10; i > 0; i--) {
            System.out.println("La cuenta va en: " + i);
        }
    }

}
