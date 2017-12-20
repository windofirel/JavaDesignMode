package priv.wind.design.command_mode;

/**
 * @author DongBaicheng
 * @version 2017/12/12
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer receiver){
        super(receiver);
    }

    @Override
    public void executeCommand() {
        mReceiver.BakeMutton();
    }
}
