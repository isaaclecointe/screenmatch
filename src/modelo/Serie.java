package modelo;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private int duracionEnMinutosPorEpisodio;

    @Override
    public int getTiempoDeDuracionEnMinutos() {
        return duracionEnMinutosPorEpisodio * episodiosPorTemporada * temporadas ;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getDuracionEnMinutosPorEpisodio() {
        return duracionEnMinutosPorEpisodio;
    }

    public void setDuracionEnMinutosPorEpisodio(int duracionEnMinutosPorEpisodio) {
        this.duracionEnMinutosPorEpisodio = duracionEnMinutosPorEpisodio;
    }

    public void muestraFichaTecnicaSerie(){
        System.out.println("****FICHA TECNICA****");
        System.out.println("Nombre del titulo: " + getNombre());
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Episodios por temporada: " + episodiosPorTemporada);
        System.out.println("Duracion en minutos por episodio: " + duracionEnMinutosPorEpisodio + " minutos");
        System.out.println("Duracion de todos los episodios: " + getTiempoDeDuracionEnMinutos() + " minutos");

    }

}
