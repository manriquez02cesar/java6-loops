package retos;

import java.util.Scanner;

public class RetoCuentaBanco {
    public static void main(String[] args) {
        //Agregamos un Scanner para que el usuario pueda ingresar sus datos
        Scanner sc = new Scanner(System.in);

        int opcionLog;
        //Declaré dos variables para crear usuarios
        String username = null;
        String password = null;
        //Declaré dos variables para el acceso al menu
        String user;
        String pass;
        String frase = null;
        do{
            System.out.println("===========LOGIN============");
            System.out.println("1. Crea un usuario");
            System.out.println("2. Inicia Sesion");
            System.out.println("3. Salir");

            System.out.print("Elija su opcion: ");
            opcionLog = sc.nextInt();
            switch (opcionLog){
                case 1:
                    System.out.print("\nCree un nombre de usuario: ");
                    username = sc.next();
                    System.out.print("Cree una contraseña: ");
                    password = sc.next();
                    System.out.println("\nSu perfil ah sido creado con exito!");
                    break;
                case 2:
                    System.out.print("Ingrese su nombre de usuario: ");
                    user = sc.next();
                    System.out.print("Ingrese su contraseña: ");
                    pass = sc.next();
                    if (user.equals(username) & pass.equals(password)){
                        frase = "Has accesado con exito!";
                        System.out.println("\n" + frase + "\n");
                        opcionLog = 3;
                    }else {
                        System.out.println("\nError tu usario o contraseña son incorrectos, Intenta de nuevo\n");
                        opcionLog = 2;
                    }
                    break;
                case 3:
                    frase = "Usted ah salido del programa!";
                    System.out.println("\n" + frase);
                    break;
                default:
                    System.out.println("Esa opcion no es valida intente de nuevo");
            }
        }while (opcionLog != 3);

        if (frase.equals("Usted ah salido del programa!")){
            System.exit(130);
        }else {
            System.out.println("Hola");
        }
    }
}
