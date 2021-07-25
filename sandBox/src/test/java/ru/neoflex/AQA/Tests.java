package ru.neoflex.AQA;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.geom.Point2D;

public class Tests {

    @Test(description = "Проверка расстояния между точками")
    public void Distance(){
        Point p1 = new Point(100,92);
        Point p2 = new Point(24,18);
        System.out.println("test for assert ok: 10.0");
        assert Point.distance(p1.getX(),p2.getX(),p1.getY(),p2.getY()) == 10.0;
        System.out.println("test for Assert.equals ok: 10.0");
        Assert.assertEquals(Point.distance(p1.getX(),p2.getX(),p1.getY(),p2.getY()),10.0);
    }
    @Test(description = "Проверка созданной точки")
    public void checkPoint(){
        Point p = new Point();
        p.setLocation(5,5);
        Assert.assertEquals(new Point(25,25),p,"Точка не создана");
    }
    @Test(description = "Проверка средней точки")
    public void avgPoint(){
        Point2D.Double p1 = new Point2D.Double(5.0,5.0);
        Point2D.Double p2 = new Point2D.Double(0,0);
        Point2D.Double p3 = new Point2D.Double();
        p3.setLocation(
                (p1.getX()+p2.getX())/2,
                (p1.getY()+p2.getY())/2);
        Assert.assertEquals(p3, new Point2D.Double(2.5,2.5));
    }

}
