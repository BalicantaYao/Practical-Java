package practical.praxis1;

/**
 * Point
 *
 * */
public class Point {

    private int x;
    private int y;

    public Point(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "y=" + y +
                ", x=" + x +
                '}';
    }
}
