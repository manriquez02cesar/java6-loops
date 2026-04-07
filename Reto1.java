package retos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Preguntar cuantos participantes estaran dentro del programa
        System.out.print("Indique el numero de participantes:");
        int participantes = sc.nextInt();

        //Dejo el codigo para una futura actualizacion donde se pueda ingresar nombres y cada quien pueda escoger su boleto

//        //Declarando las variables de nombre en arreglo
//        ArrayList <String> nombres = new ArrayList<>();
//        int[] boletos = new int[participantes];
//
//        for (int i = 0; i < participantes; i++){
//            boletos[i] = (i + 1);
//        }
//        for (int i = 0; i < participantes; i++){
//            System.out.println(boletos[i]);
//        }


//        System.out.println("Ingrese el nombre de cada participante y su numero de boleto\n");
//        for (int i = 1; i <= participantes; i++){
//            System.out.print("Ingrese su nombre porfavor:\n");
//            nombres.add(sc.next());
//        }


        Random rd = new Random();
        int boletoGanador = rd.nextInt(participantes);
        System.out.println("El boleto ganador es el numero " + boletoGanador);

    }
}
