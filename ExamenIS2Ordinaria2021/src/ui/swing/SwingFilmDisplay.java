package ui.swing;

import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.Film;
import persistence.MockImageLoader;
import ui.FilmDisplay;

/**
 * @author Aleksander Borysov Ravelo
 **/
public class SwingFilmDisplay extends JPanel implements FilmDisplay {

    private List<Film> films = new ArrayList<>();
    private int currentFilm = 0;

    public SwingFilmDisplay() {
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    }

    @Override
    public void display(List<Film> films) {
        this.films = films;
        currentFilm = 0;
        update();
    }

    public void next(){
        if(currentFilm >= films.size()-1) return;
        currentFilm++;
        update();
    }
    
    public void prev(){
        if(currentFilm <= 0) return;
        currentFilm--;
        update();
    }
    
    private void update(){
        if(films == null || films.isEmpty()){
            System.out.println("No se han encontrado resultados");
            setVisible(false);
            this.removeAll();
            setVisible(true);
            this.updateUI();
            return;
        }
        setVisible(false);
        this.removeAll();
        add(filmData());
        add(filmImage());
        setVisible(true);
        this.updateUI();
    }
    
    private JPanel filmData() {
        JPanel data = new JPanel();
        data.setLayout(new BoxLayout(data, BoxLayout.PAGE_AXIS));
        data.add(new JLabel("Title: " + 
                films.get(currentFilm).getTitle()));
        data.add(new JLabel("Year: " + 
                Integer.toString(films.get(currentFilm).getYear())));
        data.add(new JLabel("Director: " + 
                films.get(currentFilm).getDirector()));
        data.add(new JLabel("Calification: " + 
                Integer.toString(films.get(currentFilm).getCalification().getCalification())));
        data.add(new JLabel("Duration (m): " + 
                Integer.toString(films.get(currentFilm).getDuration())));
        data.add(new JLabel("Views (M): " + 
                Integer.toString(films.get(currentFilm).getVisualizations())));
        data.add(new JLabel("Cast: " + 
                films.get(currentFilm).getActors()));
        data.add(new JLabel("Genre: " + 
                films.get(currentFilm).getGenre()));
        return data;
    }

    private JLabel filmImage() {
        JLabel data = new JLabel(new MockImageLoader().load(films.get(currentFilm)));
        return data;
    }
}
