package coordinate.domain;

import java.util.List;

public class Line {

    //각 Line의 Point 값은 매번 달라질 수 있기 때문에 static으로 구현하지 말고 인스턴스 변수로 구현하는 것이 낫지 않을까?
    //여러 번 사용시 instance를 사용하는 것이 맞는 것 같습니다.
    private Point pointFirst;
    private Point pointSecond;

    public Line(List<String> points) {
        pointFirst = new Point(points.get(0));
        pointSecond = new Point(points.get(1));
    }

    public int firstPointX() {
        return pointFirst.getPointX();
    }

    public int firstPointY() {
        return pointFirst.getPointY();
    }

    public int secondPointX() {
        return pointSecond.getPointX();
    }

    public int secondPointY() {
        return pointSecond.getPointY();
    }

    public double calculateDistance() {
        return pointFirst.calculateDistance(pointSecond);
    }
}
