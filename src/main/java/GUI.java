import java.sql.SQLOutput;
import java.util.Scanner;

public class GUI {


    public static void menu(){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {

            System.out.println("1. MOSTRAR GOLES, JUGADORES Y PARTIDOS");
            System.out.println("2. AGREGAR GOL");
            System.out.println("3. SALIR");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        Goles gol=new Goles();
                        System.out.println("Goles: ");
                        System.out.println(gol);

                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Escriba sólo números entre 1 y 3");
                }
            } catch (Exception e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
}
