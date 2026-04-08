package retos;

import java.util.Scanner;

public class RetoPrimaSeguro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cual es tu nombre:");
        String name = sc.next();
        System.out.print("\nCual es tu edad:");
        int age = sc.nextInt();
        System.out.print("\nCual es tu ingreso mensual:");
        double sueldo = sc.nextDouble();

        int primaMen = 0;
        double aumento = 0;
        double pago = 0;

        if (age >= 70){
            primaMen = 500;
        } else if (age >= 50 & age <= 69) {
            primaMen = 400;
        } else if (age >= 30 & age <= 49) {
            primaMen = 250;
        }else if (age <= 29){
            primaMen = 100;
        }

        if (sueldo >= 300){
            aumento = primaMen * 0.10;
            pago = aumento + primaMen;
        } else if (sueldo < 300) {
            aumento = primaMen * 0.05;
            pago = aumento + primaMen;
        }
        System.out.println("Tu prima mensual a pagar es = " + pago);
    }
}
