package model;

/**
 * @author Aleksander Borysov Ravelo
 **/
public class Film {
    private String title;
    private int year;
    private String director;
    private Calification calification;
    private int duration;
    private int visualizations;
    private String[] actors;
    private String genre;

    public Film(String title, int year, String director, Calification calification, int duration, int visualizations, String[] actors, String genre) {
        this.actors = actors;
        this.genre = genre;
        this.title = title;
        this.year = year;
        this.director = director;
        this.calification = calification;
        this.duration = duration;
        this.visualizations = visualizations;
    }
    
    public enum Calification {
        HORRIBLE(1), BAD(2), MEDIOCRE(3), UNOPTIMAL(4), OPTIMAL(5);
        
        private final int calification;
        
        Calification(int calification){
            this.calification = calification;
        }

        public int getCalification() {
            return calification;
        }
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public Calification getCalification() {
        return calification;
    }

    public int getDuration() {
        return duration;
    }

    public int getVisualizations() {
        return visualizations;
    }

    public String getActors() {
        String result = "";
        for (int i = 0; i < actors.length; i++) {
            result += actors[i] + ",";
        }
        return result.substring(0, result.length()-1);
    }

    public String getGenre() {
        return genre;
    }
}