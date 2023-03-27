import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Postre extends Platos{
    String[]array_postre={"Tarta_zanahoria","Coulant_chocolate","Helado","Sorbete_limon"};
    @Override
    public String elegir_plato() {
        Random aleatorioPostre = new Random();
        int postre_aleatorio = aleatorioPostre.nextInt(array_postre.length);
        setNombrePostre(array_postre[postre_aleatorio]);
        return getNombrePostre();
    }

    @Override
    public String escritura_plato(String ruta, boolean añadir) {
        FileWriter escritura;
        try {
            escritura=new FileWriter(ruta,false);
            escritura.write("Postre "+getNombrePostre());
            escritura.close();
            //System.out.println("Postre añadido correctamente");
        }catch (IOException e){
            System.out.println(e.toString());
            System.out.println("Error al añadir el postre");

        }
        return getNombrePostre();
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
