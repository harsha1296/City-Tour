package sri.harsha.ramini.tourguide;

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
    private int hotel_star;
    private int[] hotel_type=new int[11];

    HotelsListItem(String hotelName,String star,int imageResourceId,String number,String location,int[] hotel_type)
    {
        this.hotelName=hotelName;
        this.hotel_star=Integer.parseInt(star);
        this.star=star+"-star";
        this.imageResourceId=imageResourceId;
        this.number="tel:"+number;
        this.location=TAG+location+"?("+hotelName+")";
        this.hotel_type=hotel_type;

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

    public int getHotelStar()
    {
        return hotel_star;
    }

    public int[] getHotelType()
    {
        return hotel_type;
    }
}
