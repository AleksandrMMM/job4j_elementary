package ru.job4j.calculator;
import org.junit.Assert;
import org.junit.Test;

public class FitTest {
    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeigth(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMan170Then80() {
        // Написать свой тест.
        short in = 170;
        double expected = 80;
        double out = Fit.manWeigth(in);
        Assert.assertEquals(expected, out, 0.5);
    }
}
