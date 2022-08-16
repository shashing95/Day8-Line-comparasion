package com.bridgelabz.linecomparasion;

import java.util.Scanner;

class LineAndPoints {
	private int x1,x2,y1,y2;
	public int getx1() {
		return x1;
	}
	public int getx2() {
		return x2;
	}
	public int gety1() {
		return y1;
	}
	public int gety2() {
		return y2;
	}
	public void setPoints(int x1,int x2,int y1,int y2) {
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}

public class LineComparasionWithClassMethod {

	public static void main(String[] args) {
		LineAndPoints line1=new LineAndPoints();
		LineAndPoints line2=new LineAndPoints();
		for(int i=1;i<=2;i++) {
			System.out.println("Enter coordinates for Line"+i);
			System.out.println("Enter x1 coordinate");
			int point1=getIntValue();
			System.out.println("Enter y1 coordinate");
			int point2=getIntValue();
			System.out.println("Enter x2 coordinate");
			int point3=getIntValue();
			System.out.println("Enter y2 coordinate");
			int point4=getIntValue();
			if(i==1) {
				line1.setPoints(point1,point2,point3,point4);
			}
			else {
				line2.setPoints(point1, point2, point3, point4);
			}
		}
		double length1=calculateLineLength(line1);
		System.out.println("Length of Line 1"+length1);
		double length2=calculateLineLength(line2);
		System.out.println("Length of Line2"+length2);
		checkEqualityOfLines(length1,length2);
	}
	public static int getIntValue() {
		Scanner scanner=new Scanner(System.in);
		return scanner.nextInt();
	}
	public static double calculateLineLength(LineAndPoints lp) {
		double length=Math.sqrt(Math.pow(lp.getx2()-lp.getx1(),2)+Math.pow(lp.gety2()-lp.gety1(),2));
		return length;
	}
	public static void checkEqualityOfLines(double length1,double length2) {
		if(length1==length2) {
			System.out.println("Two Lines are Equal");
		} else if(length1>length2) {
			System.out.println("Line1 is greater than Line2");
		} else {
			System.out.println("Line1 is less than Line2");
		}
	}
	}
	

	}


