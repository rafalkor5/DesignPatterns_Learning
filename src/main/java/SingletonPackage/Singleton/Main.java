package SingletonPackage.Singleton;

public class Main {
    public static void main(String[] args) {
        //utworzenie silnika
        GameEngine engine = GameEngine.getInstance();
        //uruchomienie silnika
        engine.run();
    }
}
