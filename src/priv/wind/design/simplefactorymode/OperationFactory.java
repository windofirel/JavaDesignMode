package priv.wind.design.simplefactorymode;

/**
 * 运算类工厂
 * @author DongBaicheng
 * @version 2017/7/31
 */
public class OperationFactory {
    public static Operation createOperate(OperateType operate){
        Operation operation = null;
        switch (operate){
            case ADD:
                operation = new OperationAdd();
                break;
            case SUB:
                operation = new OperationSub();
                break;
            case MUL:
                operation = new OperationMul();
                break;
            case DIV:
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}
