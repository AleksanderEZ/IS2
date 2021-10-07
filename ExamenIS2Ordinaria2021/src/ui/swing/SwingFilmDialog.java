package ui.swing;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import ui.FilmDialog;

/**
 * @author Aleksander Borysov Ravelo
 **/

public class SwingFilmDialog extends JPanel implements FilmDialog {
    
    String text = "";

    public SwingFilmDialog() {
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        add(textField());
    }
    
    @Override
    public String execute() {
        return text;
    }

    private JTextField textField() {
        JTextField textField = new JTextField("Usage: type(new, genre:<GENRE>, viewed, blank(home) OR valued)");
        textField.setColumns(10);
        textField.getDocument().addDocumentListener(listener());
        return textField;
    }

    private DocumentListener listener() {
        return new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                textChanged(e.getDocument());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                textChanged(e.getDocument());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                textChanged(e.getDocument());
            }

            private void textChanged(Document document) {
                try {
                    text = document.getText(0, document.getLength());
                } catch (BadLocationException ex) {
                    System.out.println("Could not reach text field value.");
                }
            }
        };
    }
}
