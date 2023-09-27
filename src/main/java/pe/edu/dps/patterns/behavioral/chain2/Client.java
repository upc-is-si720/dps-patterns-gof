package pe.edu.dps.patterns.behavioral.chain2;

public class Client {
    public static void main(String[] args) {
        Handler windows = new WindowsComponent();
        Handler button = new ButtonComponent();
        Handler panel = new PanelComponent();

        windows.setNext(panel);
        panel.setNext(button);

        windows.handle("close");
        System.out.println("#-------");
        windows.handle("add");
        System.out.println("#-------");
        windows.handle("click");
    }



}
