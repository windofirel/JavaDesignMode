package priv.wind.design.simplefactorymode;

/**
 * 除法运算类
 *
 * @author DongBaicheng
 * @version 2017/7/31
 */
public class OperationDiv extends Operation {
    /**
     * 获得除法运算结果
     * @return 运算结果
     * @throws Exception 除数为零异常
     */
    @Override
    public double getResult() throws Exception{
        double result = 0;
        if (mNumberA == 0) {
            throw new Exception("除数不能为零");
        }
        result = mNumberA / mNumberB;
        return result;
    }
}
