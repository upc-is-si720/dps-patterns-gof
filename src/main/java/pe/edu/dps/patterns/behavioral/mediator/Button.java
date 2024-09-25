package pe.edu.dps.patterns.behavioral.mediator;

public class Button extends Component {
    public Button(Mediator dialog) {
        super(dialog);
    }

    public void click() {
        dialog.notify(this, "click");
    }

}
