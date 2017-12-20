package priv.wind.design.command_mode;

/**
 * @author DongBaicheng
 * @version 2017/12/12
 */
public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecuer receiver){
        super(receiver);
    }

    @Override
    public void executeCommand() {
        mReceiver.BakeChickenWind();
    }
}
