import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion, dato;
        Lista nuevaLista1 = new Lista();
        Lista nuevaLista2 = new Lista();
        Lista nuevaLista3 = new Lista();
        Scanner scan = new Scanner(System.in);

        do {
            String menu = "Menú:\n" +
                    "1. Insertar al inicio\n" +
                    "2. Insertar al final\n" +
                    "3. Mostrar lista\n" +
                    "4. Ordenar\n" +
                    "5. Insertar Ordenado \n"+
                    "6. Sumar listas\n"+
                    "7. Salir";

            String opcio = JOptionPane.showInputDialog(null, menu, "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE);
            opcion = Integer.parseInt(opcio);

            switch (opcion) {
                case 1:
                    String listaInput = JOptionPane.showInputDialog("¿En que lista desea insertar?:\n" +
                            "1. Lista 1\n" +
                            "2. Lista 2\n" );
                    int opc = Integer.parseInt(listaInput);
                    String datoInput = JOptionPane.showInputDialog("Ingrese el dato");
                    dato = Integer.parseInt(datoInput);
                    if (opc == 1) nuevaLista1.insertarInicio(dato);
                    if (opc == 2) nuevaLista2.insertarInicio(dato);
                    break;
                case 2:
                    String insertarfinal = "¿En qué lista desea insertar?\n" +
                            "1. Lista 1\n" +
                            "2. Lista 2\n";
                    String opcionInsertarFinal = JOptionPane.showInputDialog(null, insertarfinal, "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE);
                    int listaInsertarFinal = Integer.parseInt(opcionInsertarFinal);

                    String datoInputFinal = JOptionPane.showInputDialog("Inserte el dato");
                    dato = Integer.parseInt(datoInputFinal);

                    if (listaInsertarFinal == 1) nuevaLista1.insertarFinal(dato);
                    if (listaInsertarFinal == 2) nuevaLista2.insertarFinal(dato);

                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Lista 1:\n");
                    nuevaLista1.mostrarLista();
                    JOptionPane.showMessageDialog(null, "Lista 2:\n");
                    nuevaLista2.mostrarLista();
                    break;
                case 4:
                    String ordenar = "¿Qué lista desea ordenarr?\n" +
                            "1. Lista 1\n" +
                            "2. Lista 2\n";
                    String opcionordenar = JOptionPane.showInputDialog(null, ordenar, "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE);
                    int listaordenar = Integer.parseInt(opcionordenar);
                    if (listaordenar == 1) nuevaLista1.ordenar();
                    if (listaordenar == 2) nuevaLista2.ordenar();
                    break;
                case 5:
                    String Insertarordenado = "¿En qué lista desea insertar ordenado?\n" +
                            "1. Lista 1\n" +
                            "2. Lista 2\n";
                    String opcioninsertarordenado = JOptionPane.showInputDialog(null, Insertarordenado, "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE);
                    int insertarOrde = Integer.parseInt(opcioninsertarordenado);
                    String listainsertarordando = JOptionPane.showInputDialog("Ingrese el dato");
                    dato = Integer.parseInt(listainsertarordando);
                    if (insertarOrde == 1) nuevaLista1.insertarOrdenado(dato);
                    if (insertarOrde == 2) nuevaLista2.insertarOrdenado(dato);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "La suma de listas es: ");
                    nuevaLista3.sumarListas(nuevaLista1, nuevaLista2);
                    nuevaLista3.mostrarLista();
                case 7:
                    JOptionPane.showMessageDialog(null, "Salir");
                    break;
            }
        } while (opcion != 7);

        scan.close();
    }
}
