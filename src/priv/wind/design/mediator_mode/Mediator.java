package priv.wind.design.mediator_mode;

/**
 * 抽象中介者类
 *
 * @author DongBaicheng
 * @version 2017/12/13
 */
public abstract class Mediator {
    public abstract void send(String message, Colleague colleague);
}
