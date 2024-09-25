package pe.edu.dps.patterns.behavioral.mediator;

public class Component {
    protected Mediator dialog;

    public Component(Mediator dialog) {
        this.dialog = dialog;
    }

    public void click() {
        dialog.notify(this, "click");
    }

    public void keypress() {
        dialog.notify(this, "keypress");
    }

    public void check() {
        dialog.notify(this, "check");
    }

}
