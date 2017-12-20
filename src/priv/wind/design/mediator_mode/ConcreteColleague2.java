package priv.wind.design.mediator_mode;

/**
 * @author DongBaicheng
 * @version 2017/12/13
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mMediator.send(message, this);
    }

    public void notice(String message){
        System.out.println(getClass().getSimpleName() + " get message = " + message);
    }
}
