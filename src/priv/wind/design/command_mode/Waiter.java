package priv.wind.design.command_mode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author DongBaicheng
 * @version 2017/12/12
 */
public class Waiter {
    private List<Command> mOrders;
    public Waiter(){
        mOrders = new ArrayList<>();
    }

    public void setOrder(Command order){
        if (order instanceof BakeChickenWingCommand){
            System.out.println("Waiter: Here is no chicken wing");
        }else {
            mOrders.add(order);
            System.out.println("Add order: " + order.getClass().getSimpleName() + " time: " + new Date());
        }
    }

    public void cancelOrder(Command order){
        mOrders.remove(order);
        System.out.println("Cancel order: " + order + " time: " + new Date());
    }

    public void sendOrder(){
        for (Command order: mOrders){
            order.executeCommand();
        }
    }
}
