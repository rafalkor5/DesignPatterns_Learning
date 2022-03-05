package SingletonPackage.SingletonExercise;

public class Main {
    public static void main(String[] args) {
        //uruchomiono silnik gry
        GameEngine Engine = GameEngine.getInstance();
        System.out.println("Rozpoczynamy grę");
        Engine.play();
        System.out.println("Twoj wynik to: " + Engine.getScore() + " Punktów");

        int score = Engine.getScore();

        GameEngine AnotherEngine = GameEngine.getInstance();

        if(Engine == AnotherEngine){
            System.out.println("SingletonPackage.Singleton !");
        }
        if(score == AnotherEngine.getScore()){
            System.out.println("Punkty sie zgadzaja");
        }else{
            System.out.println("Cos najebałes");
        }

    }
}
