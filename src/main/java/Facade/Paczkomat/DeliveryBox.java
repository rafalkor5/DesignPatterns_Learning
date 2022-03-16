package Facade.Paczkomat;

public class DeliveryBox {

    private boolean boxFull;

    public DeliveryBox() {
        this.boxFull = false;
    }

    public boolean stateOfDeliveryBox(){
        System.out.println("Stan boxa to : " + boxFull);
        return boxFull;
    }

    public void insertPackage(){
        if(boxFull == true) {
            System.out.println("Box pełny");
        }else{
            boxFull = true;
            System.out.println("Włozono paczke");
        }
    }

}
