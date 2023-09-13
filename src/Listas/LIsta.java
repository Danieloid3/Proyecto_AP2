package Listas;


public class LIsta {
    //Atributos
    public Nodo punta;

    public LIsta()
    {
        this.punta = null;
    }

    //Crear lista
    public void crear()
    {
        int dato;
    }

    public void insertar(int dato) {
        Nodo nueva = new Nodo();
        nueva.setDato(dato);
        if (punta == null) {
            punta = nueva;
        } else {
            nueva.setLiga(punta);
            punta = nueva;
        }
    }

    public String mostrar() {
        StringBuilder result = new StringBuilder();
        Nodo aux = punta;
        while (aux != null) {
            result.append(aux.getDato()).append("\n");
            aux = aux.getLiga();
        }
        return result.toString();
    }


    public void insertarFinal(int dato){
        if(punta==null){
            Nodo nuevo=new Nodo();
            punta=nuevo;
        }else{
            Nodo aux=punta;
            while(aux.getLiga()!=null){
                aux=aux.getLiga();
            }
            Nodo nuevo=new Nodo();
            aux.setLiga(nuevo);
        }
    }

    public void ordenar()
    {
        int aux;
        Nodo P = this.punta;
        Nodo Q = P;
        for (P = this.punta; P != null; P = P.getLiga())
        {
            for (Q = P.getLiga(); Q != null; Q = Q.getLiga())
            {
                if (P.getDato() > Q.getDato())
                {
                    aux = P.getDato();
                    P.setDato(Q.getDato());
                    Q.setDato(aux);
                }
            }
        }
    }

    public void insertarOrdenado(int dato)
    {
        if(this.punta == null) return;
        Nodo P = this.punta;
        Nodo Q = P;

        while(dato > P.getDato() && P != null){
            Q = P;
            P = P.getLiga();
        }
        Nodo x = new Nodo();
        if(P!=Q) Q.setLiga(x);
        x.setLiga(P);
        if(P==Q) this.punta = x;
    }

    public int sumarListas(LIsta A,LIsta B){
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
        return 0;
    }


}