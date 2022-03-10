package Singleton.Singleton;

public class GameEngine {
    private int hp = 100;
    private String characterName = "";
    //pole statyczne z dostępem bez konieczności tworzenia obiektu
    private static GameEngine instance;
    //prywatny konstruktor
    private GameEngine() {

    }

    public void run(){
        while(true){
            //czekamy na input gracza
            //zmieniamy stan gry
            //renderujemy grafike
        }
    }
    //metoda tworząca silnik oraz zabezpieczająca przed jego wielokrotnym utworzeniem
    public static GameEngine getInstance(){
        if(instance == null){
            //chronienie wielowątkowości
            synchronized (GameEngine.class){
                if(instance == null) instance = new GameEngine();
            }

        }
        return instance;
    }
}
