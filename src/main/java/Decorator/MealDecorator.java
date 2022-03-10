package Decorator;

//klasa abstrakcyjna nie da się zrobić obiektu typu Mealdecorator
abstract public class MealDecorator extends Meal{
    //posiada własne pole meal
    Meal meal;

    //tworząc decorator przekazujemy obiekt typu meal
    public MealDecorator(Meal meal) {
        this.meal = meal;
    }

    @Override
    public void prepareMeal() {
        this.meal.prepareMeal();
    }
}
