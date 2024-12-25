import java.util.ArrayList;

public class Walk {
    private ArrayList<Point> pointArrayList;

    public Walk(){
        this.pointArrayList = new ArrayList<>();
    }

    public void nextClosestOptimization(){
        return;
    }

    public void addPoint(String pointName, double lat, double lon){
        Point newPoint = new Point(pointName,lat,lon);
        this.pointArrayList.add(newPoint);
    }

}
