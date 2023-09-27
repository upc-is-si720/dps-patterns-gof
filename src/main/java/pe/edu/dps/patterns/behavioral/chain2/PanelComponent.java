package pe.edu.dps.patterns.behavioral.chain2;

public class PanelComponent extends Component {
    @Override
    public void handle(String request) {
        if (canHandle(request)) {
            System.out.println("Panel in action");
        }
        else {
            super.handle(request);
        }
    }
    public boolean canHandle(String request) {
        if (request.equals("add")) {
            System.out.println("Add componet");
            return true;
        }
        return false;
    }
}
