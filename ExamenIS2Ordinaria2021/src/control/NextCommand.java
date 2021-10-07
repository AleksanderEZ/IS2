package control;

import ui.swing.SwingFilmDisplay;

/**
 * @author Aleksander Borysov Ravelo
 **/
public class NextCommand implements Command {

    SwingFilmDisplay display;
    
    public NextCommand(SwingFilmDisplay display) {
        this.display = display;
    }
    
    @Override
    public String name() {
        return "Next";
    }

    @Override
    public void execute() {
        display.next();
    }

}
