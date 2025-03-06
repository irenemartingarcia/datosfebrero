public class ElementoDoble<T> {
    private T dato;
    private ElementoDoble<T> anterior;
    private ElementoDoble<T> siguiente;
    private int numElementos;
    public ElementoDoble(T dato, ElementoDoble<T> anterior) {
        this.dato=dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public void setSiguiente(ElementoDoble<T> siguiente) {
        this.siguiente = siguiente;
    }

    public ElementoDoble<T> getSiguiente() {
        return siguiente;
    }
    public T getDato(){
        return dato;
    }
    public ElementoDoble<T> getAnterior(){
        return anterior;
    }

    public void setAnterior(ElementoDoble<T> anterior) {
        this.anterior = anterior;
    }
}
