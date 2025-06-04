package es.vedruna;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    private final validadoremail validator = new validadoremail();

    @Test
    void testEmailValido() {
        assertTrue(validator.esEmailValido("usuario@example.com"));
    }

    @Test
    void testEmailInvalidoSinArroba() {
        assertFalse(validator.esEmailValido("usuario.example.com"));
    }

    @Test
    void testEmailInvalidoConEspacios() {
        assertFalse(validator.esEmailValido("usuario @example.com"));
    }

    @Test
    void testEmailNulo() {
        assertFalse(validator.esEmailValido(null));
    }
}
