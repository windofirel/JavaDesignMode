package priv.wind.design.chain_of_responsibility;

/**
 * 定义处理请示的接口
 *
 * @author DongBaicheng
 * @version 2017/12/13
 */
public abstract class DHandler {
    /**
     * 继任者
     */
    protected DHandler mSuccessor;

    public void setSuccessor(DHandler successor) {
        mSuccessor = successor;
    }

    /**
     * 处理请求的抽象方法
     *
     * @param request 请求数据
     */
    public abstract void handleRequest(int request);
}
