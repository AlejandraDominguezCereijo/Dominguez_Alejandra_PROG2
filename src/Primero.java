import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Primero extends Platos{
    String[]array_primero={"Ensalada_tomate","Ensalada_cesar","Gambas","Brochetas_pollo"};

    @Override
    public String elegir_plato() {
        Random aleatorioPrimero = new Random();
        int primero_aleatorio = aleatorioPrimero.nextInt(array_primero.length);
        setNombrePrimero(array_primero[primero_aleatorio]);
        return getNombrePrimero();
    }

    @Override
    public String escritura_plato(String ruta, boolean añadir) {
        FileWriter escritura;
        try {
            escritura=new FileWriter(ruta,false);
            escritura.write("Primero plato "+getNombrePrimero());
            escritura.close();
            //System.out.println("Primero añadido correctamente");
        }catch (IOException e){
            System.out.println(e.toString());
            System.out.println("Error al añadir el primero");

        }
        return getNombrePrimero();

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
