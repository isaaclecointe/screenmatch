package modelo;

public class Titulo {

    private String nombre;
    private int fechaDeLanzamiento;
    private double evaluacion;
    private boolean incluidoEnPlanBasico;
    private String sinopsis;
    private int tiempoDeDuracionEnMinutos;
    private int tiempoLibre;



    public int getTiempoLibre() {
        return tiempoLibre;
    }

    public void setTiempoLibre(int tiempoLibre) {
        this.tiempoLibre = tiempoLibre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public double getEvaluacion() {
        return evaluacion;
    }


    public boolean isIncluidoEnPlanBasico() {
        return incluidoEnPlanBasico;
    }

    public void setIncluidoEnPlanBasico(boolean incluidoEnPlanBasico) {
        this.incluidoEnPlanBasico = incluidoEnPlanBasico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getTiempoDeDuracionEnMinutos() {
        return tiempoDeDuracionEnMinutos;
    }

    public void setTiempoDeDuracionEnMinutos(int tiempoDeDuracionEnMinutos) {
        this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
    }

    public void muestraFichaTecnica(){
        System.out.println("****FICHA TECNICA****");
        System.out.println("Nombre del titulo: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Tiempo de Duracion: " + getTiempoDeDuracionEnMinutos() + " minutos");

    }




}
