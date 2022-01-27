/**
 * Interfaz que define las acciones para garantizar el funcionamiento de la radio.
 * @author Diego Alexander Hernández Silvestre
 * @author Kristopher Javier Alvarado López
 */
public interface Radio {

    /**
     * Se encarga de encender o apagar la Radio
     */
    public void encenderApagar(); // Cambia el estado de encendido/apagado.

    /**
     *
     * @param numBoton El número de boton a guardar la Emisora
     * @return El listado de las emisoras
     */
    public String guardarEmisoraActual(int numBoton); // Guarda la emisora como favorita en el botón indicado (array de 12 espacios).

    /**
     *
     * @param numBoton El número de botón a seleccionar
     * @return La emisora que fue seleccionada
     */
    public String seleccionarEmisoraGuardada(int numBoton); // Reproduce la emisora guardada en uno de los 12 botones.

    /**
     *
     * @param opcion Radio AM o FM
     * @return Un dato string
     */
    public String cambiarSenal(boolean opcion); //true: AM //false: FM

    /**
     *
     * @return Se encarga de obtener el dato tipoSenal
     */
    public boolean getTipoSenal(); //true: AM //false: FM

    /**
     * Se encarga de Subir la Emisora
     */
    public void subirEmisora(); //Aumenta la emisora actual en 0.2 si la señal actual es FM, o en 10 si es AM.

    /**
     * Se encarga de bajar la Emisora
     */
    public void bajarEmisora(); //Disminuye la emisora actual en 0.2 si la señal actual es FM, o en 10 si es AM.

    /**
     *
     * @return Se encarga de retornar la Emisora AM o FM
     */
    public float getEmisoraActual(); //Obtiene la emisora en la que se encuentra el usuario.

    /**
     *
     * @return Se encarga de retornar encendido
     */
    public boolean comprobarEncendida(); //true: encendida, false: apagada.
}
