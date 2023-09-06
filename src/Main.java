import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //Menú
        int opcion;
        Scanner scan = new Scanner(System.in);
//        Lista nuevaLista = new Lista();
        /*
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
                    if(nuevaLista.punta==null){
                        System.out.println("Lista vacía");
                        System.out.println("Insertar dato");
                        dato = scan.nextInt();
                        nuevaLista.insertarInicio(dato);
                    }else{
                        System.out.println("Lista llena");
                    }
                    break;
                case 2:
                    System.out.println("Insertar al inicio");
                    nuevaLista.insertarInicio(5);
                    break;
                case 3:
                    System.out.println("Insertar al final");
                    nuevaLista.insertarFinal(10);
                    break;
                case 4:
                    System.out.println("Mostrar lista");
                    break;
                case 5:
                    System.out.println("Salir");
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }while (opcion != 4);




        */


        Lista lista1 = new Lista();
        Lista lista2 = new Lista();
        Lista lista3 = new Lista();


        lista1.insertarInicio(5);
        lista1.insertarInicio(10);
        lista1.insertarFinal(15);
        lista1.insertarFinal(2);
        lista1.ordenar();
        lista1. insertarOrdenado(3);

        lista2.insertarInicio(1);
        lista2.insertarInicio(2);
        lista2.insertarFinal(3);
        lista2.insertarFinal(4);
        lista2.ordenar();
        lista2. insertarOrdenado(5);

        lista3.sumarListas(lista1, lista2);


        lista1.mostrarLista();
        lista2.mostrarLista();
        lista3.mostrarLista();

    }
}
