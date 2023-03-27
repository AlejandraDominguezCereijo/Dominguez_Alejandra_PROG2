import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<CrearMenu> menus=new ArrayList<>();
        Scanner cubrir = new Scanner(System.in);
        Entrante _entrante = new Entrante();//Aqui instancio cada una de las clases para asi poder acceder a ellas
        Primero _primero = new Primero();
        Segundo _segundo = new Segundo();
        Postre _postre = new Postre();
        CrearMenu _crearMenu=new CrearMenu();
        boolean menuguardado=false;

        int salir = 1;
        do {
            System.out.println("¿Quieres conocer tu menu? \n1 Si, muestramelo \n2 No, gracias");
            int menu = cubrir.nextInt();
            switch (menu) {
                case 1:
                    _entrante.elegir_plato();
                    _primero.elegir_plato();
                    _segundo.elegir_plato();
                    _postre.elegir_plato();
                    _entrante.escritura_plato("entrantes.txt", true);
                    _primero.escritura_plato("primero.txt", true);
                    _segundo.escritura_plato( "segundos.txt", true);
                    _postre.escritura_plato("postres.txt", true);
                    System.out.println("Tu menu es el siguiente:");
                    _entrante.lectura_plato("entrantes.txt");
                    _primero.lectura_plato("primero.txt");
                    _segundo.lectura_plato("segundos.txt");
                    _postre.lectura_plato("postres.txt");

                    int gurdarMenu=1;
                    do {
                        System.out.println("¿Te gusta este menu? \n1 Si, guarmelo \n2 No,muestrame otra opcion de menu");
                        int consulta = cubrir.nextInt();
                        switch (consulta){
                            case 1:
                                _crearMenu.creandoMenu(menus,"menu.txt",true);
                                _crearMenu.leermenu("menu.txt",menus);
                                System.out.println("Menu guardado");
                                menuguardado=true;
                                int generar=1;
                                do {
                                    System.out.println("¿Quieres visualizar el menu? \n1 Si, muestramelo \n2 No,muestrame uno nuevo");
                                    int respuesta= cubrir.nextInt();
                                    switch (respuesta){
                                        case 1:
                                            System.out.println("Tu menu es el siguiente:");
                                            _entrante.lectura_plato("entrantes.txt");
                                            _primero.lectura_plato("primero.txt");
                                            _segundo.lectura_plato("segundos.txt");
                                            _postre.lectura_plato("postres.txt");
                                            break;
                                        case 2:
                                            if (menuguardado==true){
                                                System.out.println("¿Estas seguro de que quieres eliminar el menu anterior? \n1 Si \n2 No");
                                                int eliminarMenu = cubrir.nextInt();
                                                if (eliminarMenu==1){
                                                    System.out.println("El menu ha sido eliminado");
                                                }
                                            }
                                            generar=0;
                                            break;

                                    }

                                }while (generar!=0);
                                break;
                            case 2:
                                gurdarMenu=0;
                                break;
                        }
                    }while (gurdarMenu!=0);
                    break;
                case 2:
                    System.out.println("Hasta pronto");
                    salir = 0;
                    break;

            }

        } while (salir != 0);





    }

}
