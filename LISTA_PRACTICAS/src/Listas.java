public class Listas {
    //Atributos

    private Nodo punta;

    public void Insertar(int dato){
        Nodo x=new Nodo();
        x.setDato(dato);
        if(punta==null){
            punta=x;

        }else{
            x.setLiga(punta);
            punta=x;
        }
    }
   /* public void Mostrar(){
        Nodo aux=punta;
        while(aux!= null){
            System.out.println("DAto: "+aux.getDato());
            System.out.println("DIreccion: "+aux.getLiga());
            aux=aux.getLiga();
        }

    }*/
   public void Mostrar() {
       Nodo aux = punta;
       while (aux != null) {
           System.out.print(aux.getDato() + " ");
           aux = aux.getLiga();
       }
       System.out.println();
   }

    public void ordenar() {
        Nodo aux;
        Nodo P = this.punta;
        Nodo Q = P;
        for (P = this.punta; P != null; P = P.getLiga()) {
            for (Q = P.getLiga(); Q != null; Q = Q.getLiga()) {
                if (System.identityHashCode(Q.getLiga()) > System.identityHashCode(P.getLiga())) {
                    aux = P.getLiga();
                    P.setLiga(Q.getLiga());
                    Q.setLiga(aux);
                }
            }
        }
    }


}
