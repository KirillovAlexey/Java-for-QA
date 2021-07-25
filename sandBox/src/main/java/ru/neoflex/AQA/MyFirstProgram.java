package ru.neoflex.AQA;

import java.awt.*;

public class MyFirstProgram{

	public static void main(String[] args){
		Point p1 = new Point(56,97);
		Point p2 = new Point(60,100);
		System.out.println("Вычисления с помощью Math.sqrt. Расстояние: " + distance(p1,p2));
		System.out.println("Вычисление с помощью метода класса Point. Расстояние: " + distanceFunc(p1,p2));
	}

	public static double distance(Point p1, Point p2){
		return Math.sqrt(
				Math.pow(Math.abs(p2.getX()-p1.getX()),2) + Math.pow(Math.abs(p2.getY()-p1.getY()),2));
	}

	public static double distanceFunc(Point p1, Point p2){
		Point pDistance = new Point();
		return pDistance.distance(p1.x,p1.y,p2.x,p2.y);
	}

}