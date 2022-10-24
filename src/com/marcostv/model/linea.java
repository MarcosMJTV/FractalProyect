package com.marcostv.model;

public class linea {

	 double xA=100;
	 double yA=300;
	 double xB=700;
	 double yB=300;
	 
	 
	public linea(double xA, double yA, double xB, double yB) {
		super();
		this.xA = xA;
		this.yA = yA;
		this.xB = xB;
		this.yB = yB;
	}
	public double getxA() {
		return xA;
	}
	public void setxA(double xA) {
		this.xA = xA;
	}
	public double getyA() {
		return yA;
	}
	public void setyA(double yA) {
		this.yA = yA;
	}
	public double getxB() {
		return xB;
	}
	public void setxB(double xB) {
		this.xB = xB;
	}
	public double getyB() {
		return yB;
	}
	public void setyB(double yB) {
		this.yB = yB;
	}
	 
}
