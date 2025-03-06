package biblioteca;

import java.util.ArrayList;

/**
 * Esta clase gestiona los objetos de tipo Libro.
 *
 * @author Casandra
 * @author Luis
 * @version 2.0
 */

public class Libro {

    // TODO: Documentar estos atributos
    /**
     * Un {@link String} que contendrá el título de un libro.
     */
    private String titulo;
    /**
     * Un {@link String} que contendrá el autor de un libro.
     */
    private String autor;
    /**
     * Un entero que será el año de publicación de un libro.
     */
    private int anioPublicacion;


    // TODO: Documentar este método
    // TODO: Testear este método
    /**
     * Constructor con parámetros.
     * @param titulo El título del libro en formato {@link String}
     * @param autor El autor del libro en formato {@link String}
     * @param anioPublicacion El año de publciación del libro en formato entero (int).
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // TODO: Documentar este método
    /**
     * Un getter para devolver el {@link Libro#autor}.
     * @return El atributo autor del objeto (tipo {@link String}.
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // TODO: Documentar este método
    /**
     * Un getter para devolver el año de publicación de un libro.
     * @return El atributo anioPublicacion del objeto (número entero, int).
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
