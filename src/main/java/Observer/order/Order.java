package Observer.order;

import Observer.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class Order implements  Observable{
    private Long orderNumber;
    private OrderStatus orderStatus;
    //list of observer
    private Set<Observer> registredObservers = new HashSet<>();
    //contructor
    public Order(Long orderNumber, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }
    //implements method of observable
    @Override
    public void registerObserver(Observer observer) {
        registredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registredObservers.remove(observer);
    }

    @Override
    public void notificationObserver() {
        for (Observer e: registredObservers) {
            e.update(this);
        }
    }

    public void changeOrderStatus(OrderStatus orderStatus){
        setOrderStatus(orderStatus);
        notificationObserver();
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
