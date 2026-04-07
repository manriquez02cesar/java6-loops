package retos;

import java.util.Arrays;
import java.util.Scanner;

public class RetoPalindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase desada");
        String palabra = sc.next()
                .toLowerCase();

        //Conviertiendo de string a arreglo
        char[] letras = palabra.toCharArray();
        //Añadiendo un nuevo arrego para guardar la palabra polindroma
        char[] letrasAct = new char[letras.length];

        //Revirtiendo la palabra y guardandola en otro arreglo
        for (int i = letras.length - 1; i >= 0; i--) {
            letrasAct[letras.length - 1 - i] = letras[i];
        }


        //Comparamos el contenido de ambos arreglos
        Boolean sonIguales = Arrays.equals(letras, letrasAct);
        if (sonIguales){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }
    }
}
