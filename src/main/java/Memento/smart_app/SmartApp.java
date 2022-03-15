package Memento.smart_app;

public class SmartApp {
    private Double version;

    public void changeVersion(double version){
        this.version =version;
        System.out.println("Nowa wersja to : " + this.version);
    }

    public SmartAppMemento save(){
        return new SmartAppMemento(this.version);
    }

    public void load(SmartAppMemento smartAppMemento){
        this.version = smartAppMemento.getVersion();
        System.out.println("Wczytano wersje " + smartAppMemento.getVersion());
    }

}
