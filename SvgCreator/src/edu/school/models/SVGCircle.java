package edu.school.models;

import java.awt.Color;

public class SVGCircle extends SVGObject{
	
	private int radius;
	private int strokeWidth;
	private Color fill;
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getStrokeWidth() {
		return strokeWidth;
	}
	public void setStrokeWidth(int strokeWidth) {
		this.strokeWidth = strokeWidth;
	}
	
	public Color getFill() {
		return fill;
	}
	public void setFill(Color fill) {
		this.fill = fill;
	}
	
	
	public SVGCircle(int x, int y, Color strokeColor, int radius, int strokeWidth, Color fill) {
		super(x, y, strokeColor);
		setRadius(radius);
		setStrokeWidth(strokeWidth);
		setFill(fill);
		
		
	}
	@Override
	public String toSvgCode() {
		
		String result = "<circle ";
		result += "cx=\"" + getX() + "\" cy=\"" + getY() + "\" ";
		result += "r=\"" + getRadius() + "\" ";
		result += "stroke=\"" + toRGB(getColor()) + "\" ";
		result += "stroke-width=\"" + getStrokeWidth() + "\" ";
		result += "fill=\"" + toRGB(getFill()) + "\"/>";
		
		return result;
	}
	
	

}
