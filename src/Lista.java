
import javax.swing.JOptionPane;
public class Lista
{
    //Atributos
    public Nodo punta;

    //Métodos
    //Constructor

    public Lista()
    {
        this.punta = null;
    }

    //Insertar al inicio
    public void insertarInicio(int dato)
    {
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        if (punta == null)
        {
            punta = nuevo;
        }
        else
        {
            nuevo.setLiga(punta);
            punta = nuevo;
        }
    }

    //Mostrar lista

    public void mostrarLista()
    {
        Nodo aux = punta;
        String s = "";
        while(aux != null)
        {
            System.out.print(aux.getDato() + " ");
            s += aux.getDato() + " ";
            aux = aux.getLiga();

        }
        JOptionPane.showMessageDialog(null, s);
    }

}
