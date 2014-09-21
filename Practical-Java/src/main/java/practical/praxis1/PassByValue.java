package practical.praxis1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PassByValue {
    private static Logger logger = LoggerFactory.getLogger(PassByValue.class);

    public static void main(String[] args) {

        runCase1();

        runCase2();
        //
    }

    private static void runCase1() {

        int j = 10;

        Point point = new Point(4, 4);

        logger.info("Before Modify Point {}, j ={}", point, j);

        setPointWithAssign(point, j);

        logger.info("After Modify Point {}, j ={}", point, j);

        // Result
        // Before Modify Point Point{y=4, x=4}, j =10
        // During Modify Point Point{y=5, x=5}, j =20
        // After Modify Point Point{y=4, x=4}, j =10
    }

    private static void setPointWithAssign(Point pointInst, int j) {
        pointInst = new Point(5, 5);
        j = 20;
        logger.info("During Modify Point {}, j ={}", pointInst, j);
    }

    private static void setPointLocation(Point pointInst, int j) {
        pointInst.setLocation(5, 5);
        j = 20;
        logger.info("During Modify Point {}, j ={}", pointInst, j);
    }

    private static void runCase2() {
        Integer test = new Integer(10);
    }
}
