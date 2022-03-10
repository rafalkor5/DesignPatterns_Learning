package Decorator;

public class ShrimpMealDecorator extends  MealDecorator{
    //Posiada własny konstruktor ktory przyjmuje obiekty typu meal (te same)
    public ShrimpMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        //wywołuje poprzedni prepareMeal(Komunikat)
        super.prepareMeal();
        addSchrimp();
    }

    private void addSchrimp(){
        System.out.println("Do dania dodaję krewetki");
    }
}
