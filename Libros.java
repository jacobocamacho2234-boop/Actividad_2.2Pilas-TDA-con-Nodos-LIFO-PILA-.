/*
Gonzalez Alvarado Alexa Michelle
Leon Gamez Fernando
Camacho Guerra Jacobo
 */
package back_end;
import java.util.Objects;


public class Libros {
    private String isbn;
    private String titulo;
    private String autor;
    private String rutaImagen;
    private double precio;

    public Libros(String isbn, String titulo, String autor, double precio, String rutaImagen) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.rutaImagen= rutaImagen;
        this.precio = precio;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn == null || isbn.trim().isEmpty()) {
            throw new IllegalArgumentException("El ISBN del libro no tiene que estar estar vacío.");
        }
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
         if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El Titulo del libro no tiene que estar estar vacío.");
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
         if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("El Autor del libro no tiene que estar estar vacío.");
        }
        
        this.autor = autor;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
           if (precio <= 0) {
            throw new IllegalArgumentException("El precio del libro debe ser un número estrictamente mayor a cero.");
           }
        this.precio = precio;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Libros libros = (Libros) obj;
        return Objects.equals(isbn, libros.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return "Libros{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + '}';
    }

    
    
}
