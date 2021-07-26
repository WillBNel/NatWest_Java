package com.NatWest.Results;

public class Runner {
	public static int phys;
	public static int chem;
	public static int bio;
	public static int tot;
	public static int perc;
	
	
	public static void main(String[] args) {
		phys=148;
		chem=130;
		bio=135;
		tot=phys + chem + bio;
		perc=tot * 100/450;
		
	System.out.println("Result in Physics: "+phys);
	System.out.println("Result in Chemistry: "+chem);
	System.out.println("Result in Biology: "+bio);
	System.out.println("Total: "+tot);
	System.out.println("Overall Percentage: "+perc+"%");
	}
		

}
