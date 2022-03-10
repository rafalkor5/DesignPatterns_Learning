package Decorator;

public class ChickenMealDecorator extends MealDecorator{
    //Posiada własny konstruktor ktory przyjmuje obiekty typu meal (te same)
    public ChickenMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        //wywołuje poprzedni prepareMeal(Komunikat)
        super.prepareMeal();
        addChicken();
    }

    private void addChicken(){
        System.out.println("Do dania dodaję kurczaka");
    }
}
