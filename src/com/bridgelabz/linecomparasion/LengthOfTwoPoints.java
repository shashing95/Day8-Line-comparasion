package com.bridgelabz.linecomparasion;

public class LengthOfTwoPoints {

	public static void main(String[] args) {
		int x1=1,y1=1,x2=4,y2=4;
		double lineLength=calculateLineLength(x1,y1,x2,y2);
		System.out.println("Length of Two Points="+lineLength);
	}
	public static double calculateLineLength(int x1,int y1,int x2,int y2) {
		double length=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		return length;
	}

	}


