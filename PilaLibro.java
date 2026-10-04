/*
 
 */
package back_end;
import back_end.Libros;

public class PilaLibro {
    private Nodo tope;
    private int tamano;

    public PilaLibro() {
          this.tope = null;
        this.tamano = 0;

    }
     public boolean estaVacia() {
        return this.tope == null;
    }
      public int obtenerTamano() {
        return this.tamano;
    }
    public void apilar(Libros libros) {
        if (libros == null) {
            throw new IllegalArgumentException("No se puede apilar un objeto Libro nulo.");
        }
        Nodo nuevoNodo = new Nodo(libros);
        nuevoNodo.setSiguiente(this.tope);
        this.tope = nuevoNodo;
        this.tamano++;
    }
     public Libros desapilar() {
        if (estaVacia()) {
            throw new IllegalStateException("Imposible desapilar: La pila de libros está vacía.");
        }
        Libros libroExtraido = this.tope.getDato();
        this.tope = this.tope.getSiguiente();
        this.tamano--;
        return libroExtraido;
    }
      public Libros obtenerTope() {
        if (estaVacia()) {
            throw new IllegalStateException("Imposible obtener el tope: La pila de libros está vacía.");
        }
        return this.tope.getDato();
    }
      
    public void limpiar() {
        this.tope = null;
        this.tamano = 0;
    }
    public Nodo getTope() {
    return this.tope;
}
}
