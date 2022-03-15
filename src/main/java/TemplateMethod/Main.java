package TemplateMethod;

import TemplateMethod.Cars.CarStartingSequence;
import TemplateMethod.Cars.StartTheAutomatClassicCar;
import TemplateMethod.Cars.StartTheClassicCar;

public class Main {
    public static void main(String[] args) {
        CarStartingSequence newclassiccar = new StartTheClassicCar();
        CarStartingSequence newautomat = new StartTheAutomatClassicCar();
        newclassiccar.startingSequence();
        newautomat.startingSequence();
    }
}
