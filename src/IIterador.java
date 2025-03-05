
        public class IIterador<T> implements Iterador<T> {
            private Lbasica<T> lista;
            private int indiceActual;

            // Constructor
            public IIterador(T[] elementos) {
                this.lista = lista;
                this.indiceActual = 0;
            // Inicializamos el índice
            }

            @Override
            public boolean hasNext() {
                if(indiceActual < lista.getNumElementos()){ // Hay más elementos si el índice es menor que el tamaño de la lista
                    return true;
                }else{
                    return false;
                }
            }

            @Override
            public T next() {
                if (!hasNext()) {
                  return null;
                }
                return lista.getElemento(indiceActual ++);
            }

            @Override
            public void delete() {
                if(indiceActual>0){
                    lista.delete(lista.getElemento(indiceActual-1));
                    indiceActual--;
                }
            }

}
