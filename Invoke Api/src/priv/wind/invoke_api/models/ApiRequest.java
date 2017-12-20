package priv.wind.invoke_api.models;

import java.util.HashMap;

/**
 * 请求实体
 */

public class ApiRequest {

    /// <summary>
    /// 请求类型
    /// </summary>
    public String ApiType;

    /// <summary>
    /// 所有的参数。
    /// </summary>
    public ApiMethodParameter[] Parameters;

    /// <summary>
    /// 方法名称。
    /// </summary>
    public String Method;

    /// <summary>
    /// 上下文
    /// </summary>
    public HashMap<String,String> Context= new HashMap<>();


}
