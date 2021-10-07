package control;

import ui.swing.SwingFilmDisplay;

/**
 * @author Aleksander Borysov Ravelo
 **/
public class PrevCommand implements Command {

    SwingFilmDisplay display;
    
    public PrevCommand(SwingFilmDisplay display) {
        this.display = display;
    }
    
    @Override
    public String name() {
        return "Prev";
    }

    @Override
    public void execute() {
        display.prev();
    }

}
