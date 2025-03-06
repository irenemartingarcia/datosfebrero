public class ElementoSE<T> {
    T dato;
    ElementoSE<T> siguiente;
    public ElementoSE(T dato){
        this.dato=dato;
        this.siguiente=null;
    }
    public ElementoSE<T> getsiguiente(){
            return siguiente;
    }
    public void setSiguiente(ElementoSE<T> siguiente){
        this.siguiente=siguiente;
    }
    public T getDato(){
        return dato;
    }
    public void setDato(T dato){
        this.dato= dato;
    }



}