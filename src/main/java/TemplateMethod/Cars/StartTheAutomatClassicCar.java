package TemplateMethod.Cars;

public class StartTheAutomatClassicCar extends StartTheClassicCar{
    @Override
    protected void setTheGear() {
        System.out.println("Automatyczne wybieranie biegu");
    }
}

