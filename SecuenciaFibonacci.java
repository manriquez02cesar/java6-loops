package retos;

import java.util.Scanner;

public class SecuenciaFibonacci {
    int num1 = 0, num2 = 1, limit;
    Scanner sc = new Scanner(System.in);
    protected void secuenciaFibo(){
        System.out.println("Ingresa el limte que desea alcanzar la secuencia");
        limit = sc.nextInt();

        for (int i = 0; i < limit; i++){
            System.out.print(num1 + ", ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
