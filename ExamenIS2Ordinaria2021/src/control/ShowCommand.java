package control;

import java.util.List;
import model.Film;
import ui.swing.SwingFilmDialog;
import ui.swing.SwingFilmDisplay;
import model.MockFilmSorter;

/**
 * @author Aleksander Borysov Ravelo
 **/
public class ShowCommand implements Command {

    SwingFilmDisplay display;
    SwingFilmDialog dialog;
    private List<Film> list;
    private List<Film> currentList;
    
    public ShowCommand(SwingFilmDisplay display, SwingFilmDialog dialog, List<Film> list) {
        this.display = display;
        this.dialog = dialog;
        this.list = list;
    }
    
    @Override
    public String name() {
        return "Show";
    }

    @Override
    public void execute() {
        String search = dialog.execute();
        if(search.isEmpty() || search.isBlank()){
            display.display(list);
            return;
        }
        else currentList = new MockFilmSorter(list).sortBy(search);
        display.display(currentList);
    }
    
}
