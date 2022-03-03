package Observer.notification;

import Observer.order.Order;

public class MobileApp implements Observer{
    public void update(Order order){
        System.out.println("Mobile App - Zamówienie numer: " + order.getOrderNumber() + " zmieniło status na : " + order.getOrderStatus());
    }
}
