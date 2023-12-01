import java.util.Random;
import java.util.Scanner;
public class repositorio {
    /*
        Muestra el MenÃº de opciones
     */
    public static void menu()
    {
        System.out.println("Menú:");
        System.out.println("Opción 1: Mostrar números aleatorios eligiendo cantidad y rango");
        System.out.println("Opción 2: Mostrar números aleatorios entre 0 y 1");
        System.out.println("Opcion 3: Salir del programa");
        System.out.print  ("Opción: ");
    }

    /*
        Muestra cantidad de número aleatorios enteros entre min y max
     */
    static void mostrarAleatorios(int cantidad, int min, int max) {
        int aleatorio;

        System.out.println(cantidad + " NÚMEROS ENTRE " + min + " Y " + max + ".");

        for (int i = 0; i < cantidad; i++) {
            // valor entero entre min y max
            aleatorio = min + (int) (Math.random() * (max - min + 1));
            System.out.print(aleatorio + " ");
        }
        System.out.println(); // salto de línea
    }

    /*
        Muestra cantidad de número aleatorios reales entre 0 y 1
     */
    static void mostrarAleatorios(int cantidad) {
        double aleatorio;

        System.out.println(cantidad + " NÚMEROS ENTRE 0 Y 1.");

        for (int i = 0; i < cantidad; i++) {
            aleatorio = Math.random(); // valor real entre 0 y 1
            System.out.print(aleatorio + " ");
        }
        System.out.println(); // salto de línea
    }

    public static void main(String[] args) {
        int opcion, min, max, cantidad;
        Scanner sc = new Scanner(System.in);

        do {
            menu();                 // Llamada a la funciÓn Menú
            opcion = sc.nextInt();  // Recogemos la opción

            switch (opcion)         // Comparamos la opción
            {
                case 1:
                    System.out.print("Introduce el número mínimo aleatorio: ");
                    min = sc.nextInt();

                    System.out.print("Introduce el número máximo aleatorio: ");
                    max = sc.nextInt();

                    System.out.print("Introduce la cantidad de números aleatorios a mostrar: ");
                    cantidad = sc.nextInt();

                    mostrarAleatorios(cantidad, min, max);
                    break;
                case 2:
                    System.out.print("Introduce la cantidad de números aleatorios a mostrar: ");
                    cantidad = sc.nextInt();

                    mostrarAleatorios(cantidad);
                    break;
                case 3:
                    System.out.println("Saliendo del programa!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        }while(opcion != 3); // Se repite el bucle mientras la opción sea distinta de 3
    }
}


