package tianqing.com.example.tianqing.util;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import tianqing.com.example.tianqing.gson.Weather;

/**
 * Created by daizhibin on 2018/12/20.
 */

public class HttpUtil {//连接服务器
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }

}
