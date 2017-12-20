package priv.wind.invoke_api.models;

import java.util.HashMap;

/**
 * 接收实体
 */

public class ApiResponse<T> {

    public Boolean Success;
    public String Message;
    public HashMap<String,String> Context = new HashMap<>();
    public T Result;

}
