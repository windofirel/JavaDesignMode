package priv.wind.design;


import priv.wind.design.chain_of_responsibility.ConcreteDHandler1;
import priv.wind.design.chain_of_responsibility.ConcreteDHandler2;
import priv.wind.design.chain_of_responsibility.ConcreteDHandler3;
import priv.wind.design.chain_of_responsibility.DHandler;
import priv.wind.design.command_mode.BakeChickenWingCommand;
import priv.wind.design.command_mode.BakeMuttonCommand;
import priv.wind.design.command_mode.Barbecuer;
import priv.wind.design.command_mode.Waiter;
import priv.wind.design.mediator_mode.ConcreteColleague1;
import priv.wind.design.mediator_mode.ConcreteColleague2;
import priv.wind.design.mediator_mode.ConcreteMediator;
import priv.wind.design.reflects.Child;
import priv.wind.design.reflects.Parent;
import priv.wind.design.reflects.SortableField;
import priv.wind.design.simplefactorymode.OperateType;
import priv.wind.design.simplefactorymode.Operation;
import priv.wind.design.simplefactorymode.OperationFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            ConcreteMediator mediator = new ConcreteMediator();
            System.out.println(mediator.hashCode());
            ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
            System.out.println(colleague1.hashCode());
            ConcreteColleague2 colleague3 = new ConcreteColleague2(mediator);
            System.out.println(colleague3.hashCode() + "\n");
        }
    }

    private static void mediator() {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.send("Hello 2");
        colleague2.send("Hello 1");
    }

    /**
     * 职责链模式
     */
    private static void chainOfResponsibility() {
        DHandler handler1 = new ConcreteDHandler1();
        DHandler handler2 = new ConcreteDHandler2();
        DHandler handler3 = new ConcreteDHandler3();
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        int[] requests = new int[]{5, 20, 15, 3, 100};

        for (int request : requests){
            handler1.handleRequest(request);
        }
    }

    /**
     * 命令模式
     */
    private static void commandMode() {
        Barbecuer boy = new Barbecuer();
        Waiter girl = new Waiter();
        BakeMuttonCommand command1 = new BakeMuttonCommand(boy);
        BakeMuttonCommand command2 = new BakeMuttonCommand(boy);
        BakeChickenWingCommand command3 = new BakeChickenWingCommand(boy);

        girl.setOrder(command1);
//        girl.setOrder(command2);
        girl.setOrder(command3);

        girl.cancelOrder(command2);
        girl.sendOrder();
    }

    /**
     * 反射测试
     */
    private static void reflectTest2() {
        double qty = 10;
        String label = "13111";
        boolean flag = true;
        List<String> names = new ArrayList<>();
        System.out.println("names.getClass().toString() = " + names.getClass().toString());
        System.out.println("flag = " + ((Object) flag).getClass().toString());
        System.out.println("qty = " + ((Object) qty).toString());
        System.out.println("label = " + ((Object) label).toString());
    }

    private static void reflectTest() {
        Parent c = new Child();
        List<SortableField> list = c.init();//获取泛型中类里面的注解
        //输出结果
        for (SortableField l : list) {
            System.out.println("字段名称：" + l.getName() + "\t字段类型：" + l.getType() +
                    "\t注解名称：" + l.getMeta().name() + "\t注解描述：" + l.getMeta().description());
        }
    }

    /**
     * 简单工厂模式
     */
    private static void simpleFactoryMode() {
        Operation operation = OperationFactory.createOperate(OperateType.DIV);
        operation.mNumberA = 0;
        operation.mNumberB = 2;
        double result = 0;
        try {
            result = operation.getResult();
        } catch (Exception e) {
            System.out.println("运算出错: " + e.getMessage());
            return;
        }
        System.out.println("运算结果为" + result);
    }
}
