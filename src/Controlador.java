/**
 * Clase controladora que permite realizar las acciones para garantizar el funcionamiento de la radio.
 * @author Diego Alexander Hernández Silvestre
 * @author Kristopher Javier Alvarado López
 */

public class Controlador implements Radio{
    /**
     * Se crean las variables que se van a utilizar para el controlador
     */
    private boolean encendido;
    private boolean tipoSenal;
    private float AMactual;
    private float FMactual;
    private String[] emisorasGuardadas = new String[12];

    /**
     *
     * @param encendido Determina el estado de la radio, true (encendido) y false (apagado).
     * @param tipoSenal (True si es AM y False si es FM)
     * @param AMactual Se guarda el valor de la Emisora AM
     * @param FMactual Se guarda el valor de la Emisora FM
     * @param emisorasGuardadas Guarda la lista de las Emisoras que fueron guardadas
     */
    public Controlador(boolean encendido, boolean tipoSenal, float AMactual, float FMactual, String[] emisorasGuardadas) {
        this.encendido = encendido;
        this.tipoSenal = tipoSenal;
        this.AMactual = AMactual;
        this.FMactual = FMactual;
        this.emisorasGuardadas = emisorasGuardadas;
    }

    /**
     * Se crea el constructor Controlador, en donde se asignan los valores de las Emisoras AM y FM
     */
    public Controlador() {
        this.encendido = false;
        AMactual = (float) 530;
        FMactual = (float) 87.9;
    }

    /**
     * Se encarga de encender o apagar la Radio
     */
    @Override
    public void encenderApagar() {
        this.encendido= !this.encendido;
    }

    /**
     *
     * @param numBoton El número de boton a guardar la Emisora
     * @return El listado de las emisoras
     */
    @Override
    public String guardarEmisoraActual(int numBoton) {
        String listado = "";
        int contador = 0;
        if(tipoSenal){
            emisorasGuardadas[numBoton-1] = Float.toString(AMactual);
            for(int i=0;i<emisorasGuardadas.length;i++){
                    contador +=1;
                    if(emisorasGuardadas[i]==null){
                        listado += "["+contador+"] ESPACIO VACIO\n";
                    }else{
                        listado += "["+contador+"] "+emisorasGuardadas[i]+ "\n";
                    }
            }
            return listado;
        }else {
            emisorasGuardadas[numBoton-1] = Float.toString(FMactual);
            for(int i=0;i<emisorasGuardadas.length;i++){

                contador +=1;
                if(emisorasGuardadas[i]==null){
                    listado += "["+contador+"] ESPACIO VACIO\n";
                }else{
                    listado += "["+contador+"] "+emisorasGuardadas[i]+ "\n";
                }
            }
            return listado;
        }
    }

    /**
     *
     * @param numBoton El número de botón a seleccionar
     * @return La emisora que fue seleccionada
     */
    @Override
    public String seleccionarEmisoraGuardada(int numBoton) {
        String resultado = "";
        if (emisorasGuardadas[numBoton - 1] == null){
            resultado += "¡ESPACIO VACIO!";
        } else {
            float emisora = Float.parseFloat(emisorasGuardadas[numBoton-1]);
            if (emisora>= (float) 87.9 && emisora <= (float) 107.9 && this.tipoSenal){
                this.tipoSenal = false;
                this.FMactual = emisora;
                resultado += "Emisora seleccionada: " + Float.toString(FMactual);
            } else if (emisora>= (float) 530 && emisora <= (float)1610 && !this.tipoSenal){
                this.tipoSenal = true;
                this.AMactual = emisora;
                resultado += "Emisora seleccionada: " + Float.toString(AMactual);
            } else if (emisora>= (float) 87.9 && emisora <= (float)107.9 && !this.tipoSenal){
                this.FMactual = emisora;
                resultado += "Emisora seleccionada: " + Float.toString(FMactual);
            } else if (emisora>= (float)530 && emisora <= (float)1610 && this.tipoSenal){
                this.AMactual = emisora;
                resultado+= "Emisora seleccionada: " + Float.toString(AMactual);
            }
        }
        return resultado;
    }

    /**
     *
     * @param opcion Radio AM o FM
     * @return Un dato string
     */
    @Override
    public String cambiarSenal(boolean opcion) {
        this.tipoSenal = !opcion;
        if(this.tipoSenal){
            return "Ha cambiado a Radio AM";
        } else {
            return "Ha cambiado a Radio FM";
        }
    }

    /**
     *
     * @return Se encarga de obtener el dato tipoSenal
     */
    @Override
    public boolean getTipoSenal() {
        return this.tipoSenal;
    }

    /**
     * Se encarga de Subir la Emisora
     */
    @Override
    public void subirEmisora() {
        if(this.tipoSenal) {
            if (AMactual==(float) 1610){
               this.AMactual = (float) 530;
            } else {
                AMactual += (float) 10;
            }
        }else{
            if (FMactual==(float) 107.9){
                this.FMactual= (float)87.9;
            } else {
                FMactual += (float) 0.2;
            }
        }
    }

    /**
     * Se encarga de bajar la Emisora
     */
    @Override
    public void bajarEmisora() {
        if(this.tipoSenal) {
            if (AMactual==(float) 530){
                this.AMactual=(float) 1610;
            } else {
                AMactual -=(float) 10;
            }
        }else{
            if (FMactual==(float) 87.9){
                this.FMactual= (float)107.9;
            } else {
                FMactual -= (float) 0.2;
            }
        }
    }

    /**
     *
     * @return Se encarga de retornar la Emisora AM o FM
     */
    @Override
    public float getEmisoraActual() {
        if(this.tipoSenal){
            return this.AMactual;
        }else{
            return this.FMactual;
        }
    }

    /**
     *
     * @return Se encarga de retornar encendido
     */
    @Override
    public boolean comprobarEncendida() {
        return this.encendido;
    }
}
