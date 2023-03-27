import java.util.ArrayList;

public interface Menu {
    //con la interfaz creo los metodos generales que posteriormente usare en las diferentes clases implementadola en la clase abstracta Platos

    public static final Coste PRECIO = Coste.BROCHETA_POLLO;
    public String elegir_plato();

    public String escritura_plato(String ruta, boolean añadir);

    public String lectura_plato(String ruta);


}
