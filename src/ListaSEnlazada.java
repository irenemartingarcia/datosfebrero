public class ListaSEnlazada<T> implements Lista<T>{
    //las funciones de la lista(add, delete, getIterador, getNumelementos
    private ElementoSE<T> cabeza;
    private int numElementos;

   //constructor
    public ListaSEnlazada() {
        this.cabeza =null;
        this.numElementos=0;
    }
    public ListaSEnlazada(ElementoSE<T> cabeza){
        this.cabeza=cabeza;
        this.numElementos =getNumElementos();
    }
    @Override
    public boolean add(T elemento) {
        ElementoSE<T> nuevoElementoSE = new ElementoSE<>(elemento);
        if (cabeza == null) {
            cabeza = nuevoElementoSE;//como la lista esta vacia el nuevo elemento es la cabeza
        } else {
            ElementoSE<T> actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoElementoSE;
        }
        numElementos++;
        return true;
    }

    @Override
    public boolean delete(T elemento) {
        if (cabeza == null) {
            return false; // La lista está vacía
        }
        // eliminar la cabeza
        if (cabeza.getDato().equals(elemento)) {
            cabeza = cabeza.siguiente;
            numElementos--;
            return true;
        }

        ElementoSE<T> actual = cabeza;
        while (actual.siguiente != null && !actual.siguiente.getDato().equals(elemento)) {
            actual = actual.siguiente;
        }
        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
            numElementos--;
            return true;
        }

        return false;
    }

    @Override
    public Iterador<T> getIterador() {
        return new IIteradorSE(cabeza);

        }
    @Override
    public int getNumElementos() {
        return numElementos; // Devuelve el número de elementos en la lista
    }


}
