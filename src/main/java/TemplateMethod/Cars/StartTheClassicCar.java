package TemplateMethod.Cars;

public class StartTheClassicCar extends CarStartingSequence{
    @Override
    protected void setTheGear() {
        System.out.println("Wybranie biegu");
    }
    @Override
    protected void startTheIgnition() {
        System.out.println("Przekręcenie kluczyka");
    }
}

