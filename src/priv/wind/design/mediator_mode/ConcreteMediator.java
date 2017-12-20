package priv.wind.design.mediator_mode;

/**
 * 具体中介者类
 *
 * @author DongBaicheng
 * @version 2017/12/13
 */
public class ConcreteMediator extends Mediator {
    private ConcreteColleague1 mColleague1;
    private ConcreteColleague2 mColleague2;

    public void setColleague1(ConcreteColleague1 colleague1) {
        mColleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        mColleague2 = colleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == mColleague1){
            mColleague2.notice(message);
        }

        if (colleague == mColleague2){
            mColleague1.notice(message);
        }
    }
}
