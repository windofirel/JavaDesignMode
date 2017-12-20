package priv.wind.design.simplefactorymode;

/**
 * 加法运算类
 * @author DongBaicheng
 * @version 2017/7/31
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = mNumberA + mNumberB;
        return result;
    }
}
