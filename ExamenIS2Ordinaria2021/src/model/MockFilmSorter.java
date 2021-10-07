package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksander Borysov Ravelo
 **/
public class MockFilmSorter implements FilmSorter{

    List<Film> films;
    
    public MockFilmSorter(List<Film> films) {
        this.films = films;
    }
    
    public List<Film> sortBy(String by){
        if (by.isEmpty()) return null;
        switch(by.toLowerCase()){
            case "new":
                return getNew();
            case "viewed":
                return getViewed();
            case "valued":
                return getValued();
            default:
                break;
        }
        if (by.startsWith("genre:")){
            return getGenre(by);
        }
        return null;
    }

    private List<Film> getNew() {
        List<Film> result = new ArrayList<>();
        for (Film film : films) {
            if(film.getYear() == LocalDate.now().getYear()){
                result.add(film);
            }
        }
        return result;
    }

    private List<Film> getViewed() {
        List<Film> result = new ArrayList<>();
        for (Film film : films) {
            if(film.getVisualizations() > 100){
                result.add(film);
            }
        }
        return result;
    }

    private List<Film> getGenre(String by) {
        List<Film> result = new ArrayList<>();
        by = by.substring(by.indexOf(":"), by.length());
        by = by.substring(1, by.length());
        System.out.println(by);
        for (Film film : films) {
            if(film.getGenre().toLowerCase().equals(by.toLowerCase())){
                result.add(film);
            }
        }
        return result;
    }

    private List<Film> getValued() {
        List<Film> result = new ArrayList<>();
        for (Film film : films) {
            if(film.getCalification().getCalification() >= 4){
                result.add(film);
            }
        }
        return result;
    }
}
