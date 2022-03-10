package Decorator;

public class Main {
    public static void main(String[] args) {
        Meal ryzzkurczakiem = new ChickenMealDecorator(new RiceMeal());
        ryzzkurczakiem.prepareMeal();
    }
}
