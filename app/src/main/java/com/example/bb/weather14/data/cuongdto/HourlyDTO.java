package com.example.bb.weather14.data.cuongdto;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Windows 18 on 4/21/2018.
 */

public class HourlyDTO {
  @SerializedName("DateTime")
  String dateTime;
  @SerializedName("WeatherIcon")
  int iconValue;
  @SerializedName("IconPhrase")
  String iconType;
  @SerializedName("Temperature")
  WeatherUnitDTO temp;
  @SerializedName("RealFeelTemperature")
  WeatherUnitDTO realFeel;
  @SerializedName("RelativeHumidity")
  int humidity;
  @SerializedName("Wind")
  WindDTO wind;
  @SerializedName("WindGust")
  WindGust windGust;
  @SerializedName("Visibility")
  WeatherUnitDTO visibility;
  @SerializedName("UVIndex")
  int uvIndex;
  @SerializedName("UVIndexText")
  String uvIndexText;
  @SerializedName("RainProbability")
  int rainProbability;
  @SerializedName("SnowProbability")
  int snowProbability;
  @SerializedName("IceProbability")
  int iceProbability;
  @SerializedName("Rain")
  WeatherUnitDTO rainAmount;
  @SerializedName("Snow")
  WeatherUnitDTO snowAmount;
  @SerializedName("Ice")
  WeatherUnitDTO iceAmount;
  @SerializedName("CloudCover")
  int cloudCover;
  @SerializedName("IsDaylight")
  boolean isDayLight;
  public String getDateTime() {
    return dateTime;
  }

  public int getIconValue() {
    return iconValue;
  }

  public String getIconType() {
    return iconType;
  }

  public WeatherUnitDTO getTemp() {
    return temp;
  }

  public WeatherUnitDTO getRealFeel() {
    return realFeel;
  }

  public WindDTO getWind() {
    return wind;
  }

  public WindGust getWindGust() {
    return windGust;
  }

  public WeatherUnitDTO getVisibility() {
    return visibility;
  }

  public int getUvIndex() {
    return uvIndex;
  }

  public String getUvIndexText() {
    return uvIndexText;
  }

  public int getRainProbability() {
    return rainProbability;
  }

  public int getSnowProbability() {
    return snowProbability;
  }

  public int getIceProbability() {
    return iceProbability;
  }

  public WeatherUnitDTO getRainAmount() {
    return rainAmount;
  }

  public WeatherUnitDTO getSnowAmount() {
    return snowAmount;
  }

  public WeatherUnitDTO getIceAmount() {
    return iceAmount;
  }

  public int getCloudCover() {
    return cloudCover;
  }

  public int getHumidity() {
    return humidity;
  }

  public boolean isDayLight() {
    return isDayLight;
  }
}
