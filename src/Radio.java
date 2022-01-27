public interface Radio {
    public void encenderApagar(); // Cambia el estado de encendido/apagado.
    public String guardarEmisoraActual(int numBoton); // Guarda la emisora como favorita en el botón indicado (array de 12 espacios).
    public String seleccionarEmisoraGuardada(int numBoton); // Reproduce la emisora guardada en uno de los 12 botones.
    public String cambiarSenal(boolean opcion); //true: AM //false: FM
    public boolean getTipoSenal(); //true: AM //false: FM
    public void subirEmisora(); //Aumenta la emisora actual en 0.2 si la señal actual es FM, o en 10 si es AM.
    public void bajarEmisora(); //Disminuye la emisora actual en 0.2 si la señal actual es FM, o en 10 si es AM.
    public float getEmisoraActual(); //Obtiene la emisora en la que se encuentra el usuario.
    public boolean comprobarEncendida(); //true: encendida, false: apagada.
}
