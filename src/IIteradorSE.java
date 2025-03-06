public class IIteradorSE<T> implements Iterador<T>{
    private ElementoSE<T> cabeza;
    private ElementoSE<T> previo;
    private ElementoSE<T> actual;

    //constructor
    public IIteradorSE(ElementoSE<T> cabeza){
        this.cabeza= cabeza;
        this.actual= cabeza;
        this.previo=null;
    }

    @Override
    public boolean hasNext() {
        if(actual!=null){
            return true;}
        else{
            return false;}
    }

    @Override
        public T next() {
            if (!hasNext()) {
                System.out.println("no hay mas elementos");
            }
            T elemento = actual.getDato();
            actual = actual.siguiente;
            return elemento;
        }

        @Override
        public void delete() {
            if (previo == null) {
                System.out.println("Debe llamar a next() antes de eliminar.");
            }
            if (previo == cabeza) {
                cabeza = actual;
            } else {
                ElementoSE<T> temp = cabeza;
                while (temp.siguiente != previo) {
                    temp = temp.siguiente;
                }
                temp.siguiente =actual;
            }
            previo = null;
        }
    }
