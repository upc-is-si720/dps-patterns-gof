package pe.edu.dps.patterns.behavioral.mediator;

public class Textbox extends Component {
    public Textbox(Mediator dialog) {
        super(dialog);
    }

    public void keypress() {
        dialog.notify(this, "keypress");
    }

}
