package priv.wind.invoke_api;

import com.google.gson.Gson;
import okhttp3.*;
import priv.wind.invoke_api.models.ApiMethodParameter;
import priv.wind.invoke_api.models.ApiRequest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class JavaInvokeDemo {

    public static void main(String[] args) {
        Gson gson = new Gson();
        //初始化请求数据
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.ApiType = "AuthenticationController";
        apiRequest.Method = "Login";
        apiRequest.Parameters = new ApiMethodParameter[]{
                new ApiMethodParameter("", "DBC"),
                new ApiMethodParameter("", "")};
        //除了请求登录接口 其他接口都需要设置ticket和invorgId,ticket和InvOrgId由登录接口返回
        //apiRequest.Context.put("Ticket", "票据");
        //apiRequest.Context.put("InvOrgId", "组织ID");

        //序列化请求数据（request body 的内容）
        String jsonString = gson.toJson(apiRequest);

        //创建请求体
        Request request = new Request.Builder()
                .url("http://192.168.175.78:981/Server.svc/api/invoke")
                .post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), jsonString))
                .build();
        //设置OkHttpClient参数
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(15, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS)
                .readTimeout(15, TimeUnit.SECONDS)
                .build();
        //发送请求
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                System.out.println("Invoke failure");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                System.out.println("Invoke success");
                System.out.println("response = " + response.toString());
                System.out.println("response body = " + response.body().string());
            }
        });
    }
}
