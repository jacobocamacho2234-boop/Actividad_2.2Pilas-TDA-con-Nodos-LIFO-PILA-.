/*
 
 */
package back_end;
import back_end.Libros;
/*
 */
public class Nodo {
    private Libros dato;   
    private Nodo siguiente;

    public Nodo(Libros dato) {
        this.dato = dato;
    }

    public Libros getDato() {
        return dato;
    }

    public void setDato(Libros dato) {
          if (dato == null) {
            throw new IllegalArgumentException("El nodo no puede contener un objeto Libro nulo.");
          }
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
