package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaOSerie  extends Titulo{

    Scanner teclado = new Scanner(System.in);
    int opcion = 0;

    // Metodo que Ingresa una pelicula

    public void IngresaPelicula (){

        System.out.println("Ingrese el nombre de la pelicula");
        String nombre =  teclado.nextLine();
        System.out.println("Ingrese el año de lanzamiento de la pelicula");
        int fechaDeLanzamiento = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese la duracion en minutos de la pelicula");
        int duracionEnMinutos = teclado.nextInt();
        teclado.nextLine();
        Pelicula peliculaUsuario = new Pelicula();
        peliculaUsuario.setNombre(nombre);
        peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
        peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
        peliculaUsuario.muestraFichaTecnica();
    }


    //Metodo que ingresa una serie

    public  void IngreseSerie(){

        System.out.println("Ingrese el nombre de la Serie");
        String nombre =  teclado.nextLine();
        System.out.println("Ingrese el numero de temporadas");
        int temporadas = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese los episodios por temporada");
        int episodiosPorTemporada = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese la duracion en minutos por episodio");
        int duracionEnMinutosPorEpisodio= teclado.nextInt();
        teclado.nextLine();
        Serie SerieUsuario = new Serie();
        SerieUsuario.setNombre(nombre);
        SerieUsuario.setTemporadas(temporadas);
        SerieUsuario.setEpisodiosPorTemporada(episodiosPorTemporada);
        SerieUsuario.setDuracionEnMinutosPorEpisodio(duracionEnMinutosPorEpisodio);
        SerieUsuario.muestraFichaTecnicaSerie();
    }

// Metodo Para cacular una Maraton de 3 Peliculas

    public void Maratonear() {

        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
        int i = 0;
        Pelicula maratonPelicula = null;
        while (i < 3) {
            System.out.println("Ingrese el nombre de la peliculas: " + (i + 1) + " para maratonear");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese la duracion de la pelicula");
            int tiempoDeDuracionEnMinutos = teclado.nextInt();
            teclado.nextLine();
            i++;

            maratonPelicula = new Pelicula();
            maratonPelicula.setNombre(nombre);
            maratonPelicula.setTiempoDeDuracionEnMinutos(tiempoDeDuracionEnMinutos);
            listaPeliculas.add(maratonPelicula);

        }
        System.out.println("Ingresa cunato tiempo libre tienes en el dia");
        int tiempoLibre = teclado.nextInt();
        teclado.nextLine();

        int duracionTotal = 0;
        for (Pelicula pelicula : listaPeliculas){
            duracionTotal += pelicula.getTiempoDeDuracionEnMinutos();
        }

        int diasParaMaraton = duracionTotal / tiempoLibre;
        System.out.println("**** MARATON DE PELICULAS****");
        for(Pelicula pelicula : listaPeliculas){   // Aplicar un for
            System.out.println("Nombre de la pelicula: " + pelicula.getNombre());
            System.out.println("Duracion en minutos: " + pelicula.getTiempoDeDuracionEnMinutos() + " minutos");

        }

        System.out.println("Para ver estas peliculas necesitaras: " + diasParaMaraton + " dias");

    }


    //Metodo para calcular una Maraton de una Serie

  public void MaratonearSerie(){

      System.out.println("Ingrese el nombre de la Serie");
      String nombre =  teclado.nextLine();
      System.out.println("Ingrese el numero de temporadas");
      int temporadas = teclado.nextInt();
      teclado.nextLine();
      System.out.println("Ingrese los episodios por temporada");
      int episodiosPorTemporada = teclado.nextInt();
      teclado.nextLine();
      System.out.println("Ingrese la duracion en minutos por episodio");
      int duracionEnMinutosPorEpisodio= teclado.nextInt();
      teclado.nextLine();
      System.out.println("Ingresa cunato tiempo libre tienes en el dia");
      int tiempoLibre = teclado.nextInt();
      teclado.nextLine();


      int tiempoTotalSerie = duracionEnMinutosPorEpisodio * episodiosPorTemporada * temporadas / tiempoLibre;

         Serie maratonSerie = new Serie();
          maratonSerie.setNombre(nombre);
          maratonSerie.setTemporadas(temporadas);
          maratonSerie.setEpisodiosPorTemporada(episodiosPorTemporada);
          maratonSerie.setDuracionEnMinutosPorEpisodio(duracionEnMinutosPorEpisodio);


      System.out.println("**** MARATON DE PELICULAS****");
          System.out.println("Nombre de la pelicula: " + maratonSerie.getNombre());
          System.out.println("Para maratonear esta serie te llevarias: " + tiempoTotalSerie + " dias");


  }
  }



