package com.gurukul.day4;

class Polar{
	private double r, th;
	Polar(){}
	Polar(double r, double th){
		this.r = r;
		this.th = th;
	}
	double getX() {
		return r*Math.cos(Math.toRadians(th));
	}
	double getY() {
		return r*Math.sin(Math.toRadians(th));
	}
	public void setPolar(double x, double y) {
		r = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
		th = Math.atan2(y, x);
		th = Math.toDegrees(th);
	}
	public String toString (){
		return ("Radius is " + r + " and degree is " + th);
	}
}
public class PolarOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polar a = new Polar(5,50);
		Polar b = new Polar(6,50);
		Polar c = new Polar();

		double x = a.getX() + b.getX();
		double y = a.getY() + b.getY();
		c.setPolar(x, y);
		System.out.print(c);
	}

}
