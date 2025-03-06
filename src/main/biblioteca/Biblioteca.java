package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase gestiona los objetos de tipo Biblioteca que son básicamente un {@link ArrayList} con elementos
 * de tipo {@link Libro}. La clase contiene un único atributo {@link Biblioteca#libros}.
 *
 * @author Casandra
 * @author Luis
 * @version 2.0
 */

public class Biblioteca {

    // TODO: Documentar estos atributos
    /**
     * Una lista no modificable compatible con la interfaz {@link List} que contendrá elementos de
     * tipo {@link Libro}
     */
    private final List<Libro> libros;

    // TODO: Documentar este método
    /**
     * El constructor sin parámetros de la clase. Este constructor crea una lista vacía de tipo ArrayList
     * y tipo de elemento sin especificar en el atributo libros {@link Biblioteca#libros}.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // TODO: Documentar este método.
    //  Test: NO HAY QUE TESTEAR ESTE METODO
    /**
     * El constructor con parámetros de la clase. Este constructor emplea un único parámetro que será una lista
     * genérica con elementos de tipo {@link Libro}
     *
     * @param libros Un objeto compatible con la interfaz {@link List} y elementos del tipo Libro {@link Libro}
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    // TODO: Documentar este método

    /**
     * Método público de tipo getter cuyo propósito es obtener el atributo {@link Biblioteca#libros}
     * de uno bjeto de tipo {@link Biblioteca}
     * Este método nos devuelve la lista de {@link Libro} contenida en el objeto {@link Biblioteca}.
     *
     * @return Devuelve el atributo {@link Biblioteca#libros}.
     */
    public List<Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.

    /**
     * Este método encuentra objetos {@link Libro} por su título.
     * Se recorre el ArrayList {@link Biblioteca#libros} hasta encontrar una coincidencia con el {@link String}
     * título y se retorna. Si no se encuentra nada se devuelve null.
     *
     * @param titulo Parámetro de tipo {@link String} que actúa como título del libro.
     * @return Se devuelve un objeto de tipo {@link Libro} si hay coincidencia. En caso contrario,
     * se devuelve null.
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo.
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo
    /**
     * Este método encuentra objetos {@link Libro} por su atributo autor. Este método recorre el
     * ArrayList {@link Biblioteca#libros} hasta encontrar una coincidencia. Actualmente este método
     * está obsoleto y se ha sustituido por {@link Biblioteca#encuentraLibrosPorAutor(String)}.
     *
     * @param autor Un {@link String} que contiene el autor del libro a buscar.
     * @return Devuelve un objeto tipo {@link Libro} si hay coincidencia. En caso contrario devuelve null.
     * @deprecated
     */
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente
    /**
     * Este método encuentra objetos {@link Libro} por su autor y devuelve una {@link List}
     * de elementos de tipo {@link Libro} con las coincidencias encontradas.
     *
     * @param autor Un {@link String} con el autor del {@link Libro}.
     * @return Devuelve una {@link ArrayList} con las coincidencias de tipo {@link Libro}. En caso de no
     * haber coincidencias devuelve una referencia "vacía" (null).
     * @since 2.0
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
