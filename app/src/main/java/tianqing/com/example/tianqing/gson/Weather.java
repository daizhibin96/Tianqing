package tianqing.com.example.tianqing.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by daizhibin on 2018/12/20.
 */

public class Weather {//总的实例，将包含其他gson的类

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
