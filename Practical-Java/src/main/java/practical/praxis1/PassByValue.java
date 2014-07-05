package practical.praxis1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PassByValue {
    private static Logger logger = LoggerFactory.getLogger(PassByValue.class);

    public static void main(String[] args) {
        int j = 10;
        Point point = new Point(4, 4);

        logger.info("Before Modify Point {}, j ={}", point, j);

        setPointLocation(point, j);

        logger.info("After Modify Point {}, j ={}", point, j);
	}

    public static void setPointLocation(Point pointInst, int j) {
        pointInst.setLocation(5, 5);
        j = 20;
        logger.info("During Modify Point {}, j ={}", pointInst, j);
    }

}
