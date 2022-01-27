public class Controlador implements Radio{

    private boolean encendido; // Determina el estado de la radio, true (encendido) y false (apagado).
    private boolean tipoSenal; //(True si es AM y False si es FM)
    private float AMactual;
    private float FMactual;
    private String[] emisorasGuardadas = new String[12];
    private int numBoton;

    public Controlador(boolean encendido, boolean tipoSenal, float AMactual, float FMactual, String[] emisorasGuardadas, int numBoton) {
        this.encendido = encendido;
        this.tipoSenal = tipoSenal;
        this.AMactual = AMactual;
        this.FMactual = FMactual;
        this.emisorasGuardadas = emisorasGuardadas;
        this.numBoton = numBoton;
    }

    public Controlador() {
        this.encendido = false;
        this.tipoSenal = false;
        this.AMactual = 0;
        this.FMactual = 0;
    }

    @Override
    public void encenderApagar() {
        if (this.encendido){
            this.encendido=false;
        } else {
            this.encendido=true;
        }
    }

    @Override
    public String guardarEmisoraActual(int numBoton) {
        return null;
    }

    @Override
    public String seleccionarEmisoraGuardada(int numBoton) {
        return null;
    }

    @Override
    public String camiarSenal(boolean opcion) {
        return null;
    }

    @Override
    public boolean getTipoSenal() {
        return false;
    }

    @Override
    public void subirEmisora() {

    }

    @Override
    public void bajarEmisora() {

    }

    @Override
    public float getEmisoraActual() {
        return 0;
    }

    @Override
    public boolean comprobarEncendida() {
        return this.encendido;
    }
}
