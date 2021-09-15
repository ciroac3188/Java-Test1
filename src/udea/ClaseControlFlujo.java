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
public class ClaseControlFlujo {

    public static void main (String[] args) {
        double nota = 4.5;
        int dia = 3;
        String nombreDia;

        if (nota >= 0 && nota <= 1) {
            System.out.println("Deficiente");
        } else if (nota > 1 && nota <= 3) {
            System.out.println("Insuficiente");
        } else if (nota > 3 && nota <= 4) {
            System.out.println("Aprobado");
        } else if (nota > 4 && nota <= 5) {
            System.out.println("Excelente");
        } else {
            System.out.println("Nota inv�lida");
        }

        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Día inválido";
                break;
        }
        System.out.println(nombreDia);
    }

}
