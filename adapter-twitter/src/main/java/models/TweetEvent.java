package models;

import integraton.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TweetEvent {

    static final String RULE_CODE = "twitter";
    private String id;
    private String timeStamp;
    private String textValue;
    private double latitude;
    private double longitude;
    private String city;

    public TweetEvent() {
    }

    public void save(TweetEvent tweetEvent) {
    }

    public void  sendToSourceIntegrator(TweetEvent tweetEvent, SourceIntegrator integrator){
        try {
            integrator.sendTweetEvent(tweetEvent);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "TweetEvent{" +
                "id='" + id + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                ", textValue='" + textValue + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", city='" + city + '\'' +
                '}';
    }
}
