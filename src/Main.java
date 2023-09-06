import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //Menú
        int opcion;
        Scanner scan = new Scanner(System.in);

        do
        {
            System.out.println("Menú");
            System.out.println("1. Crear lista");
            System.out.println("2. Insertar al inicio");
            System.out.println("3. Insertar al final");
            System.out.println("4. Mostrar lista");
            System.out.println("5. Salir");
            opcion = scan.nextInt();
            switch (opcion)
            {
                case 1:
                    System.out.println("Crear lista");
                    Lista nuevaLista = new Lista();
                    break;
                case 2:
                    System.out.println("Insertar al inicio");
                    break;
                case 3:
                    System.out.println("Insertar al final");
                    break;
                case 4:
                    System.out.println("Mostrar lista");
                    break;
                case 5:
                    System.out.printl
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }while (opcion != 4);






//        Lista lista1 = new Lista();
//        Lista lista2 = new Lista();
//
//
//        lista1.insertarInicio(5);
//        lista1.insertarInicio(10);
//        lista1.insertarInicio(15);
//
//
//        lista1.mostrarLista();

    }
}
