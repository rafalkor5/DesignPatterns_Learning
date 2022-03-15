package TemplateMethod.Cars;

abstract public class CarStartingSequence {
    //metody modyfikowalne
    final public void startingSequence(){
        fastenSeatBelts();
        startTheIgnition();
        setTheGear();
        go();
    }
    protected abstract void setTheGear();
    protected abstract void startTheIgnition();

    //metody nie modyfikowalne
    private void fastenSeatBelts() {
        System.out.println("Zapinamy pasy");
    }
    private void go() {
        System.out.println("Jedź");
    }
}
