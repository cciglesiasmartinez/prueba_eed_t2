package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la clase {@link Biblioteca}
 * @see Biblioteca
 */

class BibliotecaTest {

    private Biblioteca biblioteca;
    private Libro libro;

    @BeforeEach
    public void setUp() {
        biblioteca = new Biblioteca();
        libro = new Libro("Neuromante", "William Gibson", 1984);
    }

    @Test
    void agregarLibro() {
        // Dado
        boolean resultado = biblioteca.agregarLibro(libro);
        // Entonces
        assertTrue(resultado, "Libro agregado con éxito.");
        assertTrue(biblioteca.getLibros().contains(libro), "La biblioteca contiene el libro agregado.");
    }

    @Test
    void eliminarLibro() {
        // Dado
        boolean libroAnadido = biblioteca.agregarLibro(libro);
        // Cuando
        boolean resultado = biblioteca.eliminarLibro(libro);
        // Entonces
        assertFalse(biblioteca.getLibros().contains(libro));
    }


    /**
     * Test para verificar que el método encuentraLibroPorTitulo devuelve null
     * si no encuentra un libro con el título dado.
     */
    @Test
    public void testEncuentraLibroPorTitulo_NoExistente() {
        // Cuando
        Libro libroEncontrado = biblioteca.encuentraLibroPorTitulo("Conde Cero");
        // Entonces
        assertNull(libroEncontrado);
    }
}