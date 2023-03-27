import java.io.*;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class CrearMenu implements Serializable{
    public CrearMenu() {
    }

    Entrante _entrantes=new Entrante();
Primero _primeros=new Primero();
Segundo _segundos=new Segundo();
Postre _postres=new Postre();


    @Override
    public String toString() {
        return "Menu{" +
                " Entrante=" + _entrantes +'\''+
                ", Primero=" + _primeros +'\''+
                ", Segundo=" + _segundos +'\''+
                ", Postre=" + _postres +'\''+
                '}';
    }

    ArrayList<CrearMenu> menus=new ArrayList<>();
    public ArrayList<CrearMenu> creandoMenu(Object objeto,String ruta,boolean añadir){

        CrearMenu aux;
        for (int i=0; i<1;i++){// de esta manera intentaba que se me añadieran los objetos pero no logre poder mostrarlos al leer
            aux =new CrearMenu();
            aux._entrantes.getNombreEntrante();
            aux._primeros.getNombrePrimero();
            aux._segundos.getNombreSegundo();
            aux._postres.getNombrePostre();
            menus.add(aux);

        }
        FileOutputStream escrituraBytes;
        ObjectOutputStream escrituraObjeto;
        try {
            escrituraBytes=new FileOutputStream(ruta,true);
            escrituraObjeto=new ObjectOutputStream(escrituraBytes);
            escrituraObjeto.writeObject(objeto);
            escrituraObjeto.close();
            escrituraBytes.close();
        }catch (IOException e){
            e.printStackTrace();
            System.out.print("Error al añadir el menu");
        }
        return menus;
    }

    public ArrayList<CrearMenu> leermenu(String ruta,ArrayList<CrearMenu>objetos){
        FileInputStream lecturaBytes;
        ObjectInputStream lecturaObjeto;
        CrearMenu _crearmenu;
        try {
            lecturaBytes = new FileInputStream(ruta);
            lecturaObjeto = new ObjectInputStream(lecturaBytes);
            menus=(ArrayList)lecturaObjeto.readObject();
            System.out.println(menus.toString());
            lecturaObjeto.close();
            lecturaBytes.close();
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return menus;
    }
}
