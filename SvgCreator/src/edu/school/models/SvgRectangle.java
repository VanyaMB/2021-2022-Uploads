package edu.school.models;

import java.awt.Color;

public class SvgRectangle extends SVGObject{
	
	private int width;
	private int height;
	private Color fill;
	private int strokeWidth;

	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
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
	
	public SvgRectangle(int x, int y, Color strokeColor, int width, int height, Color fill, int strokeWidth) {
		super(x, y, strokeColor);
		setWidth(width);
		setHeight(height);
		setFill(fill);
		setStrokeWidth(strokeWidth);
	}

	@Override
	public String toSvgCode() {
		String result = "<rect ";
		result += "x=\"" + getX() + "\" y=\"" + getY() + "\" ";
		result += "width=\"" + getWidth() + "\" height=\"" + getHeight() + "\" ";
		result += "style=\"fill:" + toRGB(getFill()) + ";stroke-width:" + getStrokeWidth() + ";stroke:" + toRGB(getColor()) + "\"/>";
		
		return result;
	}
	
	

}
