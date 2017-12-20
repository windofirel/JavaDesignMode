package priv.wind.design.simplefactorymode;

import javax.xml.transform.Result;

/**
 * 运算接口
 * @author DongBaicheng
 * @version 2017/7/31
 */
public abstract class Operation {
    public double mNumberA = 0;
    public double mNumberB = 0;

    /**
     * 获取运算结果
     * @return 运算结果
     */
    public abstract double getResult() throws Exception;
}
