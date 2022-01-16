package edu.school.models;

import java.awt.Color;

public class SvgEllipse extends SVGObject{
	
	private int radiusX;
	private int radiusY;
	private Color fill;
	private int strokeWidth;
	
	public int getRadiusX() {
		return radiusX;
	}
	public void setRadiusX(int radiusX) {
		this.radiusX = radiusX;
	}
	public int getRadiusY() {
		return radiusY;
	}
	public void setRadiusY(int radiusY) {
		this.radiusY = radiusY;
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
	
	public SvgEllipse(int x, int y, Color strokeColor, int radiusX, int radiusY, Color fill, int strokeWidth) {
		super(x, y, strokeColor);
		setRadiusX(radiusX);
		setRadiusY(radiusY);
		setFill(fill);
		setStrokeWidth(strokeWidth);
	}
	
	@Override
	public String toSvgCode() {
		
		String result = "<ellipse ";
		result += "cx=\"" + getX() + "\" cy=\"" + getY() + "\" ";
		result += "rx=\"" + getRadiusX() + "\" ry=\"" + getRadiusY() + "\" ";
		result += "style=\"fill:" + toRGB(getFill()) + ";stroke:" + toRGB(getColor()) + ";stroke-width:" + getStrokeWidth() + "\"/>";
		
		return result;
	}

}
