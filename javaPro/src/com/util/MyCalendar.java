package com.util;

public class MyCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
		public static boolean isLeapYear(int year) {
		
			return year % 4 ==0 && year % 100 !=0 ||year % 400 ==0; //&&연산자가 더 우선순위가 높다.
	}

}
