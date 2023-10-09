package com.example.weather.forecast;

public class Forecast {
    private String date;
    private String weatherDay;
    private String temp;
    private String weatherNight;//夜晚天气
    private String sunrise;//日出
    private String sunset;//日落
    private String moonRise;//月升
    private String moonSet;//月落
    private String moonPhase;//月相名称
    private String moonPhaseIcon;//月相图标
    private String windDirDay;//白天风向
    private String winDirNight;//夜晚风向
    private String windScaleDay;//白天风力等级
    private String windScaleNight;//夜晚风力等级
    private String windSpeedDay;//白天风速
    private String windSpeedNight;//夜晚风速
    private String humidity;//相对湿度
    private String precip;//降水量
    private String pressure;//大气压强
    private String could;//当天云量
    private String uvInDex;//紫外线强度指数
    private String vis;//能见度

    public Forecast(String date, String weatherDay, String temp,
                    String weatherNight, String sunrise, String sunset,
                    String moonRise, String moonSet, String moonPhase,
                    String moonPhaseIcon, String windDirDay,
                    String winDirNight, String windScaleDay,
                    String windScaleNight, String windSpeedDay, String
                            windSpeedNight, String humidity, String precip,
                    String pressure, String could, String uvInDex, String vis) {
        this.date = date;
        this.weatherDay = weatherDay;
        this.temp = temp;
        this.weatherNight = weatherNight;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.moonRise = moonRise;
        this.moonSet = moonSet;
        this.moonPhase = moonPhase;
        this.moonPhaseIcon = moonPhaseIcon;
        this.windDirDay = windDirDay;
        this.winDirNight = winDirNight;
        this.windScaleDay = windScaleDay;
        this.windScaleNight = windScaleNight;
        this.windSpeedDay = windSpeedDay;
        this.windSpeedNight = windSpeedNight;
        this.humidity = humidity;
        this.precip = precip;
        this.pressure = pressure;
        this.could = could;
        this.uvInDex = uvInDex;
        this.vis = vis;
    }

    public String getWeatherDay() {
        return weatherDay;
    }

    public void setWeatherDay(String weatherDay) {
        this.weatherDay = weatherDay;
    }

    public String getWeatherNight() {
        return weatherNight;
    }

    public void setWeatherNight(String weatherNight) {
        this.weatherNight = weatherNight;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getMoonRise() {
        return moonRise;
    }

    public void setMoonRise(String moonRise) {
        this.moonRise = moonRise;
    }

    public String getMoonSet() {
        return moonSet;
    }

    public void setMoonSet(String moonSet) {
        this.moonSet = moonSet;
    }

    public String getMoonPhase() {
        return moonPhase;
    }

    public void setMoonPhase(String moonPhase) {
        this.moonPhase = moonPhase;
    }

    public String getMoonPhaseIcon() {
        return moonPhaseIcon;
    }

    public void setMoonPhaseIcon(String moonPhaseIcon) {
        this.moonPhaseIcon = moonPhaseIcon;
    }

    public String getWindDirDay() {
        return windDirDay;
    }

    public void setWindDirDay(String windDirDay) {
        this.windDirDay = windDirDay;
    }

    public String getWinDirNight() {
        return winDirNight;
    }

    public void setWinDirNight(String winDirNight) {
        this.winDirNight = winDirNight;
    }

    public String getWindScaleDay() {
        return windScaleDay;
    }

    public void setWindScaleDay(String windScaleDay) {
        this.windScaleDay = windScaleDay;
    }

    public String getWindScaleNight() {
        return windScaleNight;
    }

    public void setWindScaleNight(String windScaleNight) {
        this.windScaleNight = windScaleNight;
    }

    public String getWindSpeedDay() {
        return windSpeedDay;
    }

    public void setWindSpeedDay(String windSpeedDay) {
        this.windSpeedDay = windSpeedDay;
    }

    public String getWindSpeedNight() {
        return windSpeedNight;
    }

    public void setWindSpeedNight(String windSpeedNight) {
        this.windSpeedNight = windSpeedNight;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPrecip() {
        return precip;
    }

    public void setPrecip(String precip) {
        this.precip = precip;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getCould() {
        return could;
    }

    public void setCould(String could) {
        this.could = could;
    }

    public String getUvInDex() {
        return uvInDex;
    }

    public void setUvInDex(String uvInDex) {
        this.uvInDex = uvInDex;
    }

    public String getVis() {
        return vis;
    }

    public void setVis(String vis) {
        this.vis = vis;
    }

    public String getDate() {
        return date;
    }


    public String getTemp() {
        return temp;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public void setTemp(String temp) {
        this.temp = temp;
    }
    public Forecast(String date,String weatherDay,String temp){
        this.date=date;
        this.weatherDay=weatherDay;
        this.temp=temp;
    }
}
