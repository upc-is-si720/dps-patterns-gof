package pe.edu.dps.patterns.behavioral.chain2;

public class ButtonComponent extends Component {
    @Override
    public void handle(String request) {
        if (canHandle(request)) {
            System.out.println("Button in action");
        }
        else {
            super.handle(request);
        }
    }
    public boolean canHandle(String request) {
        if (request.equals("click")) {
            System.out.println("Button Clicked");
            return true;
        }
        return false;
    }
}
