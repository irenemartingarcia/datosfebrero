import java.lang.foreign.AddressLayout;

public class Lbasica<T> implements Lista<T> {
    private int maxElementos;
    private int numElementos;
    private T[] elementos;

    // Constructor que recibe el tamaño del array
    public Lbasica(int capacidad) {
        this.maxElementos = capacidad;
        this.elementos = (T[]) new Object[maxElementos]; // Inicialización genérica
    }

    // Método para agregar un elemento en una posición
    protected void setElemento(int indice, T elemento) {
        if (indice >= 0 && indice < this.maxElementos) {
            this.elementos[indice] = elemento;
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    // Método para obtener un elemento
    protected T getElemento(int indice) {
        if (indice >= 0 && indice < maxElementos) {
            return this.elementos[indice];
        }
        return null;
    }

    // Método para mostrar todos los elementos
    public void mostrarElementos() {
        for (T elemento : elementos) {
            if (elemento != null) {
                System.out.println(elemento.toString());
            }
        }
    }

    @Override
    public boolean add(T elementos) {
        if (numElementos < this.maxElementos) {
            this.elementos[numElementos] = elementos;
            numElementos++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean delete(T elemento) {
        if (numElementos == 0) {
            return false;

        }
        for (int indice = 0; indice < numElementos; indice++) {
            if (elementos[indice].equals(elemento)) {
                this.elementos[indice] = null;
                numElementos--;
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterador<T> getIterador() {
        IIterador<T> i = new IIterador<T>(elementos);
        return i;
    }

    @Override
    public int getNumElementos() {
        return numElementos;
    }

}


