package Decorator;

public class SauceMealDecorator extends MealDecorator{

    public SauceMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        //wywołuje poprzedni prepareMeal(Komunikat)
        super.prepareMeal();
        addSauce();
    }

    private void addSauce(){
        System.out.println("Polewam sosem");
    }
}

