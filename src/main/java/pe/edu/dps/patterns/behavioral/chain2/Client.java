package pe.edu.dps.patterns.behavioral.chain2;

public class Client {
    public static void main(String[] args) {
        Handler windows = new WindowsComponent();
        Handler button = new ButtonComponent();
        Handler subpanel = new PanelComponent();
        Handler panel = new PanelComponent();

        button.setNext(subpanel);
        subpanel.setNext(panel);
        panel.setNext(windows);

        button.handle("close");

        /*windows.setNext(panel);
        panel.setNext(button);*/
        //button.setNext(windows);

        /*panel.handle("close");
        System.out.println("#-------");*/
        /*windows.handle("add");
        System.out.println("#-------");
        windows.handle("click");*/
        //panel.handle("close");
    }



}
