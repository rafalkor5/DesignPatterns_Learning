package Observer.notification;

import Observer.order.Order;

public interface Observer {
    void update(Order order);
}
