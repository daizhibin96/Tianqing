package tianqing.com.example.tianqing.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by daizhibin on 2018/12/20.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }









}
