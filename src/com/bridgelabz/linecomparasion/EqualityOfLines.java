package com.bridgelabz.linecomparasion;

public class EqualityOfLines {

	public static void main(String[] args) {
			int x1=1,y1=1,x2=4,y2=4;
			int p1=2,q1=2,p2=5,q2=5;
			double line1Length=calculateLineLength(x1,y1,x2,y2);
			double line2Length=calculateLineLength(p1,q1,p2,q2);
			System.out.println("Length of Two Points="+line1Length);
			System.out.println("Length of Two Points="+line2Length);
			checkEqualityOfLines(line1Length,line2Length);
		}
		public static double calculateLineLength(int x1,int y1,int x2,int y2) {
			double length=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
			return length;
		}
		public static void checkEqualityOfLines(double length1,double length2) {
			if(length1==length2) {
				System.out.println("Two Lines are Equal");
			} else {
				System.out.println("Two Lines are not Equal");
			}
		}

	}


