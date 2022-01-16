package edu.school.models;

import java.awt.Color;

public class SvgPolygon extends SVGObject{
	
	private int[] points;
	private Color fill;
	private int strokeWidth;
	
	public int[] getPoints() {
		return points;
	}


	public void setPoints(int[] points) {
		this.points = points;
	}


	public Color getFill() {
		return fill;
	}


	public void setFill(Color fill) {
		this.fill = fill;
	}


	public int getStrokeWidth() {
		return strokeWidth;
	}


	public void setStrokeWidth(int strokeWidth) {
		this.strokeWidth = strokeWidth;
	}
	
	public SvgPolygon(Color color, int points[], Color fill, int strokeWidth) {
		super(color);
		setPoints(points);
		setFill(fill);
		setStrokeWidth(strokeWidth);
	}

	@Override
	public String toSvgCode() {
		
		String result = "<polygon ";
		result += "points=\"";// + getPoints() + "\" ";
		for(int i=0; i<points.length; i+=2) {
			result += " " + getPoints()[i] + "," + getPoints()[i+1];
		}
		result += "\" ";
		result += "style=\"fill:" + toRGB(getFill()) + ";stroke:" + toRGB(getColor()) + ";stroke-width:" + getStrokeWidth() + "\"/>";
		
		return result;
	}
	
	

}
