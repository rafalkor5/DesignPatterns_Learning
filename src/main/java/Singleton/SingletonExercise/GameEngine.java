package Singleton.SingletonExercise;

import java.util.Scanner;

public class GameEngine {
    public static GameEngine gameEngine;
    private int score;
    private username username;
    private int numbersOfRounds;

    private GameEngine(username username,int numbersOfRounds){
        this.username = username;
        this.numbersOfRounds = numbersOfRounds;
        this.score = 0;
    }

    public static GameEngine getInstance(){
        Scanner scanner = new Scanner(System.in);
        if(gameEngine == null){
            synchronized (GameEngine.class) {
                if(gameEngine == null) {
                    System.out.println("Podaj nazwę użytkownika : ");
                    username username = new username(scanner.nextLine());
                    System.out.println("Podaj liczbę rund");
                    int numberofrounds = scanner.nextInt();
                    gameEngine = new GameEngine(username, numberofrounds);
                    System.out.println("Uruchomiono silnik gry");
                }
            }
        }
        return gameEngine;
    }

    public int getScore() {
        return score;
    }

    private int getRandom(){
        return (int)(Math.random() * 5);
    }
    private void addPoint(){
        score ++;
    }

    public void play(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbersOfRounds; i++) {
            System.out.println("Podaj liczbę od 0 do 9");
            int input = scanner.nextInt();
            int randomnumber = getRandom();
            if(input == randomnumber){
                addPoint();
                System.out.println("Brawo punkt dla ciebie");
            }else{
                System.out.println("Nie udało ci się odgadnąć");
            }


        }
    }
}
