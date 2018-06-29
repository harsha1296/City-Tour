package com.example.channel.tourguide;

/**
 * Created by Channel on 28-06-2018.
 */

public class TopSpotsListItem
{
    private String place;
    private int imageResourceId;

    private String heading;
    private String description;

    TopSpotsListItem(String place,int imageResourceId,String heading,String description)
    {
        this.place=place;
        this.imageResourceId=imageResourceId;

        this.heading=heading;
        this.description=description;
    }

    String getPlace()
    {
        return place;
    }

    int getImageResourceId()
    {
        return imageResourceId;
    }

    String getHeading()
    {
        return heading;
    }

    String getDescription()
    {
        return description;
    }

}
