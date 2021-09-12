package com.bz.pro;

import java.util.Scanner;

public class DayThreepro {
			double x1,x2,y1,y2;
			public static void main(String[] args) {
				System.out.println("Welcome to Line Comparison Computation Program");
				Scanner sc=new Scanner(System.in);
			      System.out.println("enter the values:");
			      double x1=sc.nextDouble();
			      double x2=sc.nextDouble();
			      double y1=sc.nextDouble();
			      double y2=sc.nextDouble();
				double len=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
				 System.out.println("length is:"+len);
		}

	}


