package pe.edu.dps.patterns.behavioral.mediator;

public class AuthenticationDialog implements Mediator {
    private String title;
    private Checkbox loginOrRegisterChkBx;
    private Textbox loginUsername, loginPassword;
    private Textbox registrationUsername, registrationPassword, registrationEmail;
    private Button okBtn, cancelBtn;

    public AuthenticationDialog() {
        this.title = "";
        this.loginOrRegisterChkBx = new Checkbox(this);
        this.loginUsername = new Textbox(this);
        this.loginPassword = new Textbox(this);
        this.registrationUsername = new Textbox(this);
        this.registrationPassword = new Textbox(this);
        this.registrationEmail = new Textbox(this);
        this.okBtn = new Button(this);
        this.cancelBtn = new Button(this);
    }

    public void notify(Component sender, String event) {
        if (sender == loginOrRegisterChkBx && event.equals("check")) {
            if (loginOrRegisterChkBx.isChecked()) {
                this.title = "Log in";
                System.out.println("Showing login form");
            } else {
                this.title = "Register";
                System.out.println("Showing registration form");
            }
        }
        if (sender == okBtn && event.equals("click")) {
            if (loginOrRegisterChkBx.isChecked()) {
                System.out.println("Clicked OK in login form");
            } else {
                System.out.println("Clicked OK in registration form");
            }
        }
        if (sender == cancelBtn && event.equals("click")) {
            System.out.println("Clicked cancel in any form");
        }
        if (sender == loginUsername && event.equals("keypress")) {
            System.out.println("Key press in login username");
        }
        if (sender == loginPassword && event.equals("keypress")) {
            System.out.println("Key press in login password");
        }
    }

    public void simulateUserInteraction() {
        this.loginUsername.keypress();
        this.loginPassword.keypress();
        this.loginOrRegisterChkBx.check();
        this.okBtn.click();
        this.loginOrRegisterChkBx.check();
        this.okBtn.click();
        this.cancelBtn.click();
    }

}
