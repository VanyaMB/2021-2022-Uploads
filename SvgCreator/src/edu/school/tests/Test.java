package edu.school.tests;

import java.awt.Color;

import edu.school.models.SVGCircle;
import edu.school.models.SVGLine;
import edu.school.models.SVGPicture;
import edu.school.models.SvgEllipse;
import edu.school.models.SvgPolygon;
import edu.school.models.SvgRectangle;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SVGPicture pic = new SVGPicture();
		//pic.add(new SVGLine(10, 10, 180, 250, Color.red, 5));
		//pic.add(new SVGLine(280, 10, 0, 368, Color.blue, 1));
		//pic.add(new SVGCircle(100, 100, Color.green, 50, 3, Color.blue));
		//pic.add(new SVGCircle(400, 300, Color.black, 30, 5, Color.pink));
		//pic.add(new SvgEllipse(300, 300, Color.red, 100, 50, Color.black, 5));
		//pic.add(new SvgRectangle(200, 400, Color.yellow, 150, 75, Color.red, 5));\
		int[] points = new int[] {100, 10, 40, 198, 190, 78, 10, 78, 160, 198};
		pic.add(new SvgPolygon(Color.green, points, Color.red, 2));
		pic.saveToFile("D:\\test15.svg");
	}

}
