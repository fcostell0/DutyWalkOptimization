import java.math.*;
public class Point {
    private String name;
    private double latitude;
    private double longitude;
    private static final double earthRadiusMeters = 6371000;

    public Point(String name, double lat, double lon){
        this.name = name;
        this.latitude = lat;
        this.longitude = lon;
    }

    public double haversineDist(Point otherPoint){
        // Converting degrees to radians
        double deltaLat = Math.toRadians(this.latitude - otherPoint.latitude);
        double deltaLong = Math.toRadians(this.longitude - otherPoint.longitude);

        double radianLat = Math.toRadians(this.latitude);
        double otherRadianLat = Math.toRadians(otherPoint.latitude);

        double a = Math.pow(Math.sin(deltaLat / 2 ), 2) +
                Math.pow(Math.sin(deltaLong / 2), 2) * Math.cos(radianLat) * Math.cos(otherRadianLat);

        double c = 2 * Math.asin(Math.sqrt(a));

        return earthRadiusMeters * c;

    }

    @Override
    public String toString(){
        return name;
    }
}
