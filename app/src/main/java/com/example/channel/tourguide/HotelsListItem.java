package com.example.channel.tourguide;

/**
 * Created by Channel on 29-06-2018.
 */

public class HotelsListItem
{
    private String hotelName,star;
    private int imageResourceId;
    private String number;
    private String location;
    private static final String TAG="geo:0,0?q=";

    HotelsListItem(String hotelName,String star,int imageResourceId,String number,String location)
    {
        this.hotelName=hotelName;
        this.star=star+"-star";
        this.imageResourceId=imageResourceId;
        this.number="tel:"+number;
        this.location=TAG+location+"?("+hotelName+")";
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getStar() {
        return star;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getNumber() {
        return number;
    }

    public String getLocation() {
        return location;
    }
}
