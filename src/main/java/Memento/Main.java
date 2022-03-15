package Memento;

import Memento.smart_app.SmartApp;
import Memento.smart_app.SmartAppCareTaker;

public class Main {
    public static void main(String[] args) {

        SmartAppCareTaker smartAppCareTaker = new SmartAppCareTaker();
        SmartApp smartApp = new SmartApp();
        smartApp.changeVersion(1.0);
        smartAppCareTaker.addMemento(smartApp.save());

        smartApp.changeVersion(1.1);
        smartApp.changeVersion(1.2);

        smartApp.load(smartAppCareTaker.getMemento(0));
    }
}
