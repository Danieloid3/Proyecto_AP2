
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
    // insertar ordenado
    // l3 = l1 + l2
    public void insertarOrdenado(int dato)
    {
        Nodo P = this.punta;
        Nodo Q = P;

        while(dato > P.getDato() && P!= null){
            Q = P;
            P = P.getLiga();
        }
        Nodo x = new Nodo(dato);
        if(P!=Q) Q.setLiga(x);
        x.setLiga(P);
        if(P==Q) this.punta = x;
    }
    public void sumarListas(Lista A,Lista B){
        Nodo P = A.punta;
        Nodo Q = B.punta;
        while(P != null || Q != null){
            int d = 0;
            if(P==null) d = Q.getDato();
            else if(Q==null) d = P.getDato();
            else d = P.getDato() + Q.getDato();
            insertarFinal(d);
            P = P.getLiga();
            Q = Q.getLiga();
        }

    }
}
