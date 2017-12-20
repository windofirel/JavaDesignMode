package priv.wind.design.chain_of_responsibility;

/**
 * 具体处理着类3
 *
 * @author DongBaicheng
 * @version 2017/12/13
 */
public class ConcreteDHandler3 extends DHandler {
    @Override
    public void handleRequest(int request) {
        if (request > 20) {
            System.out.println(this.getClass().getSimpleName() + " 处理请求 " + request);
        } else if (mSuccessor != null) {
            mSuccessor.handleRequest(request);
        }
    }
}
