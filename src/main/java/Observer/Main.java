package Observer;

import Observer.notification.Email;
import Observer.notification.MobileApp;
import Observer.notification.TextMessage;
import Observer.order.Order;
import Observer.order.OrderStatus;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(115L, OrderStatus.REGISTRED);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);
        order.notificationObserver();
        System.out.println();
        order.changeOrderStatus(OrderStatus.SEND);

    }}
