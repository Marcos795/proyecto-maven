package es.vedruna;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmailValidadorAppTest {

    @Test
    void testEmailValido() {
        assertTrue(EmailValidadorApp.esEmailValido("usuario@ejemplo.com"));
    }

    @Test
    void testEmailSinArroba() {
        assertFalse(EmailValidadorApp.esEmailValido("usuario.ejemplo.com"));
    }

    @Test
    void testEmailConEspacios() {
        assertFalse(EmailValidadorApp.esEmailValido("usuario @ejemplo.com"));
    }

    @Test
    void testEmailConCaracteresEspeciales() {
        assertTrue(EmailValidadorApp.esEmailValido("nombre.apellido+extra@dominio.co"));
    }

    @Test
    void testEmailVacio() {
        assertFalse(EmailValidadorApp.esEmailValido(""));
    }

    @Test
    void testEmailNull() {
        assertFalse(EmailValidadorApp.esEmailValido(null));
    }
}
