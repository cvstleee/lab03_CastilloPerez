package Menu_21060190_CastilloPerez;

import java.util.Scanner;
// Importar la clase Scanner desde el paquete java.util
import System_21060190_CastilloPerez.System_21060190_CastilloPerez;
import Main.Main;

// Declaración de la clase principal
public class Menu_21060190_CastilloPerez {
    // Método principal
    public static void main(String[] args) {
        // Crear una instancia de Scanner para la entrada de usuario
        Scanner input = new Scanner(System.in);

        // Definir una constante que representa la opción de salida del menú
        final int MENU_EXIT_OPTION = 5;

        // Declarar una variable para almacenar la elección del usuario
        int choice;

        // Bucle do-while que ejecuta el menú hasta que el usuario elige salir
        do {
            // Llamar a la función para imprimir el menú en la consola
            printMenu();

            // Leer la elección del usuario
            choice = input.nextInt();

            // Estructura switch para manejar diferentes opciones del menú
            switch (choice) {
                case 1:
                    // Realizar alguna acción para la opción 1
                    break;

                case 2:
                    // Realizar alguna acción para la opción 2
                    break;

                case 3:
                    // Imprimir instrucciones para sumar dos números
                    System.out.println("Sum 2 numbers");
                    System.out.println("Ingrese un número int y luego presione ENTER:");

                    // Leer el primer número ingresado por el usuario
                    var n1 = input.nextInt();

                    System.out.println("Ingrese otro número int y luego presione ENTER:");

                    // Leer el segundo número ingresado por el usuario
                    var n2 = input.nextInt();

                    // Calcular la suma de los dos números
                    int sum = n1 + n2;

                    // Imprimir el resultado de la suma
                    System.out.println("La suma es: " + sum);
                    break;

                case 4:
                    // Realizar alguna acción para la opción 4
                    break;

                case 5:
                    // Imprimir mensaje de despedida y salir del programa
                    System.out.println("Bye.. Que la Fuerza te acompañe");
                    System.exit(0);
                    break;
                default:
                    // Imprimir un mensaje de opción no válida si la elección no coincide con ninguna opción del menú
                    System.out.println(choice + " is not a valid option! Please select correct option.");
            }
        } while (choice != MENU_EXIT_OPTION); // Continuar el bucle hasta que el usuario elija salir
    }

    // Método privado que imprime el menú en la consola
    private static void printMenu() {
        Scanner usuarioEntrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario:\n");
        String usuario = usuarioEntrada.nextLine();  // para guardar el input
        //verificar si existe en la lista de usuarios del system, me falta poner en que sistema aplicarlo, pero no me reconoce el s1
        if(systemLogin(usuario) == true){
            //opciones del tipo de usuario
        }
        //System.out.println("Username is: " + usuario);


        System.out.println("Main Menu\n");
        System.out.print("1. Create something \n");
        System.out.print("2. Modify something.\n");
        System.out.print("3. Sum 2 numbers.\n");
        System.out.print("4. Some option.\n");
        System.out.print("5. Exit\n");
        System.out.print("\nEnter your choice: ");
    }
}