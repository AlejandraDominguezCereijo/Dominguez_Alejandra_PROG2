import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Entrante extends Platos {

    String[] array_entrante = {"Patatas_normales", "Patatas_gajo", "Nachos", "Tabla_quesos"};
    public Entrante() {
    }

    public Entrante(String[] array_entrante) {
        this.array_entrante = array_entrante;
    }

    public String[] getArray_entrante() {
        return array_entrante;
    }

    public void setArray_entrante(String[] array_entrante) {
        this.array_entrante = array_entrante;
    }

    @Override
    public String elegir_plato() {

        Random aleatorioEntrante = new Random();//con este Random seleccionamos uno de los platos disponibles en el array de entrantes y realizo el mismo proceso en las distintas clases
        int entrante_aleatorio = aleatorioEntrante.nextInt(array_entrante.length);

       setNombreEntrante(array_entrante[entrante_aleatorio]);

        return getNombreEntrante();
    }

    @Override
    public String escritura_plato(String ruta, boolean añadir) {
        FileWriter escritura;
        try {
            escritura=new FileWriter(ruta, false);//Dejando este boolean false hacemos que el archivo se sobreescriba en caso de que quisieramos que los datos se guardaran cada vez que ejecutamos el programa tendriamos que marcarlo como true
            escritura.write("Entrante "+getNombreEntrante()+" Precio ");
            escritura.close();
           // System.out.println("Entrante añadido correctamente");
        }catch (IOException e){
            System.out.println(e.toString());
            System.out.println("Error al añadir el entrante");

        }
        return getNombreEntrante();
    }
    @Override
    public String lectura_plato(String ruta) {
        FileReader lector;
        try{
            lector=new FileReader(ruta);
            int caracter= lector.read();
            while (caracter!=-1){
                char leer= (char) caracter;
                System.out.print(leer);
                caracter=lector.read();
            }
            System.out.println("");
            lector.close();
        }catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error en la lectura");
        }
        return "";
    }




}
