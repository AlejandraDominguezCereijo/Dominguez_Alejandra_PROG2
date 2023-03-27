import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Segundo extends Platos{
    String[]array_segundo={"Bacalao_horno","Chuleton_vaca","Lasaña_espinacas","Paella"};

    @Override
    public String elegir_plato() {
        Random aleatorioSegundo = new Random();
        int segundo_aleatorio = aleatorioSegundo.nextInt(array_segundo.length);
        setNombreSegundo(array_segundo[segundo_aleatorio]);
        return getNombreSegundo();
    }

    @Override
    public String escritura_plato(String ruta, boolean añadir) {
        FileWriter escritura;
        try {
            escritura=new FileWriter(ruta,false);
            escritura.write("Segundo plato "+getNombreSegundo());
            escritura.close();
            //System.out.println("Segundo añadido correctamente");
        }catch (IOException e){
            System.out.println(e.toString());
            System.out.println("Error al añadir el segundo");

        }
        return getNombreSegundo();
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
