package pe.edu.dps.patterns.behavioral.chain2;

public class WindowsComponent extends Component {
    @Override
    public void handle(String request) {
        if (canHandle(request)) {
            System.out.println("Windows in action");
        }
        else {
            super.handle(request);
        }
    }
    public boolean canHandle(String request) {
        if (request.equals("close")) {
            System.out.println("Windows Closing ");
            return true;
        }
        return false;
    }
}
