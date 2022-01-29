import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControladorTest {

    Controlador c = new Controlador();

    @Test
    @org.junit.jupiter.api.Test
    void testEncenderApagar() {
    }

    @org.junit.jupiter.api.Test
    void guardarEmisoraActual() {
        String resultado = c.guardarEmisoraActual(1);
        String esperado = "[1] 87.9\n" + "[2] ESPACIO VACIO\n" + "[3] ESPACIO VACIO\n" + "[4] ESPACIO VACIO\n" +"[5] ESPACIO VACIO\n" +"[6] ESPACIO VACIO\n" +"[7] ESPACIO VACIO\n" +"[8] ESPACIO VACIO\n" +"[9] ESPACIO VACIO\n" +
                "[10] ESPACIO VACIO\n" + "[11] ESPACIO VACIO\n" +"[12] ESPACIO VACIO\n";
        assertEquals(esperado, resultado);
    }

    @org.junit.jupiter.api.Test
    void seleccionarEmisoraGuardada() {
    }

    @org.junit.jupiter.api.Test
    void cambiarSenal() {
        String resultado = c.cambiarSenal(false);
        String esperado = "Ha cambiado a Radio AM";
        assertEquals(esperado, resultado);
    }

    @org.junit.jupiter.api.Test
    void getTipoSenal() {
        boolean resultado = c.getTipoSenal();
        assertFalse(resultado);
    }

    @org.junit.jupiter.api.Test
    void subirEmisora() {
    }

    @org.junit.jupiter.api.Test
    void bajarEmisora() {
    }

    @org.junit.jupiter.api.Test
    void getEmisoraActual() {
        float resultado = c.getEmisoraActual();
        float esperado = (float) 87.9;
        assertEquals(esperado, resultado);
    }

    @org.junit.jupiter.api.Test
    void comprobarEncendida() {
    }
}