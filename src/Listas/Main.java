package Listas;
 import Listas.LIsta;

 import javax.swing.*;
 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion, dato;
        LIsta nuevaLista1 = new LIsta();
        LIsta nuevaLista2 = new LIsta();
        LIsta nuevaLista3 = new LIsta();
        Scanner scan = new Scanner(System.in);

        do {
            String menu = "Menú:\n" +
                    "1. Crear lista\n" +
                    "2. Insertar al inicio\n" +
                    "3. Insertar al final\n" +
                    "4. Mostrar lista\n" +
                    "5. Ordenar\n" +
                    "6. Insertar Ordenado \n"+
                    "7. Sumar listas\n"+
                    "8. Salir";

            String opcio = JOptionPane.showInputDialog(null, menu, "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE);
            opcion = Integer.parseInt(opcio);

            switch (opcion) {
                case 1:
                    String listaInput = JOptionPane.showInputDialog("Que lista desea llenar:\n" +
                            "1. Lista 1\n" +
                            "2. Lista 2\n" +
                            "3. Lista 3");
                    int opc = Integer.parseInt(listaInput);
                    if (opc == 1) {
                        String datoInput = JOptionPane.showInputDialog("Ingrese el dato");
                        dato = Integer.parseInt(datoInput);
                        nuevaLista1.insertar(dato);
                    } else if (opc == 2) {
                        String datoInput = JOptionPane.showInputDialog("Ingrese el dato");
                        dato = Integer.parseInt(datoInput);
                        nuevaLista2.insertar(dato);
                    } else {
                        String datoInput = JOptionPane.showInputDialog("Ingrese el dato");
                        dato = Integer.parseInt(datoInput);
                        nuevaLista3.insertar(dato);
                    }
                    //    JOptionPane.showMessageDialog(null, "Opción no válida");

                    break;
                case 2:
                    String insertarinicio = "¿En qué lista desea insertar?\n" +
                            "1. Lista 1\n" +
                            "2. Lista 2\n" +
                            "3. Lista 3";
                    String opci = JOptionPane.showInputDialog(null, insertarinicio, "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE);

                    int lista = Integer.parseInt(opci); // Leer la elección del usuario

                    String datoInputInicio = JOptionPane.showInputDialog("Inserte el dato");
                    dato = Integer.parseInt(datoInputInicio);

                    if (lista == 1) {
                        nuevaLista1.insertar(dato);
                    } else if (lista == 2) {
                        nuevaLista2.insertar(dato);
                    } else {
                        nuevaLista3.insertar(dato);

                        //JOptionPane.showMessageDialog(null, "Opción no válida");
                    }
                    break;
                case 3:
                    String insertarfinal = "¿En qué lista desea insertar?\n" +
                            "1. Lista 1\n" +
                            "2. Lista 2\n" +
                            "3. Lista 3";
                    String opcionInsertarFinal = JOptionPane.showInputDialog(null, insertarfinal, "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE);
                    int listaInsertarFinal = Integer.parseInt(opcionInsertarFinal);

                    String datoInputFinal = JOptionPane.showInputDialog("Inserte el dato");
                    dato = Integer.parseInt(datoInputFinal);

                    if (listaInsertarFinal == 1) {
                        nuevaLista1.insertarFinal(dato);
                    } else if (listaInsertarFinal == 2) {
                        nuevaLista2.insertarFinal(dato);
                    } else {
                        nuevaLista3.insertar(dato);


                    }
                    break;
                case 4:
                    // Lógica para mostrar las listas
                    JOptionPane.showMessageDialog(null, "Lista 1:\n" + nuevaLista1.mostrar());
                    JOptionPane.showMessageDialog(null, "Lista 2:\n" + nuevaLista2.mostrar());
                    JOptionPane.showMessageDialog(null, "Lista 3:\n" + nuevaLista3.mostrar());

                    break;
                case 5:
                    String ordenar = "¿Qué lista desea ordenarr?\n" +
                            "1. Lista 1\n" +
                            "2. Lista 2\n" +
                            "3. Lista 3";
                    String opcionordenar = JOptionPane.showInputDialog(null, ordenar, "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE);
                    int listaordenar = Integer.parseInt(opcionordenar);
                    if (listaordenar == 1) {
                        nuevaLista1.ordenar();
                    } else if (listaordenar == 2) {
                        nuevaLista2.ordenar();
                    } else {
                        nuevaLista3.ordenar();
                    }
                    break;
                case 6:
                    String Insertarordenado = "¿En qué lista desea insertar ordenado?\n" +
                            "1. Lista 1\n" +
                            "2. Lista 2\n" +
                            "3. Lista 3";
                    String opcioninsertarordenado = JOptionPane.showInputDialog(null, Insertarordenado, "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE);
                    int listainsertarordando = Integer.parseInt(opcioninsertarordenado);
                    if (listainsertarordando == 1) {
                        String datoInput = JOptionPane.showInputDialog("Ingrese el dato");
                        dato = Integer.parseInt(datoInput);
                        nuevaLista1.insertarOrdenado(dato);
                    } else if (listainsertarordando == 2) {
                        String datoInput = JOptionPane.showInputDialog("Ingrese el dato");
                        dato = Integer.parseInt(datoInput);
                        nuevaLista1.insertarOrdenado(dato);
                        nuevaLista2.insertarOrdenado(dato);
                    } else {
                        String datoInput = JOptionPane.showInputDialog("Ingrese el dato");
                        dato = Integer.parseInt(datoInput);
                        nuevaLista1.insertarOrdenado(dato);
                        nuevaLista3.insertarOrdenado(dato);
                    }
                    break;
                /*case 7:
                    String SumaListas = "Suma de listas 1 y 2";
                    JOptionPane.showMessageDialog(null, "La suma de listas es: " + nuevaLista3.sumarListas(LIsta A,B));
                case 8:
                    JOptionPane.showMessageDialog(null, "Salir");
                    break;*/
            }
        } while (opcion != 8);

        scan.close();
    }
}
