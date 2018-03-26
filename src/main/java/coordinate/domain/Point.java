package coordinate.domain;

public class Point {
    private int x, y;

    //굳이 List를 생성할 필요는 없겠다.
    //배열에서 바로 값을 추출해도 되지 않을까?
    //들어온 값이 변할 일이 없기 때문에 배열을 사용하는 것이 맞는거 같습니다.
    Point(String points) {
        String info = points.substring(1, points.length() - 1);
        String[] xyDivide = info.split(",");
        if(xyDivide.length != 2) {
            throw new IllegalArgumentException();
        }
        x = Integer.parseInt(xyDivide[0]);
        y = Integer.parseInt(xyDivide[1]);
    }

    public double calculateDistance(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    public int getPointX() {
        return x;
    }

    public int getPointY() {
        return y;
    }
}