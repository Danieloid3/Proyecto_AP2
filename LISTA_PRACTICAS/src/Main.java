import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Listas lista1 = new Listas();
        int dato, opcion;

        do {
            System.out.println("Elija una opción:");
            System.out.println("1. Insertar");
            System.out.println("2. Mostrar");
            System.out.println("3. Ordenar");
            System.out.println("4. Salir");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Cantidad de datos que desea ingresar:");
                    int cant = scan.nextInt();
                    for (int i = 0; i < cant; i++) {
                        System.out.println("Ingrese dato " + (i + 1));
                        dato = scan.nextInt();
                        lista1.Insertar(dato);
                    }
                    break;
                case 2:
                    System.out.println("Elementos de la lista:");
                    lista1.Mostrar();
                    break;
                case 3:
                    lista1.ordenar();
                    System.out.println("Lista ordenada:");
                    lista1.Mostrar();
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 4);

        scan.close();
    }
}
