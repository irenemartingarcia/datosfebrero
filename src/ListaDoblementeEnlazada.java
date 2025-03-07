public class ListaDoblementeEnlazada<T> implements Lista<T>{
    private ElementoDoble<T> cabeza;
    private int numElementos;
    private ElementoDoble<T> cola;
    public ListaDoblementeEnlazada() {
        this.cabeza = null;
        this.cola = null;
        this.numElementos = 0;
    }
    @Override
    public boolean add(T elemento) {
        this.cola.setSiguiente(new ElementoDoble<>(elemento, this.cola));
        this.cola=this.cola.getSiguiente();
        return true;
    }
    @Override
    public boolean delete(T elemento) {
        if (cabeza == null) {
            return false;
        }

        ElementoDoble<T> actual = cabeza;
        while (actual != null && !actual.getDato().equals(elemento)) {
            actual = actual.getSiguiente();
        }

        if (actual == null) {
            return false;
        }

        if (actual.getAnterior() != null) {
            actual.getAnterior().setSiguiente(actual.getSiguiente());
        } else {
            cabeza = actual.getSiguiente();
        }

        if (actual.getSiguiente() != null) {
            actual.getSiguiente().setAnterior(actual.getAnterior());
        } else {
            cola = actual.getAnterior();
        }

        numElementos--;
        return true;
    }
    @Override
    public Iterador<T> getIterador() {
        return new IIteradorDobleEnlazada<>(cabeza, cola);
    }
    @Override
    public int getNumElementos() {
        return numElementos;
    }

    public ElementoDoble<T> getCabeza() {
        return cabeza;
    }

    public ElementoDoble<T> getCola() {
        return cola;
    }

    public void setCabeza(ElementoDoble<T> cabeza) {
        this.cabeza = cabeza;
    }


}
