public class PruebaLbasica {
    public static void main(String[] args) {
        // Crear una lista básica con capacidad para 5 elementos
        Lbasica<String> lista = new Lbasica<String>(5);
        lista.add("hola");
        lista.add("adios");
        System.out.println("Elementos en la lista:");
        lista.mostrarElementos();
        lista.delete("adios");
        System.out.println("La lista despues de borrar adios queda así:");
        lista.mostrarElementos();
        System.out.println("el numero de elementos es"+lista.getNumElementos());





    }
}