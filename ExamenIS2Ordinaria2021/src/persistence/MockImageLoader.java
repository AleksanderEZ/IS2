package persistence;

import model.Film;

/**
 * @author Aleksander Borysov Ravelo
 **/
public class MockImageLoader implements ImageLoader{

    @Override
    public String load(Film film) {
        return "Mock image: " + film.getTitle() + ".jpg";
    }

}
