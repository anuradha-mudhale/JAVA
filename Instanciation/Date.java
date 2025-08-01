
package com.java;
import java.util.Calendar;
import java.util.Scanner;

class Date1 {
	private int day;
	private int month;
	private int year;
	
	public void initDate()
	{
		Calendar c =Calendar.getInstance();
		day = c.get(Calendar.DATE);
		month = c.get(Calendar.MONTH)+1; 
		year = c.get(Calendar.YEAR);
	
	}
	public void acceptRecord()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day:");
		day = sc.nextInt();
		System.out.println("Enter Month:");
		month = sc.nextInt();
		System.out.println("Enter year:");
		year = sc.nextInt();
	}
	public void displayRecord()
	{
		System.out.printf("%d/%d/%d",day,month,year);
		System.out.println();
	}
}
	public class Date
	{
	public static void main(String[] args)
	{
		Date1 dt1 = new Date1();
		dt1.initDate();
		dt1.displayRecord();
		dt1.acceptRecord();
		dt1.displayRecord();
		dt1.initDate();
		dt1.displayRecord();
		

	}
}


