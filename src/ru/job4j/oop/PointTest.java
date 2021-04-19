package oop;

import org.junit.Assert;
import org.junit.Test;
import oop.Point;

public class PointTest {


    @Test
    public void when00to20then2() {
        double expected = 4.24;
        Point point1 = new Point(2, 3);
        Point point2 = new Point(5, 6);

        double out = point2.distance(point1);
        Assert.assertEquals((double) expected, out, 0.01D);
    }
}
