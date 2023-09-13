public class Nodo {
    //Atributos
    private int dato;
    private Nodo liga;

    public void Nodo(int dato, Nodo liga){
        this.dato=dato;
        this.liga=liga;
    }
    public Nodo(){
        this.dato=0;
        this.liga=null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }
}
