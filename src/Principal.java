import modelo.Pelicula;
import modelo.PeliculaOSerie;

import java.util.Scanner;

public class Principal extends PeliculaOSerie {

    // Meotodo para Mostrar el Menu y elejir la opciones

    public void muestraElMenu(){

        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while(opcion != 9){
            String menu = """
                   Bienvenido a screenmatch
                   1) Registrar nueva Pelicula
                   2) Registrar nueva Serie
                   3) Calcular Maraton de Peliculas
                   4) Calcular Maraton de Series
                   
                   9) Salir
                   """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    IngresaPelicula();
                    break;
                case 2:
                    IngreseSerie();
                    break;
                case 3:
                       Maratonear();
                    break;

                case 4:
                       MaratonearSerie();
                    break;

                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                    default:
                    System.out.println("Opcion no valida");

            }
        }
    }
}
