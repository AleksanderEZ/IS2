
package app;

import java.util.ArrayList;
import java.util.List;
import model.Film;

/*Diseñar una aplicación para navegar por un catálogo de películas.
La aplicación debe permitir organizar las películas por género, novedades, las
más vistas, las más valoradas. Cada película, además de una carátula, debe tener
un título, año, director, actores, género, calificación y duración. Representar
el diseño en UML e implementar la arquitectura en Java.*/

/**
 * @author Aleksander Borysov Ravelo
 **/
public class Main {

    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        String [] actorsMock = {"Yo", "Tu"};
        films.add(new Film("E.T.", 1982, "Steven Spielberg", Film.Calification.UNOPTIMAL, 121, 1000, actorsMock, "Fantasia"));
        films.add(new Film("Ejemplo", 1999, "Yo", Film.Calification.BAD, 90, 100, actorsMock, "Fantasia"));
        films.add(new Film("No se", 2017, "Juan", Film.Calification.MEDIOCRE, 85, 10, actorsMock, "Accion"));
        films.add(new Film("No se", 2021, "Juan", Film.Calification.MEDIOCRE, 85, 10, actorsMock, "Accion"));
        MainFrame mainFrame = new MainFrame(films);
        mainFrame.getFilmDisplay().display(films);
    }

}
