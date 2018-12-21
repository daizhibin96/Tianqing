package tianqing.com.example.tianqing.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by daizhibin on 2018/12/20.
 */

public class Basic {
    @SerializedName("city")//使用注解，让JSon数据和java字段之间建立映射关系
    public  String cityName;
    @SerializedName("id")
    public String weatherid;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTIme;
    }
}
