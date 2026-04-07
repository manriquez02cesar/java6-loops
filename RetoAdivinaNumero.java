package retos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RetoAdivinaNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList <Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++){
            numeros.add(i);
        }
        int elije = 0;



        Random rd = new Random();
        int numAdi = rd.nextInt(10);;

        do {
            System.out.println("Los numeros a adivinar son los siguientes");
            for (int num : numeros){
                System.out.print(num + " | ");
            }
            System.out.print("\nEscoja su numero del 1 al 10: ");
            elije = sc.nextInt();
            numeros.remove(Integer.valueOf(elije));
        }while (elije != numAdi);
        System.out.println("Felicidades tu numero es el correcto!");
    }
}
