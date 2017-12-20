package priv.wind.design.mediator_mode;

/**
 * 抽象同事类
 *
 * @author DongBaicheng
 * @version 2017/12/13
 */
public abstract class Colleague {
    protected Mediator mMediator;

    public Colleague(Mediator mediator){
        mMediator = mediator;
    }
}
