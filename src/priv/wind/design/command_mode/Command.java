package priv.wind.design.command_mode;

/**
 * @author DongBaicheng
 * @version 2017/12/12
 */
public abstract class Command {
    protected Barbecuer mReceiver;

    public Command(Barbecuer receiver) {
        mReceiver = receiver;
    }

    public abstract void executeCommand();
}
