package coordinate.domain;

import java.util.List;

public class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle (List<String> points){
        point1 = new Point(points.get(0));
        point2 = new Point(points.get(1));
        point3 = new Point(points.get(2));
    }

    private double distanceA(){
        return point1.distance(point2);
    }

    private double distanceB(){
        return point2.distance(point3);
    }

    private double distanceC(){
        return point3.distance(point1);
    }

    public double area(){
        double s = (distanceA() + distanceB() + distanceC()) / 2;
        double result = Math.pow(s * (s - distanceA()) * (s - distanceB()) * (s - distanceC()), 0.5);
        return Math.round((result * 100d) / 100d);

    }
}
