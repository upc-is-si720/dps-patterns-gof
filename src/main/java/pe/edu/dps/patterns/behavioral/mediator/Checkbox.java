package pe.edu.dps.patterns.behavioral.mediator;

public class Checkbox extends Component {
    private boolean checked;

    public Checkbox(Mediator dialog) {
        super(dialog);
        this.checked = false;
    }
    public void check() {
        checked = !checked;
        dialog.notify(this, "check");
    }
    public boolean isChecked() {
        return checked;
    }

}
