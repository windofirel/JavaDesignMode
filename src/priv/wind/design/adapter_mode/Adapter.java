package priv.wind.design.adapter_mode;

/**
 * @author DongBaicheng
 * @version 2017/12/6
 */
public class Adapter extends Target {
    private Adaptee mAdaptee = new Adaptee();

    @Override
    public void request() {
        mAdaptee.specialRequest();
    }
}
