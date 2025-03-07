public class IIteradorDobleEnlazada<T> implements Iterador<T> {
        private ElementoDoble<T> actual;
        private ElementoDoble<T> ultimoRetornado;
        public IIteradorDobleEnlazada(ElementoDoble<T> actual,ElementoDoble<T> ultimoRetornado ){
            this.actual=actual;
            this.ultimoRetornado=ultimoRetornado;
        }


        @Override
        public boolean hasNext() {
            if(actual!=null){
                return true;
            }else{
                return false;
            }
        }

        @Override
        public T next() {
            if (!hasNext()) {
                System.out.println("no hay más elementos");
            }
            ultimoRetornado = actual;
            T dato = actual.getDato();
            actual = actual.getSiguiente();
            return dato;
        }

        @Override
        public void delete() {
            if (ultimoRetornado == null) {
                System.out.println("no se puede borrar");
            }
            ElementoDoble<T> siguiente = ultimoRetornado.getSiguiente();
            ElementoDoble<T> anterior = ultimoRetornado.getAnterior();

            if (anterior != null) {
               anterior.setSiguiente(siguiente);
            } else {
                actual = siguiente;
            }

            if (siguiente != null) {
                siguiente.setAnterior(anterior);
            } else {
                System.out.println("no se puede borrar");
            }

            ultimoRetornado = null;
        }
    }
