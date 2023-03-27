public abstract class Platos implements Menu {

    //con la clase abstracta genero los atributos que van a tener comunes las diferentes clases para asi hacer un codigo mas efectivo y organizado
    //implementa de la interfaz Menu para asi tener acceso tambien a los metodos generales
    private String nombreEntrante,nombrePrimero,nombreSegundo,nombrePostre;

    private String ruta;
    private boolean añadir;


    public String getNombreEntrante() {
        return nombreEntrante;
    }

    public void setNombreEntrante(String nombreEntrante) {
        this.nombreEntrante = nombreEntrante;
    }

    public String getNombrePrimero() {
        return nombrePrimero;
    }

    public void setNombrePrimero(String nombrePrimero) {
        this.nombrePrimero = nombrePrimero;
    }

    public String getNombreSegundo() {
        return nombreSegundo;
    }

    public void setNombreSegundo(String nombreSegundo) {
        this.nombreSegundo = nombreSegundo;
    }

    public String getNombrePostre() {
        return nombrePostre;
    }

    public void setNombrePostre(String nombrePostre) {
        this.nombrePostre = nombrePostre;
    }



    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public boolean isAñadir() {
        return añadir;
    }

    public void setAñadir(boolean añadir) {
        this.añadir = añadir;
    }

}
