package biblioteca;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la clase {@link Libro}
 * @see Libro
 */
class LibroTest {

    /**
     *  Test para comprobar que el constructor {@link Libro#Libro} con parámetros funciona correctamente.
     */
    @Test
    public void testConstructor_deberiaFuncionar_() {
        // Dado
        String titulo = "Neuromante";
        String autor = "William Gibson";
        int anioPublicacion = 1984;

        // Entonces
        Libro libro = new Libro("Neuromante","William Gibson", 1984);

        // Entonces
        assertEquals(libro.getTitulo(),titulo);
        assertEquals(libro.getAutor(),autor);
        assertEquals(libro.getAnioPublicacion(),anioPublicacion);
    }

}